package defpackage;

/* renamed from: aekq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aekq {
    private static final char[] a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            char[] cArr2 = a;
            char c = cArr2[(b >> 4) & 15];
            char c2 = cArr2[b & 15];
            int i2 = i + i;
            cArr[i2] = c;
            cArr[i2 + 1] = c2;
        }
        return new String(cArr);
    }
}
