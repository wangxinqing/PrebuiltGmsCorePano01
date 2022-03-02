package defpackage;

/* renamed from: osa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class osa extends ppr {
    final /* synthetic */ pxl a;
    final /* synthetic */ osf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public osa(osf osf, aonk aonk, String str, pxl pxl) {
        super(aonk, str);
        this.b = osf;
        this.a = pxl;
    }

    public final void b() {
        pxl pxl = this.a;
        if (("android.intent.action.PACKAGE_REMOVED".equals(pxl.a.getAction()) && (!pxl.a.getBooleanExtra("android.intent.extra.REPLACING", false) || (axsj.c() && pxl.a.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)))) || ("android.intent.action.PACKAGE_CHANGED".equals(pxl.a.getAction()) && !pxl.d())) {
            this.b.a(this.a.c());
        } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(this.a.a.getAction())) {
            this.b.b(this.a.c());
        }
        if (this.a.b()) {
            osf osf = this.b;
            String c = this.a.c();
            osf.c.b(2);
            osf.e();
            oso.a("handlePackageUpdating %s", (Object) c);
            osf.m.f(c);
        }
        if (this.a.a()) {
            osf osf2 = this.b;
            String c2 = this.a.c();
            osf2.c.b(2);
            osf2.e();
            oso.a("handlePackageAdded %s", (Object) c2);
            if (!new ozu(osf2.m, osf2.B, osf2.g.h()).a(c2)) {
                StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 18);
                sb.append("Package ");
                sb.append(c2);
                sb.append(" not found");
                oso.b(sb.toString());
            }
            if ("com.google.android.googlequicksearchbox".equals(c2) || "com.google.android.gms".equals(c2)) {
                osf2.m.d();
            }
            if ("com.google.android.gm".equals(c2)) {
                osf2.m.e();
            }
        }
    }
}
