package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import com.google.android.gms.mdm.receivers.WifiStateChangedReceiver;
import java.util.concurrent.CountDownLatch;

/* renamed from: aaum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaum {
    static int a = 0;
    public static boolean b = false;
    static volatile aaur c;
    static CountDownLatch d;
    private static final BroadcastReceiver e = new WifiStateChangedReceiver();
    private static boolean f = false;
    private static Context g = null;

    static {
        aaum.class.getSimpleName();
    }

    aaum() {
    }

    static synchronized void a() {
        synchronized (aaum.class) {
            d();
        }
    }

    public static synchronized void b() {
        synchronized (aaum.class) {
            b = false;
            if (a <= 0) {
                d();
            }
        }
    }

    static synchronized void c() {
        synchronized (aaum.class) {
            a++;
        }
    }

    private static void d() {
        int i = a - 1;
        a = i;
        if (i <= 0 && !b && c != null) {
            try {
                aaur aaur = c;
                if (aaur.b()) {
                    for (int i2 = 0; i2 < aaur.k.size(); i2++) {
                        aaun aaun = (aaun) aaur.k.valueAt(i2);
                        if (aaun != null) {
                            aaun.a();
                        }
                    }
                }
            } catch (IllegalStateException e2) {
            }
            c = null;
            d = null;
            a = 0;
        }
        if (a <= 0 && f) {
            f = false;
            Context context = g;
            if (context != null) {
                try {
                    context.unregisterReceiver(e);
                } catch (IllegalArgumentException e3) {
                }
                g = null;
            }
        }
    }

    static synchronized void a(Context context) {
        synchronized (aaum.class) {
            if (azfv.i()) {
                aaal aaal = new aaal(context);
                if (!f && aaal.a()) {
                    HandlerThread handlerThread = new HandlerThread("safety-net-callback");
                    handlerThread.start();
                    qvr qvr = new qvr(handlerThread.getLooper());
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                    context.registerReceiver(e, intentFilter, (String) null, qvr);
                    f = true;
                    g = context.getApplicationContext();
                }
            }
        }
    }

    static void b(Context context) {
        if (c == null) {
            synchronized (aaum.class) {
                if (c == null) {
                    if (d == null) {
                        d = new CountDownLatch(1);
                    }
                    jfz jfz = new jfz(25, 9);
                    c = new aaur(context, new aavc(context, jfz), jfz);
                }
            }
        }
    }
}
