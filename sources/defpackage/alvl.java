package defpackage;

/* renamed from: alvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvl extends alvf {
    private final alwi a = new alwi();

    public alvl() {
        super(26);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        int b = alze.b();
        long parseLong = Long.parseLong(alze.g(), 16);
        alze.g();
        String g = alze.g();
        amiw amiw = (amiw) alve.a(alze);
        int b2 = alze.b();
        String g2 = alze.g();
        return new alro(amiw, parseLong, b, g, b2, (g2 == null || g2.isEmpty()) ? null : Long.valueOf(Long.parseLong(g2, 16)));
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        alro alro = (alro) obj;
        a(alzd);
        alzd.a(alro.c);
        alzd.b(Long.toHexString(alro.b));
        alzd.b("");
        String str = alro.d;
        if (str != null) {
            alzd.b(str);
        } else {
            alzd.e();
        }
        this.a.a(alzd, alro.a);
        alzd.a(alro.e);
        Long l = alro.f;
        if (l != null) {
            alzd.b(Long.toHexString(l.longValue()));
        } else {
            alzd.e();
        }
        alzd.b();
    }
}
