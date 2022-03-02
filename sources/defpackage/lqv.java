package defpackage;

import android.content.Context;
import android.text.format.Time;
import com.google.android.gms.R;

/* renamed from: lqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqv {
    static final lqv a = new lqv(liy.b, R.string.drive_doclist_date_modified_label);
    static final lqv b = new lqv(liy.c, R.string.drive_doclist_date_edited_label);
    static final lqv c = new lqv(liy.d, R.string.drive_doclist_date_opened_label);
    static final lqv d = new lqv(liy.e, R.string.drive_doclist_date_shared_label);
    private final kyu e;
    private final int f;

    private lqv(kyu kyu, int i) {
        this.e = kyu;
        this.f = i;
    }

    public final lqw a(Context context) {
        Time time = new Time();
        time.setToNow();
        return new lqw(context, time, this.e, this.f);
    }
}
