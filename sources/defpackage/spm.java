package defpackage;

import android.os.Handler;

/* renamed from: spm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class spm {
    private static volatile Handler c;
    public volatile long a;
    private final swn b;
    private final Runnable d;

    public spm(swn swn) {
        iva.a((Object) swn);
        this.b = swn;
        this.d = new spl(this, swn);
    }

    private final Handler d() {
        Handler handler;
        if (c != null) {
            return c;
        }
        synchronized (spm.class) {
            if (c == null) {
                c = new qvr(((svv) this.b).a.getMainLooper());
            }
            handler = c;
        }
        return handler;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            jiq jiq = ((svv) this.b).l;
            this.a = System.currentTimeMillis();
            if (!d().postDelayed(this.d, j)) {
                this.b.E().c.a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean b() {
        return this.a != 0;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.a = 0;
        d().removeCallbacks(this.d);
    }
}
