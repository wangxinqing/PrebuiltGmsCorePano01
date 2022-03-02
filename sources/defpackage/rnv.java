package defpackage;

/* renamed from: rnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rnv implements rng {
    private final rny a;

    public rnv(rny rny) {
        this.a = rny;
    }

    public final void a(int i, int i2) {
        rny rny = this.a;
        synchronized (rny.c) {
            rny.g = rns.a(i2);
            rny.c();
            if (i == 0 && i2 != 0) {
                rny.b("passive", true);
                rny.b("fused", true);
            } else if (i != 0 && i2 == 0) {
                rny.b("passive", false);
                rny.b("fused", false);
            }
        }
    }
}
