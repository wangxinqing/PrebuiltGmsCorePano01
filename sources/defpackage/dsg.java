package defpackage;

/* renamed from: dsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dsg extends ppr {
    final /* synthetic */ String[] a;
    final /* synthetic */ dsh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsg(dsh dsh, aonk aonk, String str, String[] strArr) {
        super(aonk, 2, str);
        this.b = dsh;
        this.a = strArr;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        for (String d : this.a) {
            oyz d2 = this.b.a.m.d(d);
            if (d2 != null) {
                prp prp = d2.d;
                String str = d2.b;
                synchronized (prp.g) {
                    out d3 = prp.d(str);
                    aucd aucd = (aucd) d3.c(5);
                    aucd.a((aucj) d3);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    out out = (out) aucd.b;
                    out out2 = out.n;
                    out.a &= -3;
                    out.c = false;
                    prp.a(str, (out) aucd.i());
                }
            }
        }
        return null;
    }
}
