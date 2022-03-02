package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* renamed from: ahwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwq {
    protected final aizy a;
    protected final ajbg b;
    protected final Random c;
    public final ahxu d;
    long e = -1;
    long f = -1;
    public final ahyw g;
    public final ahxb h;
    private final ajbe i;
    private final int j;

    public ahwq(aizy aizy, ajbg ajbg, ahyw ahyw, ahxb ahxb, ahxu ahxu) {
        Random random = new Random();
        ajbe ajbe = ajbe.IN_OUT_DOOR_COLLECTOR;
        this.a = aizy;
        this.b = ajbg;
        this.i = ajbe;
        this.d = ahxu;
        this.c = random;
        this.g = ahyw;
        this.j = (int) (ahyw.a() / 6);
        this.h = ahxb;
    }

    /* access modifiers changed from: protected */
    public final aiba a(long j2, ahxq ahxq) {
        if (j2 == this.e) {
            return aiba.a(Long.valueOf(this.f), ahxq);
        }
        long d2 = j2 - this.a.d();
        this.b.a(this.i, d2, (aizx) null);
        this.h.b(j2);
        this.e = j2;
        this.f = d2;
        Object[] objArr = {new Date(j2), ahxq};
        return aiba.a(Long.valueOf(d2), ahxq);
    }

    public final aiba a(Calendar calendar, int i2) {
        int i3;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = {calendar.getTime(), Integer.valueOf(i2)};
        long c2 = ahyw.c(calendar);
        int i4 = this.j;
        ahyw ahyw = this.g;
        long j2 = ((long) ((6 - i2) * i4)) + ahyw.a;
        if (j2 > c2) {
            c2 = j2;
        } else {
            if (ahyw.a(c2)) {
                long j3 = this.g.a;
                int i5 = this.j;
                i3 = i5 - (((int) (c2 - j3)) % i5);
            } else {
                i3 = this.j;
            }
            i4 = i3;
        }
        int nextInt = this.c.nextInt(i4);
        Calendar instance = Calendar.getInstance();
        instance.setTime(calendar.getTime());
        ahyw.a(instance, c2 + ((long) nextInt));
        this.h.l();
        return a(instance.getTimeInMillis(), ahxq.USING_FULL_TIME_SPANS);
    }
}
