package defpackage;

/* renamed from: asdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdx extends arwm {
    final /* synthetic */ aseb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdx(aseb aseb, String str) {
        super(str);
        this.a = aseb;
    }

    public final void run() {
        aseb aseb = this.a;
        aseb.a.e(aseb.d);
        for (String a2 : this.a.b.keySet()) {
            this.a.c.a(a2);
        }
        this.a.b.clear();
    }
}
