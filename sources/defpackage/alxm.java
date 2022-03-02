package defpackage;

/* renamed from: alxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxm implements alyg {
    public final void a(alym alym, alym alym2) {
        amiw b = alym.b();
        amiw b2 = alym2.b();
        String str = b.c;
        String str2 = b2.c;
        amik c = b.c();
        amip g = b2.g();
        int i = g.c;
        if (str.equals(g.b)) {
            if (g.d == amii.SHIFT_AFTER_DELETE) {
                i = alyi.a(i, c);
            } else {
                i = alsq.a(i, c, g.d, 2);
            }
        }
        amio a = g.a();
        a.b = i;
        alym2.a(aluv.a(str2, a.a()));
    }
}
