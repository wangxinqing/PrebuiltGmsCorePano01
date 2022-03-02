package defpackage;

/* renamed from: alyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alyc implements alyg {
    private final boolean a;

    public alyc(boolean z) {
        this.a = z;
    }

    private static final int a(String str, amit amit, amit amit2, boolean z) {
        int i;
        int i2;
        int i3 = amit.c;
        if (amit.d.equals(amit2.d) && ((i = amit2.c) < (i2 = amit.c) || (!z && i == i2))) {
            i3++;
        }
        return (!amit.d.equals(str) || amit2.b >= amit.c) ? i3 : i3 - 1;
    }

    private static final int a(String str, String str2, amit amit, amit amit2) {
        int i = amit.b;
        if (str.equals(amit2.d) && amit2.c <= amit.b) {
            i++;
        }
        return (!str.equals(str2) || amit2.b >= amit.b) ? i : i - 1;
    }

    private static final amiw a(String str, int i, String str2, int i2) {
        if (str.equals(str2) && i == i2) {
            return aluv.a();
        }
        return aluv.a(str, i, str2, i2);
    }

    public final void a(alym alym, alym alym2) {
        alym alym3;
        boolean z = this.a;
        if (!z) {
            alym3 = alym2;
        } else {
            alym3 = alym;
        }
        if (z) {
            alym = alym2;
        }
        amiw b = alym.b();
        amiw b2 = alym3.b();
        String str = b.c;
        String str2 = b2.c;
        amit f = alym.b().f();
        amit f2 = alym3.b().f();
        if (!str.equals(str2) || f.b != f2.b) {
            amiw a2 = a(str, a(str, str2, f, f2), f.d, a(str2, f, f2, false));
            amiw a3 = a(str2, a(str2, str, f2, f), f2.d, a(str, f2, f, true));
            alym.a(a2);
            alym3.a(a3);
            return;
        }
        int i = f.c;
        if (str2.equals(f.d) && f2.b < f.c) {
            i--;
        }
        amiw a4 = aluv.a();
        amiw a5 = a(f.d, i, f2.d, a(str, f2, f, true));
        alym.a(a4);
        alym3.a(a5);
    }
}
