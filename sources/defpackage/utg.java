package defpackage;

/* renamed from: utg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class utg implements Runnable {
    private final uti a;
    private final usu b;
    private final auay c;
    private final byte[] d;

    public utg(uti uti, usu usu, auay auay, byte[] bArr) {
        this.a = uti;
        this.b = usu;
        this.c = auay;
        this.d = bArr;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
