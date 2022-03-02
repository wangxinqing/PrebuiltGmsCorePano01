package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.gms.R;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: abgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgk {
    public static String a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        StringBuilder sb = new StringBuilder("(?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        sb.append(")");
        return sb.toString();
    }

    public static String a(long j, Context context) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        if (a(instance2, instance)) {
            return DateFormat.getTimeInstance(3).format(instance2.getTime());
        }
        instance.add(6, -1);
        if (a(instance2, instance)) {
            return context.getString(R.string.common_yesterday);
        }
        instance.add(6, 2);
        if (a(instance2, instance)) {
            return context.getString(R.string.profile_timestamp_string_tomorrow);
        }
        return DateUtils.formatDateTime(context, instance2.getTimeInMillis(), 24);
    }

    private static boolean a(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }
}
