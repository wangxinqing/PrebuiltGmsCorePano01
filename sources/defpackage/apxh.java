package defpackage;

/* renamed from: apxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apxh {
    static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || d(b3) || d(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int e = ((b & 7) << 18) | (e(b2) << 12) | (e(b3) << 6) | e(b4);
        cArr[i] = (char) ((e >>> 10) + 55232);
        cArr[i + 1] = (char) ((e & 1023) + 56320);
    }

    static boolean a(byte b) {
        return b >= 0;
    }

    static boolean b(byte b) {
        return b < -32;
    }

    static boolean c(byte b) {
        return b < -16;
    }

    private static boolean d(byte b) {
        return b > -65;
    }

    private static int e(byte b) {
        return b & 63;
    }

    static void a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 15) << 12) | (e(b2) << 6) | e(b3));
    }

    static void a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (!d(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | e(b2));
        } else {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
    }

    static void a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }
}
