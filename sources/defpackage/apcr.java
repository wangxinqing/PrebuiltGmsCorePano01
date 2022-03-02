package defpackage;

/* renamed from: apcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcr {
    private final byte[] a;

    private apcr(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static apcr a(byte[] bArr) {
        if (bArr != null) {
            return new apcr(bArr, bArr.length);
        }
        return null;
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
