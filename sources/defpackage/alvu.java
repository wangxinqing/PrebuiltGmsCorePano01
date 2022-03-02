package defpackage;

/* renamed from: alvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvu extends alvf {
    public alvu() {
        super(25);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        amii amii;
        String g = alze.g();
        String g2 = alze.g();
        if (g2 == null) {
            g2 = "";
        }
        int b = alze.b();
        boolean e = alze.e();
        alze.a();
        alze.a();
        Object a = alze.a((alzf) alzc.a);
        if (a != null) {
            amii = amii.a(((Integer) a).intValue());
        } else {
            amii = alut.a(e);
        }
        return aluv.a(g, g2, b, amii);
    }

    public final void a(alzd alzd, amiw amiw) {
        boolean z;
        amip g = amiw.g();
        if (g.d == amii.SHIFT_TO_INVALID) {
            z = true;
        } else {
            z = false;
        }
        a(alzd);
        alzd.b(amiw.c);
        alzd.b(g.b);
        alzd.a(g.c);
        alzd.a(z);
        alzd.a(0);
        alzd.b("");
        alzd.a(g.d.e);
        alzd.b();
    }
}
