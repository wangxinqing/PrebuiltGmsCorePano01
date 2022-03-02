package defpackage;

/* renamed from: gtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtz extends gtw {
    public final int a() {
        return 2;
    }

    public final Integer a(int i) {
        return Integer.valueOf(i);
    }

    public final byte[] a(gti gti) {
        byte[] a = gti.a(gtw.a);
        byte[] bArr = new byte[16];
        System.arraycopy(a, 2, bArr, 0, 10);
        System.arraycopy(a, 12, bArr, 10, 6);
        return bArr;
    }
}
