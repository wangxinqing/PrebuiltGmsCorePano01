package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: xug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xug extends bl {
    public final xsj c;
    public final qci d;
    public boolean e = false;
    public final xtq f;
    private final xuo g;
    private final xun h;

    public xug(xsj xsj, xuo xuo, xun xun, xtq xtq) {
        this.c = xsj;
        this.g = xuo;
        this.h = xun;
        this.d = new qci();
        this.f = xtq;
    }

    /* access modifiers changed from: package-private */
    public final as a() {
        xsj xsj = this.c;
        xun xun = this.h;
        xun.getClass();
        return bk.b(xsj, new xuf(xun));
    }

    /* access modifiers changed from: package-private */
    public final as b() {
        xtq xtq = this.f;
        qci qci = new qci();
        acwa a = xtq.a.a();
        qci.getClass();
        a.a((acvp) new xtm(qci));
        return qci;
    }

    /* access modifiers changed from: package-private */
    public final as c() {
        xtq xtq = this.f;
        qci qci = new qci();
        wsu wsu = xtq.a;
        iha b = ihb.b();
        b.b = new Feature[]{wku.c};
        b.a = new wtf();
        acwa a = ((iby) wsu).a(b.a());
        qci.getClass();
        a.a((acvp) new xtp(qci));
        return qci;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.d.b(2);
    }

    public final void e() {
        this.d.b(1);
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.d.b(0);
    }

    /* access modifiers changed from: package-private */
    public final as a(String str) {
        return this.h.a(xus.a(str));
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        if (!this.g.a().equals(str)) {
            this.g.a.edit().putString("core_ui_selected_account", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        b(str);
        this.c.e();
    }
}
