package defpackage;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: ahyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyw {
    public static final Comparator c = new ahyv();
    public final long a;
    public final long b;

    public ahyw(int i, int i2, int i3) {
        this(a(i, i2, 0, 0), a(i3, 0, 0, 0));
    }

    public static long a(int i, int i2, int i3, int i4) {
        return (((long) i) * 3600000) + (((long) i2) * 60000) + (((long) i3) * 1000) + ((long) i4);
    }

    public static long b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return c(instance);
    }

    public static long c(Calendar calendar) {
        return a(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
    }

    public final long a() {
        return this.b - this.a;
    }

    public final boolean a(long j) {
        return this.a <= j && j < this.b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ahyw)) {
            ahyw ahyw = (ahyw) obj;
            if (this.a == ahyw.a && this.b == ahyw.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) (this.b - this.a);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "TimeSpan: [%s, %s)", new Object[]{c(this.a), c(this.b)});
    }

    public static void a(Calendar calendar, long j) {
        calendar.set(11, (int) (j / 3600000));
        long j2 = j % 3600000;
        calendar.set(12, (int) (j2 / 60000));
        long j3 = j2 % 60000;
        calendar.set(13, (int) (j3 / 1000));
        calendar.set(14, (int) (j3 % 1000));
    }

    public final boolean b(Calendar calendar) {
        return a(c(calendar));
    }

    public ahyw(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j2 <= j) {
            throw new IllegalArgumentException("Invalid time span.");
        }
    }

    public static String c(long j) {
        long j2 = j % 3600000;
        long j3 = j2 % 60000;
        return String.format(Locale.ENGLISH, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(j / 3600000), Long.valueOf(j2 / 60000), Long.valueOf(j3 / 1000), Long.valueOf(j3 % 1000)});
    }

    public static boolean a(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public final boolean a(Calendar calendar) {
        return this.b <= b(calendar.getTimeInMillis());
    }
}
