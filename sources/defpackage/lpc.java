package defpackage;

/* renamed from: lpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lpc {
    public lpb a;

    /* access modifiers changed from: package-private */
    public final void a(icf icf, icm icm) {
        b();
        lpb lpb = new lpb(this, icf, icm);
        this.a = lpb;
        icf.a((icm) lpb);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a != null;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (a()) {
            this.a.a.b();
            this.a = null;
        }
    }
}
