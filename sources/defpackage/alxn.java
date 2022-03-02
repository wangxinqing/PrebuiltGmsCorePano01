package defpackage;

/* renamed from: alxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxn implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        amik c = alym.b().c();
        amir b3 = alym2.b().b();
        if (b.c.equals(b2.c)) {
            int i = b3.b;
            if (i <= c.b || i >= c.c) {
                int a = alyi.a(i, c);
                amiq c2 = b3.c();
                c2.a = a;
                alym2.a(aluv.a(b2.c, c2.a()));
            } else {
                alym2.a(aluv.a());
            }
            int i2 = c.c;
            int a2 = alyi.a(c.b, b3, true);
            int a3 = alyi.a(i2, b3, false);
            amij a4 = c.a();
            a4.a = a2;
            a4.b = a3;
            alym.a(aluv.a(b.c, a4.a()));
        }
    }
}
