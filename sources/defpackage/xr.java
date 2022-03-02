package defpackage;

/* renamed from: xr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xr implements qh {
    int a;
    final /* synthetic */ xs b;
    private boolean c = false;

    protected xr(xs xsVar) {
        this.b = xsVar;
    }

    public final void a() {
        this.c = true;
    }

    public final void a(qg qgVar, int i) {
        this.b.f = qgVar;
        this.a = i;
    }

    public final void b() {
        if (!this.c) {
            xs xsVar = this.b;
            xsVar.f = null;
            xr.super.setVisibility(this.a);
        }
    }

    public final void c() {
        xr.super.setVisibility(0);
        this.c = false;
    }
}
