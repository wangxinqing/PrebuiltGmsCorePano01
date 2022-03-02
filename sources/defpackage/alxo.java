package defpackage;

import java.util.List;

/* renamed from: alxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxo implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw amiw;
        amiw b = alym.b();
        amiw b2 = alym2.b();
        if (b.c.equals(b2.c)) {
            amik c = alym.b().c();
            amjl d = alym2.b().d();
            int i = d.b;
            int a = d.a();
            int i2 = (i + a) - 1;
            int i3 = c.b;
            int i4 = c.c - i3;
            int i5 = (i3 + i4) - 1;
            List b3 = d.b();
            amiw amiw2 = null;
            if (i3 > i) {
                amiw = aluv.b(b2.c, i, b3.subList(0, a - Math.max(0, (i2 - i3) + 1)));
            } else {
                amiw = null;
            }
            if (i5 < i2) {
                int max = Math.max(0, (i5 - i) + 1);
                amiw2 = aluv.b(b2.c, i - (i4 - max), b3.subList(max, a));
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
