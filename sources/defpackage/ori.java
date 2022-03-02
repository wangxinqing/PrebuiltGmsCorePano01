package defpackage;

/* renamed from: ori  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ori extends ppr {
    final /* synthetic */ osf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ori(osf osf, aonk aonk) {
        super(aonk);
        this.a = osf;
    }

    public final void b() {
        String str;
        osf osf = this.a;
        if (pba.b() != osf.g.b.getBoolean("enabled-appdatasearch-corpora-with-whitelist", false)) {
            if (!pba.b()) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            oso.a("Need to reparse resources because appdataseach corpora with whitelist was %s.", (Object) str);
            new ozu(osf.m, osf.B, osf.g.h()).a(true);
            prp prp = osf.g;
            prp.b.edit().putBoolean("enabled-appdatasearch-corpora-with-whitelist", pba.b()).commit();
        }
        osf.m.d();
        if (axsd.c() && ((Boolean) ozx.aX.c()).booleanValue()) {
            ppk.a.a(osf.b, 3, 0);
        }
    }
}
