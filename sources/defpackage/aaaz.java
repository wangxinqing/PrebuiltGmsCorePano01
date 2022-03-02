package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;

/* renamed from: aaaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaaz {
    private static final qyj c = new qyj(aaaw.a);
    public final aabi a;
    public final Executor b;
    private final njy d;

    public aaaz(Context context, aabi aabi, Executor executor, nsh nsh) {
        this.a = aabi;
        this.b = executor;
        if (axcf.b()) {
            this.d = new njy((Class) getClass(), 16, "NetworkScheduler", "scheduler");
        } else {
            this.d = new njy((Class) getClass(), 16, "scheduler");
        }
        amrl.a(aekv.b(context));
        executor.execute(new aaax(1, aabi, nxn.CAUSE_UNKNOWN, (aabq) null, (qyl) null, (qvz) null, (Uri) null, -1));
        nsh.a(aabi.b(), executor);
    }

    public static aaay a(Context context) {
        int b2 = (int) axmd.b();
        int k = (int) axmd.a.a().k();
        int f = (int) axmd.a.a().f();
        int g = (int) axmd.a.a().g();
        if (b2 == k && f == g) {
            return new aaay(b2, f);
        }
        return jiy.a(context) == 0 ? new aaay(b2, f) : new aaay(k, g);
    }

    public static void b() {
        aaaz aaaz = aabg.a().a;
        if (aaaz != null) {
            amky b2 = aaaz.d.b("onGcmUpstreamMessage");
            try {
                aaaz.b.execute(amll.a((Runnable) aaax.b(aaaz.a, nxn.CLOUD_MESSAGE_SENT)));
                if (b2 != null) {
                    b2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    public static void c() {
        aaaz aaaz = aabg.a().a;
        if (aaaz != null) {
            amky b2 = aaaz.d.b("onGcmDownstreamMessage");
            try {
                aaaz.b.execute(amll.a((Runnable) aaax.b(aaaz.a, nxn.CLOUD_MESSAGE_RECEIVED)));
                if (b2 != null) {
                    b2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    public static void b(Context context) {
        if (aabg.a().a != null) {
            a();
        } else if (nqw.d() != 0) {
            Intent intent = new Intent("com.google.android.gms.gcm.ACTION_HTTP_OK");
            intent.setPackage(context.getPackageName());
            nqw.a(context, 0, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", (BroadcastReceiver) null, (Handler) null);
        }
    }

    public static void a() {
        aaaz aaaz = aabg.a().a;
        if (aaaz != null) {
            amky b2 = aaaz.d.b("onGoogleHttpClientResponseImpl");
            try {
                aaaz.b.execute(amll.a((Runnable) aaax.b(aaaz.a, nxn.GOOGLE_HTTP_CLIENT)));
                if (b2 != null) {
                    b2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    public static boolean b(aabq aabq) {
        int i;
        int m = (int) axlu.a.a().m();
        if (!aabq.o() && m > 0) {
            try {
                i = aabq.j().a(aabg.a().c, 0).targetSdkVersion;
            } catch (PackageManager.NameNotFoundException e) {
                i = 0;
            }
            if (i >= m) {
                String str = aabq.j().a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 206);
                sb.append("The Firebase Job Dispatcher and GmsTaskScheduler are deprecated for apps targeting API ");
                sb.append(m);
                sb.append(" or newer. Application ");
                sb.append(str);
                sb.append(" has targetSdkVersion ");
                sb.append(i);
                sb.append(". Please migrate to the WorkManager or JobScheduler.");
                Log.w("NetworkScheduler", sb.toString());
                return false;
            }
        }
        return c.a(aabq.r());
    }

    public final void a(aabq aabq) {
        this.b.execute(new aaax(2, this.a, nxn.CAUSE_UNKNOWN, aabq, (qyl) null, (qvz) null, (Uri) null, -1));
    }

    public final void a(qyl qyl) {
        this.b.execute(new aaax(4, this.a, nxn.CAUSE_UNKNOWN, (aabq) null, qyl, (qvz) null, (Uri) null, -1));
    }
}
