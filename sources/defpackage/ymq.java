package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.google.android.gms.R;

/* renamed from: ymq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ymq {
    private static Time a;

    private static synchronized long a(long j, long j2) {
        long abs;
        synchronized (ymq.class) {
            if (a == null) {
                a = new Time();
            }
            a.set(j);
            int julianDay = Time.getJulianDay(j, a.gmtoff);
            a.set(j2);
            abs = (long) Math.abs(Time.getJulianDay(j2, a.gmtoff) - julianDay);
        }
        return abs;
    }

    public static CharSequence a(Context context, long j) {
        int i;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < 60000) {
            return context.getResources().getText(R.string.plus_posted_just_now);
        }
        try {
            return DateUtils.getRelativeTimeSpanString(j, currentTimeMillis, 60000, 262144).toString();
        } catch (Exception e) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j3 = currentTimeMillis2 - j;
            if (j3 < 60000) {
                return context.getResources().getText(R.string.plus_posted_just_now);
            }
            long abs = Math.abs(j3);
            if (abs < 3600000) {
                j2 = abs / 60000;
                i = R.plurals.plus_num_minutes_ago;
            } else if (abs < 86400000) {
                j2 = abs / 3600000;
                i = R.plurals.plus_num_hours_ago;
            } else if (abs >= 604800000) {
                return DateUtils.formatDateRange(context, j, j, 262144);
            } else {
                j2 = a(j, currentTimeMillis2);
                i = R.plurals.plus_num_days_ago;
            }
            return String.format(context.getResources().getQuantityString(i, (int) j2), new Object[]{Long.valueOf(j2)});
        }
    }
}
