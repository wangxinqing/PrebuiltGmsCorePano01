package defpackage;

/* renamed from: dsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dsf extends ppr {
    final /* synthetic */ String[] a;
    final /* synthetic */ dsh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsf(dsh dsh, aonk aonk, String str, String[] strArr) {
        super(aonk, 2, str);
        this.b = dsh;
        this.a = strArr;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        for (String c : this.a) {
            oyz c2 = this.b.a.m.c(c);
            prp prp = c2.d;
            String str = c2.b;
            synchronized (prp.g) {
                out d = prp.d(str);
                aucd aucd = (aucd) d.c(5);
                aucd.a((aucj) d);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                out.a((out) aucd.b);
                prp.a(str, (out) aucd.i());
            }
            this.b.a.a(c2);
        }
        ove h = this.b.a.n.h();
        if (h == null || !ovk.a(h)) {
            return null;
        }
        this.b.a.g();
        return null;
    }
}
