package defpackage;

/* renamed from: alya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alya implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        String str2 = b2.c;
        amit f = b.f();
        amip g = b2.g();
        int i = f.b;
        int i2 = f.c;
        int i3 = g.c;
        String str3 = g.b;
        boolean z = false;
        if (str.equals(str3)) {
            if (i < i3) {
                i3--;
            } else if (i == i3) {
                str3 = f.d;
                i3 = aluv.a(b);
                z = true;
            }
        }
        if (f.d.equals(str3) && !z && i2 <= g.c) {
            i3++;
        }
        if (i3 != g.c || !str3.equals(g.b)) {
            alym2.a(aluv.a(str2, str3, i3, g.d));
        }
    }
}
