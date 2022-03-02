package defpackage;

/* renamed from: aert  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aert implements aoqb {
    private final aeru a;
    private final String b;
    private final aucd c;

    public aert(aeru aeru, aucd aucd, String str) {
        this.a = aeru;
        this.c = aucd;
        this.b = str;
    }

    public final aorr a(Object obj) {
        aeru aeru = this.a;
        aucd aucd = this.c;
        String str = this.b;
        Exception exc = (Exception) obj;
        aomr a2 = aerv.a(exc);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aokd aokd = (aokd) aucd.b;
        aokd aokd2 = aokd.c;
        aokd.b = a2.a();
        aokd.a |= 8;
        ((aetj) aeru.b.a()).a((aokd) aucd.i());
        ((pia) aeru.a.a()).e("[Auth] Failed to get token with scope [%s]", str);
        if (((Boolean) pba.F.a()).booleanValue()) {
            boolean booleanValue = ((Boolean) pba.E.a()).booleanValue();
            aomr a3 = aerv.a(exc);
            if (!aerv.a.contains(a3) || (!booleanValue && a3.equals(aomr.AUTH_INTERNAL_ERROR))) {
                throw exc;
            }
            throw new aern(exc);
        }
        throw exc;
    }
}
