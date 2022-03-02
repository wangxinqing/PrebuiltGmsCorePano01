package defpackage;

/* renamed from: alxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxz implements alyg {
    private static final amiw a(String str, int i, int i2) {
        if (i2 != 0) {
            return aluv.a(str, i, i2 + i);
        }
        return aluv.a();
    }

    private static final amiw b(String str, int i, String str2, int i2) {
        if (str.equals(str2)) {
            return a(str, i, 1);
        }
        amid b = amie.b();
        b.a(a(str, i, str2, i2));
        b.a(a(str2, i2, 1));
        return aluv.a(b.b());
    }

    private static final amiw a(String str, int i, String str2, int i2) {
        if (i == -1 || (str.equals(str2) && i == i2)) {
            return aluv.a();
        }
        return aluv.a(str, i, str2, i2);
    }

    public final void a(alym alym, alym alym2) {
        amiw amiw;
        alym alym3 = alym;
        amiw b = alym.b();
        amiw b2 = alym2.b();
        amit f = b.f();
        amik c = b2.c();
        String str = b.c;
        String str2 = f.d;
        String str3 = b2.c;
        int i = f.b;
        int i2 = f.c;
        int i3 = c.b;
        int i4 = c.c - i3;
        int i5 = -1;
        int i6 = (i3 + i4) - 1;
        if (!str.equals(str3) || !str2.equals(str3) || i < i3 || i > i6 || i2 < i3 || i2 > i6) {
            if (str.equals(str3)) {
                if (f.b < c.b) {
                    i3--;
                } else if (i >= i3 && i <= i6) {
                    i4--;
                    i5 = aluv.a(b);
                    i = -1;
                } else {
                    i -= i4;
                }
            }
            boolean z = false;
            if (str2.equals(str3)) {
                int i7 = c.b;
                if (i2 <= i7) {
                    i3++;
                } else if (i2 > i6) {
                    i2 -= i4;
                    i5 -= i4;
                } else {
                    i4++;
                    z = true;
                    i2 = i7;
                }
            }
            if (!z) {
                amiw = a(str, i, str2, i2);
            } else {
                amiw = b(str, i, str2, i2);
            }
            amiw a = a(str3, i3, i4);
            if (i5 >= 0) {
                amid b3 = amie.b();
                b3.a(a);
                b3.a(b(str2, i5, str, f.b));
                a = aluv.a(b3.b());
            }
            alym3.a(amiw);
            alym2.a(a);
            return;
        }
        alym3.a(aluv.a());
    }
}
