package defpackage;

/* renamed from: alxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxy implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw amiw;
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        String str2 = b2.c;
        if (str.equals(str2)) {
            amir b3 = b.b();
            amjl d = b2.d();
            int i = d.b;
            int a = d.a();
            int i2 = (i + a) - 1;
            int a2 = aluv.a(b3);
            int i3 = b3.b;
            int i4 = d.b;
            if (i3 <= i4) {
                amiw = aluv.b(str2, i4 + a2, d.b());
            } else if (i3 <= i2) {
                int i5 = i3 - i;
                amiw b4 = aluv.b(str2, i4, d.b().subList(0, i5));
                amiw b5 = aluv.b(str2, d.b + i5 + a2, d.b().subList(i5, a));
                amid b6 = amie.b();
                b6.a(b4);
                b6.a(b5);
                amiw = aluv.a(b6.b());
            } else {
                amiw = alym2.b();
            }
            alym2.a(amiw);
        }
    }
}
