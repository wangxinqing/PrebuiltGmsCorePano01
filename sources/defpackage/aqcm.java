package defpackage;

/* renamed from: aqcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqcm extends babm {
    private final Object a = new Object();
    private boolean b;
    private long c;
    private long d;
    private final aqcl e;

    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this.a) {
            if (!this.b) {
                aqcl aqcl = this.e;
                long j = this.c;
                boolean z4 = false;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.a(z, (Object) "Cannot record negative request bytes.");
                if (aqcl.j.getAndSet(j) == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                amrl.b(z2, (Object) "Already recorded request bytes.");
                aqcl aqcl2 = this.e;
                long j2 = this.d;
                if (j2 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                amrl.a(z3, (Object) "Cannot record negative response bytes.");
                if (aqcl2.k.getAndSet(j2) == -1) {
                    z4 = true;
                }
                amrl.b(z4, (Object) "Already recorded response bytes.");
                this.b = true;
            }
        }
    }

    public final void b(long j) {
        synchronized (this.a) {
            this.d += j;
        }
    }

    public aqcm(aqcl aqcl) {
        this.e = aqcl;
    }

    public final void a(long j) {
        synchronized (this.a) {
            this.c += j;
        }
    }
}
