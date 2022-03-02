package defpackage;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;

/* renamed from: ajwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajwa implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ ajwc b;

    public ajwa(ajwc ajwc, int i) {
        this.b = ajwc;
        this.a = i;
    }

    public void onClick(View view) {
        Month a2 = Month.a(this.a, this.b.a.c.c);
        CalendarConstraints calendarConstraints = this.b.a.b;
        if (a2.compareTo(calendarConstraints.a) < 0) {
            a2 = calendarConstraints.a;
        } else if (a2.compareTo(calendarConstraints.b) > 0) {
            a2 = calendarConstraints.b;
        }
        this.b.a.a(a2);
        this.b.a.c(1);
    }
}
