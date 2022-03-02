package defpackage;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: akmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmq {
    private TimeZone a;
    private Locale b;
    private Calendar c;

    public final Calendar a() {
        Locale locale = Locale.getDefault();
        TimeZone timeZone = TimeZone.getDefault();
        if (this.c == null || !locale.equals(this.b) || !timeZone.equals(this.a)) {
            this.a = timeZone;
            this.b = locale;
            Calendar instance = Calendar.getInstance(timeZone, locale);
            this.c = instance;
            instance.setLenient(false);
        }
        this.c.clear();
        return this.c;
    }
}
