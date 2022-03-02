package defpackage;

import java.util.List;

/* renamed from: alxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxt implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        if (str.equals(b2.c)) {
            alym2.c();
            return;
        }
        amjl d = alym2.b().d();
        List b3 = d.b();
        int i = d.b;
        int size = b3.size();
        amid amid = null;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (aluw.a(str, (amjf) b3.get(i3))) {
                if (amid == null) {
                    amid = amie.b();
                }
                if (i3 > i2) {
                    amid.a(aluv.b(b2.c, i + i2, b3.subList(i2, i3)));
                }
                int i4 = i + i3;
                amid.a(aluv.a(b2.c, i4, i4 + 1));
                i2 = i3 + 1;
                i--;
            }
        }
        if (amid != null) {
            if (i2 < size) {
                amid.a(aluv.b(b2.c, i + i2, b3.subList(i2, size)));
            }
            alym2.a(aluv.a(amid));
        }
    }
}
