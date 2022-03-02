package defpackage;

/* renamed from: kqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqw implements kqx {
    private final kqv a;
    private final kqx b;
    private final kqx c;

    public kqw(kqv kqv, kqx kqx, kqx kqx2) {
        this.a = kqv;
        this.b = kqx;
        this.c = kqx2;
    }

    public final String a() {
        return this.b.toString() + ' ' + this.a.d + ' ' + ((krc) this.c).a();
    }

    public final String toString() {
        return a();
    }

    public final kqw a(kqv kqv, kqx kqx) {
        return new kqw(kqv, this, kqx);
    }
}
