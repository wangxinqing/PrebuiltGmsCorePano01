package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;

/* renamed from: anmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anmb extends ankv implements Serializable {
    static final anli a = new anmb(0);
    private static final long serialVersionUID = 0;
    private final int b;

    static {
        new anmb(anln.a);
    }

    public anmb(int i) {
        this.b = i;
    }

    public static int a(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static long a(char c) {
        return (long) ((((c & '?') | 128) << 16) | (((c >>> 12) | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8));
    }

    public static int b(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    public static long b(char c) {
        return (long) ((((c & '?') | 128) << 8) | (((c >>> 6) | 960) & 255));
    }

    public static long c(int i) {
        return ((((long) (i >>> 18)) | 240) & 255) | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof anmb) && this.b == ((anmb) obj).b;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public static int b(byte[] bArr, int i) {
        return aoog.a(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    public final anlh a(CharSequence charSequence) {
        int i = this.b;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            i = a(i, b((int) charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i ^= b((int) charSequence.charAt(charSequence.length() - 1));
        }
        int length = charSequence.length();
        return b(i, length + length);
    }

    public static anlh b(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * -2048144789;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477387;
        return anlh.a(i5 ^ (i5 >>> 16));
    }

    public final anlh a(CharSequence charSequence, Charset charset) {
        int i;
        long j;
        if (!amqn.c.equals(charset)) {
            return a(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i2 = this.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 4;
            j = 0;
            if (i6 > length) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            char charAt2 = charSequence.charAt(i4 + 1);
            char charAt3 = charSequence.charAt(i4 + 2);
            char charAt4 = charSequence.charAt(i4 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i2 = a(i2, b((int) (charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i5 = i + 4;
            i4 = i6;
        }
        while (i4 < length) {
            char charAt5 = charSequence.charAt(i4);
            if (charAt5 < 128) {
                j |= ((long) charAt5) << i3;
                i3 += 8;
                i++;
            } else if (charAt5 < 2048) {
                j |= b(charAt5) << i3;
                i3 += 16;
                i += 2;
            } else if (charAt5 >= 55296 && charAt5 <= 57343) {
                int codePointAt = Character.codePointAt(charSequence, i4);
                if (codePointAt == charAt5) {
                    return a(charSequence.toString().getBytes(charset));
                }
                i4++;
                j |= c(codePointAt) << i3;
                i += 4;
            } else {
                j |= a(charAt5) << i3;
                i3 += 24;
                i += 3;
            }
            if (i3 >= 32) {
                i2 = a(i2, b((int) j));
                j >>>= 32;
                i3 -= 32;
            }
            i4++;
        }
        return b(b((int) j) ^ i2, i);
    }

    public final anlh a(byte[] bArr, int i) {
        int i2 = 0;
        amrl.a(0, i, bArr.length);
        int i3 = this.b;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 4;
            if (i5 > i) {
                break;
            }
            i3 = a(i3, b(b(bArr, i4)));
            i4 = i5;
        }
        int i6 = i4;
        int i7 = 0;
        while (i6 < i) {
            i2 ^= aoop.a(bArr[i6]) << i7;
            i6++;
            i7 += 8;
        }
        return b(b(i2) ^ i3, i);
    }

    public final anlj a() {
        return new anma(this.b);
    }
}
