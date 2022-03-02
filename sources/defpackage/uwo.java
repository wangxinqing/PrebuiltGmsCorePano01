package defpackage;

/* renamed from: uwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwo extends arwm {
    final /* synthetic */ uwr a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uwo(uwr uwr, String str) {
        super(str);
        this.a = uwr;
    }

    public final void run() {
        uwr uwr = this.a;
        if (!uwr.f) {
            vae vae = uwr.c;
            iva.a((Object) uwr);
            vae.b.add(uwr);
            this.a.a.deleteDatabase("copresence_state.db");
            this.a.f = true;
            jjg jjg = tgc.a;
        }
    }
}
