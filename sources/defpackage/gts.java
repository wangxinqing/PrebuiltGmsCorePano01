package defpackage;

/* renamed from: gts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gts extends gtt {
    public static final byte[] a = {2, 21};
    public static final byte[] b = {-1, -1};

    public final int a() {
        return 1;
    }

    public final Integer b(gti gti) {
        return Integer.valueOf(gti.a(76)[22]);
    }

    public final Integer a(int i) {
        return Integer.valueOf(i);
    }

    public final byte[] a(gti gti) {
        byte[] a2 = gti.a(76);
        byte[] bArr = new byte[20];
        System.arraycopy(a2, 2, bArr, 0, 16);
        System.arraycopy(a2, 18, bArr, 16, 4);
        return bArr;
    }
}
