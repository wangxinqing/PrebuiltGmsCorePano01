package defpackage;

/* renamed from: vey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vey extends arwm {
    final /* synthetic */ vff a;
    private final Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vey(vff vff, Object obj) {
        super("ServerTaskImpl.DeliverResultRunnable");
        this.a = vff;
        this.b = obj;
    }

    public final void run() {
        vew vew = this.a.h;
        if (vew != null) {
            vew.a(this.b);
        }
    }
}
