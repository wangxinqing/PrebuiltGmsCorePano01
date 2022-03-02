package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: adkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkg {
    public static final adkg a = new adkg(-1, -1);
    public static final adkg b = new adkg(0, 0);
    private static final Pattern e = Pattern.compile("^([0-2][0-9])([0-5][0-9])-([0-2][0-9])([0-5][0-9])$");
    public final long c;
    public final long d;

    public adkg(long j, long j2) {
        if (j == -1 || j2 == -1) {
            this.c = -1;
            this.d = -1;
        } else if (j == j2) {
            this.c = 0;
            this.d = 0;
        } else {
            this.c = j;
            this.d = j2;
        }
    }

    private static long a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (d(j) > j2) {
            instance.add(5, 1);
        }
        instance.set(11, (int) TimeUnit.MILLISECONDS.toHours(j2));
        instance.set(12, (int) (TimeUnit.MILLISECONDS.toMinutes(j2) % 60));
        instance.set(13, 0);
        return instance.getTimeInMillis() - j;
    }

    public static long d(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return TimeUnit.HOURS.toMillis((long) instance.get(11)) + TimeUnit.MINUTES.toMillis((long) instance.get(12)) + TimeUnit.SECONDS.toMillis((long) instance.get(13)) + ((long) instance.get(14));
    }

    public final boolean a() {
        return (this.c == -1 || this.d == -1) ? false : true;
    }

    public final long b(long j) {
        if (!a()) {
            return Long.MAX_VALUE;
        }
        if (!b()) {
            return a(j, TimeUnit.MINUTES.toMillis(this.c));
        }
        return 0;
    }

    public final boolean b() {
        return this.c == 0 && this.d == 0;
    }

    public final long c(long j) {
        if (!a()) {
            return 0;
        }
        if (!b()) {
            return a(j, TimeUnit.MINUTES.toMillis(this.d));
        }
        return Long.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adkg) {
            adkg adkg = (adkg) obj;
            if (this.c == adkg.c && this.d == adkg.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public static adkg a(String str) {
        if (amrk.a(str) || "none".equalsIgnoreCase(str)) {
            return a;
        }
        Matcher matcher = e.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new adju(valueOf.length() == 0 ? new String("Unable to parse time window string: ") : "Unable to parse time window string: ".concat(valueOf));
        }
        try {
            int parseInt = (Integer.parseInt(amrk.b(matcher.group(1))) * 60) + Integer.parseInt(amrk.b(matcher.group(2)));
            int parseInt2 = (Integer.parseInt(amrk.b(matcher.group(3))) * 60) + Integer.parseInt(amrk.b(matcher.group(4)));
            if (parseInt < 1440 && parseInt2 < 1440) {
                return new adkg((long) parseInt, (long) parseInt2);
            }
            String valueOf2 = String.valueOf(str);
            throw new adju(valueOf2.length() == 0 ? new String("Invalid time window: ") : "Invalid time window: ".concat(valueOf2));
        } catch (NumberFormatException e2) {
            String valueOf3 = String.valueOf(str);
            throw new adju(valueOf3.length() == 0 ? new String("Unable to parse time window string: ") : "Unable to parse time window string: ".concat(valueOf3), e2);
        }
    }

    public final String a(Context context, long j) {
        if (a(j)) {
            return DateUtils.formatDateTime(context, j, 1);
        }
        return DateUtils.formatDateTime(context, j + b(j), 1);
    }

    public final boolean a(long j) {
        if (!a()) {
            return false;
        }
        if (b()) {
            return true;
        }
        long d2 = d(j);
        long millis = TimeUnit.MINUTES.toMillis(this.c);
        long millis2 = TimeUnit.MINUTES.toMillis(this.d);
        if (millis > d2 || d2 > millis2) {
            if (millis <= millis2) {
                return false;
            }
            if (millis <= d2 || d2 <= millis2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
