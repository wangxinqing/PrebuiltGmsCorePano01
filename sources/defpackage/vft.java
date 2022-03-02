package defpackage;

/* renamed from: vft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vft extends arwm {
    final /* synthetic */ String[] a;
    final /* synthetic */ vfu b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vft(vfu vfu, String str, String[] strArr) {
        super(str);
        this.b = vfu;
        this.a = strArr;
    }

    public final void run() {
        for (String a2 : this.a) {
            amzy a3 = this.b.a.a(a2);
            int size = a3.size();
            for (int i = 0; i < size; i++) {
                vgh vgh = (vgh) a3.get(i);
                vgh.b.c(new vgf(vgh, "onSystemPermissionsChanged"));
            }
        }
    }
}
