package defpackage;

/* renamed from: vfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vfc extends arwm {
    final /* synthetic */ audx a;
    final /* synthetic */ vfe b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfc(vfe vfe, String str, audx audx) {
        super(str);
        this.b = vfe;
        this.a = audx;
    }

    public final void run() {
        avcz a2;
        vfe vfe = this.b;
        audx audx = this.a;
        if (audx != null && (a2 = vfe.a.a(audx)) != null && (a2.a & 4) != 0) {
            vav vav = vfe.a.i;
            auyt auyt = a2.c;
            if (auyt == null) {
                auyt = auyt.p;
            }
            vav.c = vav.a(vav.c, auyt, "server");
            vav.a("server", vav.c);
            vav.b();
        }
    }
}
