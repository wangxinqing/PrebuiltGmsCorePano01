package com.google.android.gms.org.conscrypt;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ArrayUtils {
    private ArrayUtils() {
    }

    static void checkOffsetAndCount(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("length=");
            sb.append(i);
            sb.append("; regionStart=");
            sb.append(i2);
            sb.append("; regionLength=");
            sb.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }
}
