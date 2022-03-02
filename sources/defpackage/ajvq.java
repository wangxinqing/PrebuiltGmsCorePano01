package defpackage;

import android.widget.BaseAdapter;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;

/* renamed from: ajvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajvq extends BaseAdapter {
    static final int a = ajvz.c().getMaximum(4);
    public final Month b;
    public final DateSelector c;
    public ajus d;
    final CalendarConstraints e;

    public ajvq(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints) {
        this.b = month;
        this.c = dateSelector;
        this.e = calendarConstraints;
    }

    public final int a() {
        return this.b.b();
    }

    public final int b() {
        return (this.b.b() + this.b.f) - 1;
    }

    public final int getCount() {
        return this.b.f + a();
    }

    public final long getItemId(int i) {
        return (long) (i / this.b.e);
    }

    public final boolean hasStableIds() {
        return true;
    }

    /* renamed from: a */
    public final Long getItem(int i) {
        if (i < this.b.b() || i > b()) {
            return null;
        }
        Month month = this.b;
        return Long.valueOf(month.a((i - month.b()) + 1));
    }

    public final int b(int i) {
        return a() + (i - 1);
    }

    /* JADX WARNING: type inference failed for: r8v29, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            android.content.Context r0 = r9.getContext()
            ajus r1 = r6.d
            if (r1 != 0) goto L_0x000f
            ajus r1 = new ajus
            r1.<init>(r0)
            r6.d = r1
        L_0x000f:
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r8 != 0) goto L_0x0027
            android.content.Context r8 = r9.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r0 = 2131624615(0x7f0e02a7, float:1.8876415E38)
            android.view.View r8 = r8.inflate(r0, r9, r1)
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r8 = r6.a()
            int r8 = r7 - r8
            r9 = 1
            if (r8 < 0) goto L_0x00b2
            com.google.android.material.datepicker.Month r2 = r6.b
            int r3 = r2.f
            if (r8 < r3) goto L_0x0038
            goto L_0x00b2
        L_0x0038:
            int r8 = r8 + r9
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r8)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r6.b
            long r2 = r2.a((int) r8)
            com.google.android.material.datepicker.Month r8 = r6.b
            int r8 = r8.d
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.a()
            int r4 = r4.d
            r5 = 24
            if (r8 == r4) goto L_0x0081
            java.util.Locale r8 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r5) goto L_0x006d
            java.text.DateFormat r8 = defpackage.ajvz.a((java.util.Locale) r8)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r8 = r8.format(r4)
            goto L_0x007d
        L_0x006d:
            java.lang.String r4 = "yMMMEd"
            android.icu.text.DateFormat r8 = defpackage.ajvz.a(r4, r8)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r8 = r8.format(r4)
        L_0x007d:
            r0.setContentDescription(r8)
            goto L_0x00aa
        L_0x0081:
            java.util.Locale r8 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r5) goto L_0x0097
            java.text.DateFormat r8 = defpackage.ajvz.a((java.util.Locale) r8)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r8 = r8.format(r4)
            goto L_0x00a7
        L_0x0097:
            java.lang.String r4 = "MMMEd"
            android.icu.text.DateFormat r8 = defpackage.ajvz.a(r4, r8)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r8 = r8.format(r4)
        L_0x00a7:
            r0.setContentDescription(r8)
        L_0x00aa:
            r0.setVisibility(r1)
            r0.setEnabled(r9)
            goto L_0x00ba
        L_0x00b2:
            r8 = 8
            r0.setVisibility(r8)
            r0.setEnabled(r1)
        L_0x00ba:
            java.lang.Long r7 = r6.getItem(r7)
            if (r7 == 0) goto L_0x012e
            com.google.android.material.datepicker.CalendarConstraints r8 = r6.e
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r8 = r8.d
            long r2 = r7.longValue()
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0123
            r0.setEnabled(r9)
            com.google.android.material.datepicker.DateSelector r8 = r6.c
            java.util.Collection r8 = r8.c()
            java.util.Iterator r8 = r8.iterator()
        L_0x00db:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0103
            java.lang.Object r9 = r8.next()
            java.lang.Long r9 = (java.lang.Long) r9
            long r1 = r9.longValue()
            long r3 = r7.longValue()
            long r3 = defpackage.ajvz.a((long) r3)
            long r1 = defpackage.ajvz.a((long) r1)
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x00db
            ajus r7 = r6.d
            ajur r7 = r7.b
            r7.a(r0)
            goto L_0x012e
        L_0x0103:
            java.util.Calendar r8 = defpackage.ajvz.b()
            long r8 = r8.getTimeInMillis()
            long r1 = r7.longValue()
            int r7 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x011b
            ajus r7 = r6.d
            ajur r7 = r7.c
            r7.a(r0)
            goto L_0x012e
        L_0x011b:
            ajus r7 = r6.d
            ajur r7 = r7.a
            r7.a(r0)
            goto L_0x012e
        L_0x0123:
            r0.setEnabled(r1)
            ajus r7 = r6.d
            ajur r7 = r7.g
            r7.a(r0)
        L_0x012e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvq.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
