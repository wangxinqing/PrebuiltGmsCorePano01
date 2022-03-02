package defpackage;

/* renamed from: vex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vex extends arwm {
    public int a;
    final /* synthetic */ vff b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vex(vff vff) {
        super("ServerTaskImpl.DeliverFailureRunnable");
        this.b = vff;
    }

    public final void run() {
        vff vff = this.b;
        vew vew = vff.h;
        if (vew != null) {
            vew.a(vff, this.a);
        }
    }
}
