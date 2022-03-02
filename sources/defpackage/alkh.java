package defpackage;

import android.app.Activity;
import com.google.android.gms.R;

/* renamed from: alkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkh {
    public final Activity a;

    public alkh(Activity activity) {
        this.a = activity;
    }

    public final void a() {
        this.a.overridePendingTransition(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
    }
}
