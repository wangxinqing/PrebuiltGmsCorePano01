package defpackage;

/* renamed from: lgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lgq extends lgo {
    private static final ith e = new ith("CustomPropertyModel", "");
    public final kkx b;
    public final String c;
    public final String d;

    public lgq(kkd kkd, kkx kkx, String str, String str2) {
        super(kkd);
        iva.a((Object) kkx);
        this.b = kkx;
        iva.a((Object) str);
        this.c = str;
        this.d = str2;
    }

    public final void a(kqi kqi) {
        if (kqi instanceof klw) {
            klw klw = (klw) kqi;
            if (klw.e.a() || klw.d != null) {
                super.a(kqi);
            } else if (!kqi.ao) {
                e.b("CustomPropertyModel", "CustomProperty created and discarded without setting value. sdkAppId: %s", klw.b);
            } else {
                super.b(kqi);
            }
        } else {
            e.c("CustomPropertyModel", "Can't save a non-CustomPropertyRow with CustomPropertyModel class.");
        }
    }
}
