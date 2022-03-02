package defpackage;

/* renamed from: arth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arth {
    public static final int a(byte b) {
        return b & 255;
    }

    public static final long b(byte b) {
        return (long) (b & 255);
    }

    public static final int a(byte[] bArr, int i) {
        return (a(bArr[i]) << 8) + a(bArr[i + 1]);
    }
}
