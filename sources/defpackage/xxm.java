package defpackage;

import java.util.List;

/* renamed from: xxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxm {
    public final xwv a;
    public final xvw b;
    public final yaz c;
    public final xyg d;
    public final xvp e;
    private final xyp f;
    private final amri g;

    public xxm(xyp xyp, xwv xwv, xvw xvw, yaz yaz, amri amri, xyg xyg, xvp xvp) {
        this.f = xyp;
        this.a = xwv;
        this.b = xvw;
        this.c = yaz;
        this.g = amri;
        this.d = xyg;
        this.e = xvp;
        xip.a();
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yad yad = (yad) list.get(i);
            this.f.a((xvs) yad.a, (xvs) yad.b);
            this.b.a();
        }
        this.b.b();
        if (this.g.a() && ((Boolean) xgm.a.a()).booleanValue()) {
            ((xxj) this.g.b()).e(list.size());
        }
    }

    public final void a(xwu xwu) {
        if (!xwu.a.isEmpty()) {
            a(xwu.a);
            return;
        }
        ((ybh) this.c).a.stats.numIoExceptions++;
        this.c.a(xjo.CONTACT, xnd.INSERT, "BULK_INSERT_PARTIAL_FAILURE", (Exception) null);
        this.c.a(xnd.INSERT, xjo.CONTACT, false, 2, 1);
    }
}
