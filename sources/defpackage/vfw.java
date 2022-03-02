package defpackage;

/* renamed from: vfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vfw extends arwm {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ vgh c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfw(vgh vgh, String str, boolean z, boolean z2) {
        super(str);
        this.c = vgh;
        this.a = z;
        this.b = z2;
    }

    public final void run() {
        for (uxy uxy : this.c.a.a()) {
            if (!uxy.b.d() || this.a) {
                uxy.a(this.b);
            }
        }
    }
}
