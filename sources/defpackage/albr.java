package defpackage;

/* renamed from: albr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albr implements Runnable {
    final /* synthetic */ rhq a;
    final /* synthetic */ albv b;

    public albr(albv albv, rhq rhq) {
        this.b = albv;
        this.a = rhq;
    }

    public final void run() {
        if (this.b.isVisible()) {
            albv albv = this.b;
            albv.f = false;
            albv.i = null;
            albv.a(this.a);
        }
    }
}
