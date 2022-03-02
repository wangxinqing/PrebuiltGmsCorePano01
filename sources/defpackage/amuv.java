package defpackage;

/* renamed from: amuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amuv extends amuw {
    volatile long a = Long.MAX_VALUE;
    amvp b = amvo.i();
    amvp c = amvo.i();
    volatile long d = Long.MAX_VALUE;
    amvp e = amvo.i();
    amvp f = amvo.i();

    public amuv(Object obj, int i, amvp amvp) {
        super(obj, i, amvp);
    }

    public final void a(long j) {
        this.a = j;
    }

    public final void a(amvp amvp) {
        this.b = amvp;
    }

    public final void b(long j) {
        this.d = j;
    }

    public final void b(amvp amvp) {
        this.c = amvp;
    }

    public final void c(amvp amvp) {
        this.e = amvp;
    }

    public final void d(amvp amvp) {
        this.f = amvp;
    }

    public final long e() {
        return this.a;
    }

    public final amvp f() {
        return this.b;
    }

    public final amvp g() {
        return this.c;
    }

    public final long h() {
        return this.d;
    }

    public final amvp i() {
        return this.e;
    }

    public final amvp j() {
        return this.f;
    }
}
