package defpackage;

/* renamed from: uvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uvm implements Runnable {
    private final uvp a;
    private final uvy b;
    private final byte[] c;

    public uvm(uvp uvp, uvy uvy, byte[] bArr) {
        this.a = uvp;
        this.b = uvy;
        this.c = bArr;
    }

    public final void run() {
        this.a.c(this.b, this.c);
    }
}
