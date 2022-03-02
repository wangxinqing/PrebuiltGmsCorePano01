package defpackage;

import android.os.Handler;

/* renamed from: dnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class dnb {
    private static volatile Handler a;
    public final dmd b;
    public final Runnable c = new dna(this);
    public volatile long d;

    public dnb(dmd dmd) {
        iva.a((Object) dmd);
        this.b = dmd;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            jiq jiq = this.b.c;
            this.d = System.currentTimeMillis();
            if (!d().postDelayed(this.c, j)) {
                this.b.a().e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean b() {
        return this.d != 0;
    }

    public final void c() {
        this.d = 0;
        d().removeCallbacks(this.c);
    }

    public final Handler d() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (dnb.class) {
            if (a == null) {
                a = new qvr(this.b.a.getMainLooper());
            }
            handler = a;
        }
        return handler;
    }
}
