package defpackage;

/* renamed from: ajqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqz {
    public static float a(int i, int i2) {
        if (i > 0) {
            return ((float) i2) / ((float) i);
        }
        return -1.0f;
    }

    public static long a(long j, long j2) {
        if (j2 < 0) {
            if (j <= Long.MIN_VALUE - j2) {
                return Long.MIN_VALUE;
            }
        } else if (j >= Long.MAX_VALUE - j2) {
            return Long.MAX_VALUE;
        }
        return j + j2;
    }

    public static long a(double d) {
        double floor = Math.floor(d);
        int i = (Math.random() > (d - floor) ? 1 : (Math.random() == (d - floor) ? 0 : -1));
        long j = (long) floor;
        return i < 0 ? j + 1 : j;
    }
}
