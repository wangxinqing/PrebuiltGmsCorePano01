package defpackage;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: ahnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ahnj(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final aiba a(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, this.a);
        gregorianCalendar.set(12, this.b);
        gregorianCalendar.set(13, 0);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (timeInMillis > j) {
            gregorianCalendar.add(6, -1);
            timeInMillis = gregorianCalendar.getTimeInMillis();
        }
        gregorianCalendar.set(11, this.c);
        gregorianCalendar.set(12, this.d);
        gregorianCalendar.set(13, 0);
        long timeInMillis2 = gregorianCalendar.getTimeInMillis();
        if (timeInMillis2 < timeInMillis) {
            gregorianCalendar.add(6, 1);
            timeInMillis2 = gregorianCalendar.getTimeInMillis();
        }
        return new aiba(Long.valueOf(timeInMillis), Long.valueOf(timeInMillis2));
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(90);
        sb.append("startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        return sb.toString();
    }
}
