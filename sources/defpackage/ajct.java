package defpackage;

/* renamed from: ajct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajct extends ajgo {
    public final amsv a;
    public long b;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajct(amsv amsv, ajgd ajgd) {
        super(ajgd);
        this.a = amsv;
    }

    public final int a() {
        return !d() ? 3 : 2;
    }

    public final void b() {
    }

    public final void c() {
    }

    public final boolean d() {
        return this.b > ((Long) this.a.a()).longValue() + 10000;
    }
}
