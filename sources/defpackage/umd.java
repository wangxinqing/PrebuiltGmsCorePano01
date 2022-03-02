package defpackage;

/* renamed from: umd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class umd implements Runnable {
    private final umm a;
    private final byte[] b;

    public umd(umm umm, byte[] bArr) {
        this.a = umm;
        this.b = bArr;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
