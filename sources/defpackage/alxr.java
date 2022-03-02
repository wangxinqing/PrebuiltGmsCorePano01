package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: alxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxr implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        if (str.equals(b2.c)) {
            alym2.c();
            return;
        }
        amir b3 = b2.b();
        List<amjf> b4 = b3.b();
        for (amjf a : b4) {
            if (aluw.a(str, a)) {
                ArrayList arrayList = new ArrayList(b4);
                aluv.a((List) arrayList, str);
                alym2.a(aluv.a(b2.c, b3.b, (Iterable) arrayList));
                return;
            }
        }
    }
}
