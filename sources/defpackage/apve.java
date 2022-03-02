package defpackage;

/* renamed from: apve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apve implements apth {
    public String a;

    public final auef a() {
        return (auef) almw.c.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        auhv auhv;
        if (audx instanceof almw) {
            almw almw = (almw) audx;
            if (almw.a == 1) {
                auhv = (auhv) almw.b;
            } else {
                auhv = auhv.b;
            }
            this.a = jlh.b(auhv.a);
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of StartMfaSignInResponse.");
    }
}
