package defpackage;

/* renamed from: gtx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtx extends gtw {
    public final int a() {
        return 3;
    }

    public final Integer a(int i) {
        return Integer.valueOf(i);
    }

    public final byte[] a(gti gti) {
        byte[] bArr = new byte[8];
        System.arraycopy(gti.a(gtw.a), 2, bArr, 0, 8);
        return bArr;
    }
}
