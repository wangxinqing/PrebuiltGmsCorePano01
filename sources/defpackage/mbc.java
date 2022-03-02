package defpackage;

/* renamed from: mbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbc extends Exception {
    public final byte[] a;

    public mbc(String str, Throwable th) {
        super(str, th);
        this.a = null;
    }

    public mbc(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }
}
