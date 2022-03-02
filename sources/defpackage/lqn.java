package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* renamed from: lqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqn extends lql {
    private static final int[] b = {R.string.common_today, R.string.common_yesterday, R.string.drive_time_range_this_week, R.string.drive_time_range_this_month, R.string.drive_time_range_this_year, R.string.drive_time_range_last_year, R.string.drive_time_range_older};
    private final kyu c;
    private final lqv d;

    public lqn(String str, int i, boolean z, kyu kyu, lqv lqv) {
        super(str, i, z);
        this.c = kyu;
        this.d = lqv;
    }

    public final lqr a(jzt jzt, Context context) {
        int i;
        jzt jzt2 = jzt;
        Context context2 = context;
        ArrayList arrayList = new ArrayList();
        lqm lqm = new lqm(Calendar.getInstance());
        int i2 = 0;
        long[] jArr = {lqm.b, lqm.c, lqm.d, lqm.e, lqm.f, lqm.g, 0};
        if (this.a) {
            i = a(jzt);
            arrayList.add(new lqp(context2.getString(R.string.drive_fast_scroll_title_grouper_collections), i));
        } else {
            i = 0;
        }
        while (i2 < b.length) {
            long j = jArr[i2];
            int a = jzt.a();
            int i3 = i;
            while (a > i3) {
                int i4 = (a + i3) / 2;
                Date date = (Date) jzt2.a(i4).a(this.c);
                if ((date != null ? date.getTime() : 0) >= j) {
                    i3 = i4 + 1;
                } else {
                    a = i4;
                }
            }
            arrayList.add(new lqp(context2.getString(b[i2]), i3 - i));
            i2++;
            i = i3;
        }
        return new lqr(arrayList, arrayList, jzt2);
    }

    public final lqw a(Context context) {
        return this.d.a(context);
    }

    /* access modifiers changed from: protected */
    public final void a(liw liw) {
        liw.a.add(new FieldWithSortOrder(((kyl) this.c).a, false));
    }
}
