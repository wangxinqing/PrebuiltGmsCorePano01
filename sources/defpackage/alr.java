package defpackage;

import android.os.Build;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: alr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alr {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    public static alq a(Locale locale) {
        return new alq(locale);
    }

    public static Calendar a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar instance = Calendar.getInstance(locale);
        instance.setTimeInMillis(timeInMillis);
        return instance;
    }

    public static void a(int i, int i2, String str) {
        String[] strArr = new String[((i2 - i) + 1)];
        for (int i3 = i; i3 <= i2; i3++) {
            strArr[i3 - i] = String.format(str, new Object[]{Integer.valueOf(i3)});
        }
    }
}
