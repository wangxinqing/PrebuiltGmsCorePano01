package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: jpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jpp {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");
    public static final SimpleDateFormat b = new SimpleDateFormat("--MM-dd", Locale.US);
    private static final SimpleDateFormat[] c;

    static {
        SimpleDateFormat[] simpleDateFormatArr = {new SimpleDateFormat("yyyy-MM-dd", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmmssSSS'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmm'Z'", Locale.US)};
        c = simpleDateFormatArr;
        for (int i = 0; i < 7; i++) {
            SimpleDateFormat simpleDateFormat = simpleDateFormatArr[i];
            simpleDateFormat.setLenient(true);
            simpleDateFormat.setTimeZone(a);
        }
        b.setTimeZone(a);
    }

    private static long a(long j, String str) {
        Time time = new Time();
        time.timezone = "UTC";
        time.set(j);
        time.timezone = str;
        return time.normalize(true);
    }

    private static int b(long j, long j2, long j3) {
        int julianDay = Time.getJulianDay(j, j3) - Time.getJulianDay(j2, j3);
        if (julianDay == 1) {
            return 2;
        }
        if (julianDay == 0 || DateUtils.isToday(j)) {
            return 1;
        }
        return 0;
    }

    public static String a(long j, long j2, long j3, String str, boolean z, Context context) {
        int i;
        int i2;
        long j4 = j;
        long j5 = j3;
        String str2 = str;
        if (!a(j4, j5)) {
            i = a(j5, j4) ? 18 : 16;
        } else {
            i = 18;
        }
        if (!DateFormat.is24HourFormat(context)) {
            i2 = 1;
        } else {
            i2 = 129;
        }
        Time time = new Time(str2);
        time.set(j5);
        Resources resources = context.getResources();
        if (z) {
            long a2 = a(j4, str2);
            String str3 = null;
            if (a(a2, a(j2, str2), time.gmtoff)) {
                int b2 = b(a2, j3, time.gmtoff);
                if (b2 == 1) {
                    str3 = resources.getString(R.string.common_today);
                } else if (b2 == 2) {
                    str3 = resources.getString(R.string.profile_timestamp_string_tomorrow);
                }
            }
            if (str3 != null) {
                return str3;
            }
            return DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50), Locale.getDefault()), j, j2, i, "UTC").toString();
        }
        if (a(j, j2, time.gmtoff)) {
            String a3 = a(context, j, j2, i2);
            int b3 = b(j, j3, time.gmtoff);
            if (b3 == 1) {
                return resources.getString(R.string.profile_today_at_time_fmt, new Object[]{a3});
            } else if (b3 != 2) {
                return resources.getString(R.string.profile_date_time_fmt, new Object[]{a(context, j, j2, i), a3});
            } else {
                return resources.getString(R.string.profile_tomorrow_at_time_fmt, new Object[]{a3});
            }
        } else {
            return a(context, j, j2, i | i2 | 98304);
        }
    }

    public static String a(long j, long j2, Context context) {
        if (DateUtils.isToday(j)) {
            return DateUtils.formatDateTime(context, j, 1);
        }
        if (a(j, j2)) {
            return new SimpleDateFormat("EEE h:mm a", Locale.getDefault()).format(new Date(j));
        }
        return new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()).format(new Date(j));
    }

    private static String a(Context context, long j, long j2, int i) {
        String str;
        if ((i & FragmentTransaction.TRANSIT_EXIT_MASK) == 0) {
            str = Time.getCurrentTimezone();
        } else {
            str = "UTC";
        }
        StringBuilder sb = new StringBuilder(50);
        Formatter formatter = new Formatter(sb, Locale.getDefault());
        sb.setLength(0);
        return DateUtils.formatDateRange(context, formatter, j, j2, i, str).toString();
    }

    public static java.text.DateFormat a(Context context) {
        String str;
        String str2;
        char c2;
        String pattern = ((SimpleDateFormat) SimpleDateFormat.getDateInstance(1)).toPattern();
        if (!pattern.contains("de")) {
            str = "[^DdMm]*[Yy]+[^DdMm]*";
        } else {
            str = "[^Mm]*[Yy]+[^Mm]*";
        }
        try {
            return new SimpleDateFormat(pattern.replaceAll(str, ""), Locale.getDefault());
        } catch (IllegalArgumentException e) {
            char[] dateFormatOrder = DateFormat.getDateFormatOrder(context);
            int i = 0;
            while (true) {
                if (i >= dateFormatOrder.length || (c2 = dateFormatOrder[i]) == 'd') {
                    str2 = "dd MMMM";
                } else if (c2 == 'M') {
                    str2 = "MMMM dd";
                    break;
                } else {
                    i++;
                }
            }
            return new SimpleDateFormat(str2, Locale.getDefault());
        }
    }

    public static boolean a(long j, long j2) {
        Time time = new Time(TimeZone.getDefault().getDisplayName());
        time.set(j2);
        long j3 = time.gmtoff;
        return Time.getJulianDay(j, j3) - Time.getJulianDay(j2, j3) >= -5;
    }

    private static boolean a(long j, long j2, long j3) {
        return j == j2 || Time.getJulianDay(j, j3) == Time.getJulianDay(j2 + -1, j3);
    }
}
