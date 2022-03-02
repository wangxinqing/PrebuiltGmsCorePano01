package defpackage;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: lqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lqm {
    static final long a = TimeUnit.DAYS.toMillis(1);
    public final long b;
    public final long c;
    final long d;
    final long e;
    final long f;
    final long g;

    public lqm(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        int i = calendar2.get(1);
        int i2 = calendar2.get(2);
        int i3 = calendar2.get(5);
        int i4 = calendar2.get(7);
        int i5 = calendar2.get(6);
        calendar2.set(i, i2, i3, 0, 0, 0);
        long timeInMillis = calendar2.getTimeInMillis();
        this.b = timeInMillis;
        long j = a;
        this.c = timeInMillis - j;
        this.d = timeInMillis - (((long) (i4 - 1)) * j);
        this.e = timeInMillis - (((long) (i3 - 1)) * j);
        this.f = timeInMillis - (((long) (i5 - 1)) * j);
        calendar2.set(i - 1, 0, 1, 0, 0, 0);
        this.g = calendar2.getTimeInMillis();
    }
}
