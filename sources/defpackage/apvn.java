package defpackage;

/* renamed from: apvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvn implements apth {
    public String a;
    public String b;
    public long c;
    public boolean d;
    public String e;
    public String f;
    public long g;
    public String h;

    public final auef a() {
        return (auef) alne.j.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof alne) {
            alne alne = (alne) audx;
            this.a = jlh.b(alne.a);
            this.b = jlh.b(alne.b);
            this.c = alne.c;
            jlh.b(alne.d);
            this.d = alne.e;
            this.e = jlh.b(alne.f);
            this.f = jlh.b(alne.g);
            this.g = alne.h;
            this.h = alne.i;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of verifyPhoneNumberResponse.");
    }
}
