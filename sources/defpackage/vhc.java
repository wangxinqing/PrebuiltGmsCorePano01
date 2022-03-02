package defpackage;

/* renamed from: vhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vhc implements acvv {
    private final vhg a;
    private final vhf b;

    public vhc(vhg vhg, vhf vhf) {
        this.a = vhg;
        this.b = vhf;
    }

    public final void a(Object obj) {
        vhg vhg = this.a;
        vhf vhf = this.b;
        Boolean bool = (Boolean) obj;
        if (!vhg.e && !bool.booleanValue()) {
            if (vhg.c.isLaidOut()) {
                vhf.a();
            } else {
                vhg.c.getViewTreeObserver().addOnPreDrawListener(new vhe(vhg, vhf));
            }
        }
    }
}
