package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: babw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class babw extends azzs {
    public final azzs a;
    public final Context b;
    public final ConnectivityManager c;
    private final Object d = new Object();
    private Runnable e;

    public babw(azzs azzs, Context context) {
        this.a = azzs;
        this.b = context;
        if (context != null) {
            this.c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    if (this.c != null) {
                        babu babu = new babu(this);
                        this.c.registerDefaultNetworkCallback(babu);
                        this.e = new babs(this, babu);
                        return;
                    }
                }
                babv babv = new babv(this);
                this.b.registerReceiver(babv, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.e = new babt(this, babv);
            } catch (SecurityException e2) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e2);
            }
        } else {
            this.c = null;
        }
    }

    private final void b() {
        synchronized (this.d) {
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
                this.e = null;
            }
        }
    }

    public final azxl a(baaj baaj, azxh azxh) {
        return this.a.a(baaj, azxh);
    }

    public final azzs c() {
        b();
        return this.a.c();
    }

    public final azzs d() {
        b();
        return this.a.d();
    }

    public final void e() {
        this.a.e();
    }

    public final void f() {
        this.a.f();
    }

    public final String a() {
        return this.a.a();
    }

    public final boolean a(TimeUnit timeUnit) {
        return this.a.a(timeUnit);
    }
}
