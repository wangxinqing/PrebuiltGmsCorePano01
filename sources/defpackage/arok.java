package defpackage;

import java.util.Locale;

/* renamed from: arok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arok {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final aroj e;
    public final byte[] f;

    private arok(int i, int i2, int i3, int i4, aroj aroj, byte[] bArr) {
        if (a(i2) && aroj == null) {
            throw new IllegalArgumentException("'messageHeader' cannot be null for 'first' fragment.");
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = aroj;
        this.f = bArr;
    }

    private static byte a(int i, int i2, int i3) {
        return (byte) ((i & i3) << i2);
    }

    private static int a(byte b2) {
        return b2 & 255;
    }

    private static int a(int i, int i2) {
        return (char) ((i << 8) | (i2 & 255));
    }

    static boolean a(int i) {
        return i == 0;
    }

    private static byte b(int i) {
        return (byte) ((i >> 8) & 255);
    }

    private static byte c(int i) {
        return (byte) (i & 255);
    }

    public final String toString() {
        return String.format(Locale.US, "MessageSequenceNumber=%d, FragmentSequenceNumber=%d(0x%X), FragmentLengthBytes=%d(0x%X), Flags=0x%X, MessageHeader:%s", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e});
    }

    public static arok a(byte[] bArr) {
        aroj aroj;
        int i;
        byte[] bArr2;
        byte[] bArr3 = bArr;
        int length = bArr3 != null ? bArr3.length : 0;
        int i2 = 4;
        if (length < 4) {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {Integer.valueOf(length), 4};
            return null;
        }
        byte b2 = bArr3[0];
        if (((b2 >> 2) & 3) == 0) {
            int i3 = (b2 >> 4) & 15;
            byte b3 = b2 & 3;
            int a2 = a(bArr3[1]);
            int a3 = a(bArr3[2], bArr3[3]);
            if (a(a2)) {
                i = a3 - 4;
                if (length < 8) {
                    Locale locale2 = Locale.ENGLISH;
                    Object[] objArr2 = {Integer.valueOf(length), 8};
                    return null;
                }
                byte b4 = bArr3[4];
                if (b4 != 0) {
                    new Object[1][0] = Byte.valueOf(b4);
                    return null;
                }
                aroj = new aroj(a(bArr3[5], bArr3[6]), a(bArr3[7]));
                i2 = 8;
            } else {
                aroj = null;
                i = a3;
            }
            int i4 = length - i2;
            if (i4 != i) {
                Locale locale3 = Locale.ENGLISH;
                Object[] objArr3 = {Integer.valueOf(i4), Integer.valueOf(a3)};
                return null;
            }
            if (i4 > 0) {
                byte[] bArr4 = new byte[i4];
                System.arraycopy(bArr3, i2, bArr4, 0, i4);
                bArr2 = bArr4;
            } else {
                bArr2 = null;
            }
            return new arok(i3, a2, a3, b3, aroj, bArr2);
        }
        new Object[1][0] = Integer.valueOf(b2);
        return null;
    }

    public static byte[] a(int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        if (a(i2)) {
            i9 = i7 + 4;
            i8 = 8;
        } else {
            i9 = i7;
            i8 = 4;
        }
        byte[] bArr2 = new byte[(i8 + i7)];
        bArr2[0] = (byte) (((byte) (a(i, 4, 255) | a(0, 2, 3))) | a(i3, 0, 3));
        bArr2[1] = (byte) i2;
        bArr2[2] = b(i9);
        bArr2[3] = c(i9);
        if (a(i2)) {
            bArr2[4] = 0;
            bArr2[5] = b(i4);
            bArr2[6] = c(i4);
            bArr2[7] = (byte) i5;
        }
        if (i7 != 0) {
            System.arraycopy(bArr, i6, bArr2, i8, i7);
        }
        return bArr2;
    }

    public final boolean a() {
        return a(this.b);
    }
}
