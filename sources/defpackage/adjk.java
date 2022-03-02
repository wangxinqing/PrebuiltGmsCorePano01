package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.EventLog;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: adjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjk {
    public static Context a = null;
    public static adii b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static final Object e = new Object();
    public static final BlockingQueue f = new LinkedBlockingQueue();
    public static AsyncTask g = null;
    public static int h;
    public static boolean i;
    public static final Object j = new Object();
    static final ServiceConnection k = new adjh("ota");
    public static final Runnable l = new adji();

    static {
        wkg.a();
        jli.a("ro.build.ab_update", "").equals("true");
    }

    public static void a(Context context) {
        a(context, (Runnable) null, "");
    }

    public static void b() {
        Log.i("SystemUpdateClient", "Disconnect ChimeraSystemUpdateService connection.");
        synchronized (e) {
            if (c) {
                jca.a().a(a, k);
                d = false;
                c = false;
                b = null;
                f.clear();
                return;
            }
            Log.w("SystemUpdateClient", "attempt to disconnect() when not connected");
        }
    }

    public static void c() {
        if (!a()) {
            throw new RemoteException("No connection to the ChimeraSystemUpdateService.");
        }
    }

    public static int d() {
        int b2;
        synchronized (e) {
            c();
            b2 = b.b();
        }
        return b2;
    }

    public static int e() {
        int d2;
        synchronized (e) {
            c();
            d2 = b.d();
        }
        return d2;
    }

    public static void f() {
        Log.i("SystemUpdateClient", "Cancelling RefreshTask.");
        synchronized (j) {
            if (g != null) {
                g.cancel(true);
                g = null;
            }
        }
    }

    public static String g() {
        return (String) adke.a.a();
    }

    public static String h() {
        return ayox.g();
    }

    public static String i() {
        return (String) adke.c.a();
    }

    public static String j() {
        return (String) adke.d.a();
    }

    public static boolean k() {
        String str = (String) adke.g.a();
        return str != null && !str.isEmpty();
    }

    public static void l() {
        synchronized (e) {
            try {
                c();
                b.e();
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Failed to reset the update: ");
                sb.append(valueOf);
                Log.e("SystemUpdateClient", sb.toString());
            }
        }
    }

    public static void m() {
        EventLog.writeEvent(201002, "download");
        synchronized (e) {
            c();
            b.a(false);
        }
    }

    public static void a(Context context, int i2, boolean z) {
        Intent intent = new Intent("android.server.checkin.CHECKIN");
        intent.putExtra("force", true);
        if (z) {
            intent.putExtra("fetchSystemUpdates", true);
        }
        if (i2 >= 0) {
            intent.putExtra("CheckinService_onStart_checkinReason", i2);
        }
        context.sendBroadcast(intent);
    }

    public static void c(Context context) {
        a(context, 17, false);
    }

    public static void b(Context context) {
        a(context, -1, true);
    }

    public static void a(Context context, Runnable runnable, String str) {
        Log.i("SystemUpdateClient", str.length() == 0 ? new String("connecting to ChimeraSystemUpdateService from:") : "connecting to ChimeraSystemUpdateService from:".concat(str));
        synchronized (e) {
            if (d) {
                Log.i("SystemUpdateClient", str.length() == 0 ? new String("Already bound to ChimeraSystemUpdateService when connecting from:") : "Already bound to ChimeraSystemUpdateService when connecting from:".concat(str));
                if (!c) {
                    if (runnable != null) {
                        f.add(runnable);
                    }
                }
            } else {
                a = context.getApplicationContext();
                if (runnable != null) {
                    f.add(runnable);
                }
                Intent intent = new Intent("com.google.android.gms.update.START_SERVICE");
                intent.setPackage("com.google.android.gms");
                boolean a2 = jca.a().a(a, intent, k, 1);
                d = a2;
                if (!a2) {
                    Log.w("SystemUpdateClient", "bindService returned false; the connection might never succeed.");
                }
            }
        }
    }

    public static void b(Context context, Runnable runnable, String str) {
        boolean z;
        synchronized (e) {
            if (!c) {
                a(context, runnable, str);
                z = false;
            } else {
                z = true;
            }
        }
        if (z && runnable != null) {
            runnable.run();
        }
    }

    public static void b(boolean z) {
        EventLog.writeEvent(!z ? 201002 : 201001, "install");
        synchronized (e) {
            c();
            b.b(true);
        }
    }

    public static void a(Context context, String str) {
        a(context, (Runnable) null, str);
    }

    public static void a(boolean z) {
        synchronized (e) {
            try {
                c();
                b.c(z);
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Failed to set IsActivityUp: ");
                sb.append(valueOf);
                Log.e("SystemUpdateClient", sb.toString());
            }
        }
    }

    public static boolean a() {
        boolean z;
        synchronized (e) {
            z = c;
        }
        return z;
    }
}
