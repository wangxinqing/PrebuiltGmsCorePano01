package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;

/* renamed from: ajuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajuq {
    static final long a = ajvz.a(Month.a(1900, 0).g);
    static final long b = ajvz.a(Month.a(2100, 11).g);
    public long c = a;
    public long d = b;
    public Long e;
    public CalendarConstraints.DateValidator f = DateValidatorPointForward.a();

    public ajuq() {
    }

    public ajuq(CalendarConstraints calendarConstraints) {
        this.c = calendarConstraints.a.g;
        this.d = calendarConstraints.b.g;
        this.e = Long.valueOf(calendarConstraints.c.g);
        this.f = calendarConstraints.d;
    }
}
