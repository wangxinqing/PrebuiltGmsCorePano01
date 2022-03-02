package defpackage;

/* renamed from: umf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class umf implements Runnable {
    private final umh a;
    private final byte[] b;

    public umf(umh umh, byte[] bArr) {
        this.a = umh;
        this.b = bArr;
    }

    public final void run() {
        umh umh = this.a;
        umh.a.b(this.b);
    }
}
