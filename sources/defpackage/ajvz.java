package defpackage;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: ajvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajvz {
    static long a(long j) {
        Calendar c = c();
        c.setTimeInMillis(j);
        return b(c).getTimeInMillis();
    }

    public static Calendar b() {
        return b(Calendar.getInstance());
    }

    public static Calendar c() {
        return a((Calendar) null);
    }

    public static DateFormat a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static Calendar b(Calendar calendar) {
        Calendar a = a(calendar);
        Calendar c = c();
        c.set(a.get(1), a.get(2), a.get(5));
        return c;
    }

    static java.text.DateFormat a(Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(a());
        return dateInstance;
    }

    static Calendar a(Calendar calendar) {
        Calendar instance = Calendar.getInstance(a());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    public static java.util.TimeZone a() {
        return java.util.TimeZone.getTimeZone("UTC");
    }
}
