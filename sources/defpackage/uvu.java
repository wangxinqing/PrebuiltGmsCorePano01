package defpackage;

/* renamed from: uvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uvu implements Runnable {
    private final uvx a;
    private final urq b;

    public uvu(uvx uvx, urq urq) {
        this.a = uvx;
        this.b = urq;
    }

    public final void run() {
        uvx uvx = this.a;
        uvx.c.c(this.b);
    }
}
