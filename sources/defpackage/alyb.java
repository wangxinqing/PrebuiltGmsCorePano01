package defpackage;

/* renamed from: alyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alyb implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw amiw;
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        String str2 = b2.c;
        amit f = b.f();
        amir b3 = b2.b();
        int i = f.b;
        int i2 = f.c;
        int i3 = b3.b;
        int a = aluv.a(b3);
        if (str.equals(str2)) {
            if (i < i3) {
                i3--;
            } else {
                i += a;
            }
        }
        if (f.d.equals(str2)) {
            if (i2 <= i3) {
                i3++;
            } else {
                i2 += a;
            }
        }
        String str3 = f.d;
        if (str.equals(str3) && i == i2) {
            amiw = aluv.a();
        } else {
            amiw = aluv.a(str, i, str3, i2);
        }
        amiq c = b3.c();
        c.a = i3;
        amiw a2 = aluv.a(str2, c.a());
        alym.a(amiw);
        alym2.a(a2);
    }
}
