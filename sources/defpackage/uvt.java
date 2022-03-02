package defpackage;

/* renamed from: uvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uvt implements Runnable {
    private final uvx a;
    private final uvw b;

    public uvt(uvx uvx, uvw uvw) {
        this.a = uvx;
        this.b = uvw;
    }

    public final void run() {
        uvx uvx = this.a;
        uvx.c.c(this.b);
    }
}
