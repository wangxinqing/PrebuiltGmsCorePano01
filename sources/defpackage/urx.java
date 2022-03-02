package defpackage;

/* renamed from: urx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class urx {
    static final byte[] a = {-112, 0};
    static final byte[] b = {0, 0};

    public static int a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return bArr[0] & 255;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public static byte[] a(int i) {
        if (i == 0) {
            return new byte[0];
        }
        if (i <= 255) {
            return new byte[]{(byte) i};
        } else if (i <= 65535) {
            return new byte[]{(byte) (i >> 8), (byte) i};
        } else {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Cannot convert ");
            sb.append(i);
            sb.append(" to 2 bytes because it's too large.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
