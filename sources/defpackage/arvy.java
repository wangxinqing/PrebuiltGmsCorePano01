package defpackage;

/* renamed from: arvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arvy {
    public static int a(int i) {
        int i2;
        if (i >= 2412 && i <= 2472) {
            i2 = i - 2407;
        } else if (i == 2484) {
            return 14;
        } else {
            if (i >= 4915 && i <= 4980) {
                return 200 - ((5000 - i) / 5);
            }
            if (i > 5000 && i < 6000) {
                i2 = i - 5000;
            } else if (i > 0 && i < 200) {
                return i;
            } else {
                return 0;
            }
        }
        return i2 / 5;
    }

    public static long a(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 16);
            if (digit != -1) {
                j = (j * 16) + ((long) digit);
            } else if (!(charAt == ':' || charAt == '-')) {
                return -1;
            }
        }
        return j;
    }

    public static String a(long j) {
        if (j < 0 || j > 281474976710655L) {
            return null;
        }
        return String.format("%02x:%02x:%02x:%02x:%02x:%02x", new Object[]{Long.valueOf((j >> 40) & 255), Long.valueOf((j >> 32) & 255), Long.valueOf((j >> 24) & 255), Long.valueOf((j >> 16) & 255), Long.valueOf((j >> 8) & 255), Long.valueOf(j & 255)});
    }
}
