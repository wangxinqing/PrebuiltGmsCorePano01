package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.gms.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;

/* renamed from: ajvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvt extends acg {
    public final ajuy a;
    private final CalendarConstraints e;
    private final DateSelector f;
    private final int g;

    public ajvt(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, ajuy ajuy) {
        int i;
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.c;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (month3.compareTo(month2) <= 0) {
            int a2 = ajvq.a * ajvf.a(context);
            if (ajvl.a(context)) {
                i = ajvf.a(context);
            } else {
                i = 0;
            }
            this.g = a2 + i;
            this.e = calendarConstraints;
            this.f = dateSelector;
            this.a = ajuy;
            a(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final long J(int i) {
        return this.e.a.b(i).a.getTimeInMillis();
    }

    public final int a() {
        return this.e.f;
    }

    /* access modifiers changed from: package-private */
    public final Month f(int i) {
        return this.e.a.b(i);
    }

    /* access modifiers changed from: package-private */
    public final int a(Month month) {
        return this.e.a.b(month);
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!ajvl.a(viewGroup.getContext())) {
            return new ajvs(linearLayout, false);
        }
        linearLayout.setLayoutParams(new acu(-1, this.g));
        return new ajvs(linearLayout, true);
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        ajvs ajvs = (ajvs) adl;
        Month b = this.e.a.b(i);
        ajvs.s.setText(b.b);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) ajvs.t.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b.equals(materialCalendarGridView.getAdapter().b)) {
            ajvq ajvq = new ajvq(b, this.f, this.e);
            materialCalendarGridView.setNumColumns(b.e);
            materialCalendarGridView.setAdapter((ListAdapter) ajvq);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new ajvr(this, materialCalendarGridView));
    }
}
