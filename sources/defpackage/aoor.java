package defpackage;

import java.io.Serializable;

/* renamed from: aoor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoor extends Number implements Comparable, Serializable {
    public final long a;

    static {
        new aoor(0);
        new aoor(1);
        new aoor(-1);
    }

    private aoor(long j) {
        this.a = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aoor aoor = (aoor) obj;
        amrl.a((Object) aoor);
        return aoot.a(this.a, aoor.a);
    }

    public final double doubleValue() {
        long j = this.a;
        double d = (double) (Long.MAX_VALUE & j);
        if (j >= 0) {
            return d;
        }
        Double.isNaN(d);
        return d + 9.223372036854776E18d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aoor) && this.a == ((aoor) obj).a;
    }

    public final float floatValue() {
        long j = this.a;
        float f = (float) (Long.MAX_VALUE & j);
        return j < 0 ? f + 9.223372E18f : f;
    }

    public final int hashCode() {
        return aook.a(this.a);
    }

    public final int intValue() {
        return (int) this.a;
    }

    public final long longValue() {
        return this.a;
    }

    public final String toString() {
        long j = this.a;
        amrl.a(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / 5;
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % 10), 10);
            j2 /= 10;
        }
        return new String(cArr, i, 64 - i);
    }

    public static aoor a(String str) {
        amrl.a((Object) str);
        if (str.length() != 0) {
            int i = aoos.c[16] - 1;
            long j = 0;
            int i2 = 0;
            while (i2 < str.length()) {
                int digit = Character.digit(str.charAt(i2), 16);
                if (digit == -1) {
                    throw new NumberFormatException(str);
                } else if (i2 > i && aoos.a(j, digit)) {
                    String valueOf = String.valueOf(str);
                    throw new NumberFormatException(valueOf.length() == 0 ? new String("Too large for unsigned long: ") : "Too large for unsigned long: ".concat(valueOf));
                } else {
                    j = (j * 16) + ((long) digit);
                    i2++;
                }
            }
            return new aoor(j);
        }
        throw new NumberFormatException("empty string");
    }
}
