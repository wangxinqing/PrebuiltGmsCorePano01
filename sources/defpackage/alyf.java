package defpackage;

/* renamed from: alyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alyf implements alyg {
    private final alyo a;

    public alyf(alyo alyo) {
        this.a = alyo;
    }

    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        amiv amiv = b.b;
        amiv amiv2 = amiv.COMPOUND;
        amiv amiv3 = b2.b;
        amiv amiv4 = amiv.COMPOUND;
        if (amiv != amiv2) {
            alye alye = new alye(b2.h());
            alyo alyo = this.a;
            while (alye.b() != null) {
                alyo.a(alym, (alym) alye);
                alye.d();
            }
            if (alye.a) {
                alym2.a(aluv.a(alye.a()));
            }
        } else if (amiv3 == amiv4) {
            alye alye2 = new alye(b.h());
            alye alye3 = new alye(b2.h());
            alyo alyo2 = this.a;
            while (alye2.b() != null) {
                while (alye3.b() != null) {
                    alyo2.a((alym) alye2, (alym) alye3);
                    alye3.d();
                }
                alye3.e();
                alye2.d();
            }
            if (alye2.a) {
                alym.a(aluv.a(alye2.a()));
            }
            if (alye3.a) {
                alym2.a(aluv.a(alye3.a()));
            }
        } else {
            alye alye4 = new alye(b.h());
            this.a.a((alyl) alye4, alym2);
            if (alye4.a) {
                alym.a(aluv.a(alye4.a()));
            }
        }
    }
}
