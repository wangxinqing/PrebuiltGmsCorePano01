package defpackage;

/* renamed from: asaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asaz implements asiz {
    final /* synthetic */ asiz a;
    final /* synthetic */ asba b;

    public asaz(asba asba, asiz asiz) {
        this.b = asba;
        this.a = asiz;
    }

    public final void a() {
        Boolean bool;
        this.b.c.set(true);
        asew asew = this.b.d;
        if ((asew.a & 1) != 0) {
            bool = Boolean.valueOf(asew.b);
        } else {
            bool = null;
        }
        if (bool == null) {
            bool = false;
        }
        asba asba = this.b;
        asda asda = asba.a;
        tgh tgh = new tgh(asba.b.b.k());
        boolean booleanValue = bool.booleanValue();
        aseu a2 = aseu.a(this.b.d.c);
        if (a2 == null) {
            a2 = aseu.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
        }
        jjg jjg = asil.a;
        asdu asdu = asda.h;
        asdu.getClass();
        asda.a((asiz) null, new asdq(asdu, tgh, booleanValue, a2));
        this.a.a();
    }

    public final void b() {
        anih anih = (anih) asil.a.b();
        anih.a((Throwable) new IllegalStateException());
        ((anih) anih.a("asaz", "b", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to enable bluetooth");
        this.a.b();
    }
}
