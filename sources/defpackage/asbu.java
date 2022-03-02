package defpackage;

/* renamed from: asbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbu implements asiz {
    final /* synthetic */ asiz a;
    final /* synthetic */ asbv b;

    public asbu(asbv asbv, asiz asiz) {
        this.b = asbv;
        this.a = asiz;
    }

    public final void a() {
        asbv asbv = this.b;
        int i = asbv.e;
        asbv.d.set(true);
        asfh asfh = this.b.b.b;
        if (asfh == null) {
            asfh = asfh.d;
        }
        String str = asfh.b;
        byte[] k = this.b.c.b.k();
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(new tgh(k).a());
        String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        asda asda = this.b.a;
        jjg jjg = asil.a;
        asdu asdu = asda.h;
        asdu.getClass();
        asda.a((asiz) null, new asdt(asdu, str2), asda.h.l);
        this.a.a();
    }

    public final void b() {
        anih anih = (anih) asil.a.b();
        anih.a((Throwable) new IllegalStateException());
        ((anih) anih.a("asbu", "b", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to enable bluetooth");
        this.a.b();
    }
}
