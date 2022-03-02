package defpackage;

/* renamed from: alxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxx implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        String str2 = b2.c;
        if (str.equals(str2)) {
            amir b3 = b.b();
            amir b4 = b2.b();
            int a = alyi.a(b3.b, b4, false);
            if (a != b3.b) {
                amiq c = b3.c();
                c.a = a;
                alym.a(aluv.a(str, c.a()));
            }
            int a2 = alyi.a(b4.b, b3, true);
            if (a2 != b4.b) {
                amiq c2 = b4.c();
                c2.a = a2;
                alym2.a(aluv.a(str2, c2.a()));
            }
        }
    }
}
