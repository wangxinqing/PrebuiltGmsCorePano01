package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: alyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alyd implements alyg {
    private static final amiw a(String str, int i, List list) {
        if (list.isEmpty()) {
            return aluv.a();
        }
        return aluv.b(str, i, list);
    }

    public final void a(alym alym, alym alym2) {
        int i;
        int i2;
        int i3;
        int i4;
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        String str2 = b2.c;
        amit f = b.f();
        String str3 = f.d;
        if (str.equals(str2) || str3.equals(str2)) {
            amjl d = b2.d();
            if (!str.equals(str2) || !f.d.equals(str2) || (i = f.b) < (i2 = d.b) || i >= i2 + d.a() || (i3 = f.c) <= (i4 = d.b) || i3 >= i4 + d.a()) {
                int i5 = d.b;
                List arrayList = new ArrayList(d.b());
                amiw a = aluv.a();
                if (str.equals(str2)) {
                    int i6 = f.b;
                    int i7 = d.b;
                    if (i6 >= i7 && i6 < i7 + d.a()) {
                        a = aluv.b(f.d, aluv.a(b), Collections.singletonList((amjf) arrayList.remove(f.b - d.b)));
                    } else if (f.b < d.b) {
                        i5--;
                    }
                }
                if (f.d.equals(str2)) {
                    int i8 = f.c;
                    int i9 = d.b;
                    if (i8 > i9 && i8 < i9 + d.a()) {
                        int i10 = f.c - d.b;
                        a = a(str2, aluv.a(b) + 1, arrayList.subList(i10, arrayList.size()));
                        arrayList = arrayList.subList(0, i10);
                    } else if (f.c <= d.b) {
                        i5++;
                    }
                }
                amiw a2 = a(str2, i5, arrayList);
                if (a.b == amiv.KIND_NOT_SET) {
                    a = a2;
                } else if (a2.b != amiv.KIND_NOT_SET) {
                    amid b3 = amie.b();
                    b3.a(a2);
                    b3.a(a);
                    a = aluv.a(b3.b());
                }
                alym2.a(a);
                return;
            }
            int i11 = f.b;
            int i12 = d.b;
            int i13 = i11 - i12;
            int i14 = f.c - i12;
            if (i14 > i13) {
                i14--;
            }
            ArrayList arrayList2 = new ArrayList(d.b());
            arrayList2.add(i14, (amjf) arrayList2.remove(i13));
            alym2.a(a(str2, d.b, arrayList2));
        }
    }
}
