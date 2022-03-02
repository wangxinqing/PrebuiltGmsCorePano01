package defpackage;

/* renamed from: mbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbf extends Exception {
    public final byte[] a;

    public mbf(byte[] bArr, String str) {
        super(str);
        this.a = bArr;
    }

    public mbf(byte[] bArr, String str, Throwable th) {
        super(str, th);
        this.a = bArr;
    }

    public mbf(byte[] bArr, Throwable th) {
        super(th);
        this.a = bArr;
    }
}
