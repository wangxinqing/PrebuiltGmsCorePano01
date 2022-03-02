package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: jzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzk {
    public static final /* synthetic */ int d = 0;
    private static final ith e = new ith("DriveInitializer", "");
    private static jzk f;
    public final kkg a;
    public final kdf b;
    public final CountDownLatch c;

    private jzk(Context context) {
        Context applicationContext = context.getApplicationContext();
        Context applicationContext2 = applicationContext.getApplicationContext();
        synchronized (lsm.class) {
            if (lsm.a == null) {
                lsm.a = new lsm(applicationContext2);
            } else if (lsm.a.b != applicationContext2) {
                throw new IllegalStateException("attempted to initialize Singletons multiple times with different application context instances.");
            }
        }
        lsm a2 = lsm.a();
        this.a = new kkg(a2.d, a2.h, applicationContext);
        this.b = new kdf(a2);
        if (ldn.a()) {
            ldn.b();
        }
        this.c = new CountDownLatch(1);
        new jzj(this, "Background initialization thread", a2).start();
    }

    public static jzk a() {
        jzk jzk;
        synchronized (jzk.class) {
            jzk = f;
            iva.a((Object) jzk, (Object) "Must call init(Context) before calling get() for the first time");
        }
        return jzk;
    }

    public static boolean b(Context context) {
        jzk jzk;
        iva.b("Must not be called from UI thread");
        synchronized (jzk.class) {
            a(context);
            jzk = f;
        }
        return jzk.b();
    }

    public static void a(Context context) {
        synchronized (jzk.class) {
            if (f == null) {
                f = new jzk(context);
            }
        }
    }

    public final boolean b() {
        if (this.c.getCount() <= 0) {
            return false;
        }
        e.b("DriveInitializer", "Awaiting to be initialized");
        this.c.await();
        return true;
    }
}
