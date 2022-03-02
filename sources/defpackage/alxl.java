package defpackage;

/* renamed from: alxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxl implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        String str2 = b2.c;
        if (str.equals(str2)) {
            amik c = alym.b().c();
            amik c2 = alym2.b().c();
            int i = c.b;
            int i2 = c.c;
            int a = alyi.a(i, c2);
            int a2 = alyi.a(i2, c2);
            if (a < a2) {
                alym.a(aluv.a(str, a, a2));
            } else {
                alym.a(aluv.a());
            }
            int i3 = c2.b;
            int i4 = c2.c;
            int a3 = alyi.a(i3, c);
            int a4 = alyi.a(i4, c);
            if (a3 < a4) {
                alym2.a(aluv.a(str2, a3, a4));
            } else {
                alym2.a(aluv.a());
            }
        }
    }
}
