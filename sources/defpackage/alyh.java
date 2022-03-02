package defpackage;

import java.util.List;

/* renamed from: alyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alyh implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw amiw;
        amiw b = alym.b();
        amiw b2 = alym2.b();
        if (b.c.equals(b2.c)) {
            amjl d = b.d();
            amjl d2 = b2.d();
            int a = d.a();
            int i = d.b;
            int i2 = (a + i) - 1;
            int a2 = d2.a();
            int i3 = d2.b;
            int i4 = (i3 + a2) - 1;
            List b3 = d2.b();
            amiw amiw2 = null;
            if (i3 < i) {
                amiw = aluv.b(b2.c, i3, b3.subList(0, a2 - Math.max(0, (i4 - i) + 1)));
            } else {
                amiw = null;
            }
            if (i4 > i2) {
                int max = Math.max(0, (i2 - i3) + 1);
                amiw2 = aluv.b(b2.c, i3 + max, b3.subList(max, a2));
            }
            if (amiw != null && amiw2 != null) {
                amid b4 = amie.b();
                b4.a(amiw);
                b4.a(amiw2);
                amiw = aluv.a(b4.b());
            } else if (amiw == null) {
                amiw = amiw2 == null ? aluv.a() : amiw2;
            }
            alym2.a(amiw);
        }
    }
}
