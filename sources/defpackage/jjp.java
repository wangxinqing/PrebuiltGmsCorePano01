package defpackage;

/* renamed from: jjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjp {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[b3 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return new String();
        }
        char[] cArr = new char[((length * 3) - 1)];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length2 = bArr.length - 1;
            if (i < length2) {
                byte b2 = bArr[i] & 255;
                int i3 = i2 + 1;
                char[] cArr2 = b;
                cArr[i2] = cArr2[b2 >>> 4];
                int i4 = i3 + 1;
                cArr[i3] = cArr2[b2 & 15];
                cArr[i4] = ':';
                i++;
                i2 = i4 + 1;
            } else {
                byte b3 = bArr[length2] & 255;
                char[] cArr3 = b;
                cArr[i2] = cArr3[b3 >>> 4];
                cArr[i2 + 1] = cArr3[b3 & 15];
                return new String(cArr);
            }
        }
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return new String();
        }
        char[] cArr = new char[((length * 3) - 1)];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length2 = bArr.length - 1;
            if (i < length2) {
                byte b2 = bArr[i] & 255;
                int i3 = i2 + 1;
                char[] cArr2 = a;
                cArr[i2] = cArr2[b2 >>> 4];
                int i4 = i3 + 1;
                cArr[i3] = cArr2[b2 & 15];
                cArr[i4] = ':';
                i++;
                i2 = i4 + 1;
            } else {
                byte b3 = bArr[length2] & 255;
                char[] cArr3 = a;
                cArr[i2] = cArr3[b3 >>> 4];
                cArr[i2 + 1] = cArr3[b3 & 15];
                return new String(cArr);
            }
        }
    }

    public static String d(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            sb.append(b[(bArr[i] & 240) >>> 4]);
            sb.append(b[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static byte[] a(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i = 0;
            while (i < length) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
