package defpackage;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: alq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alq {
    public final Locale a;
    public final String[] b;

    public alq(Locale locale) {
        this.a = locale;
        this.b = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar instance = Calendar.getInstance(locale);
        alr.a(instance.getMinimum(5), instance.getMaximum(5), "%02d");
    }
}
