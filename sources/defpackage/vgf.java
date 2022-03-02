package defpackage;

/* renamed from: vgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vgf extends arwm {
    final /* synthetic */ vgh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vgf(vgh vgh, String str) {
        super(str);
        this.a = vgh;
    }

    public final void run() {
        for (uxy uxy : this.a.a.a()) {
            if (!uxy.e.a()) {
                uxy.a(true);
            }
        }
    }
}
