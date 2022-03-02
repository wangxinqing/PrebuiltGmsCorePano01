package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.R;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: dby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dby implements ajsf {
    private final dch a;
    private final CoordinatorLayout b;

    public dby(dch dch, CoordinatorLayout coordinatorLayout) {
        this.a = dch;
        this.b = coordinatorLayout;
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        dch dch = this.a;
        CoordinatorLayout coordinatorLayout = this.b;
        if (dch.getContext() != null) {
            if (i == 0 || Math.abs(i) == appBarLayout.c()) {
                coordinatorLayout.a((View) appBarLayout);
            }
            if (((double) Math.abs(((float) i) / ((float) appBarLayout.c()))) < 0.5d) {
                dch.a(dch.d, (View.OnClickListener) null, (String) null);
                dch.a(dch.f, dch.h, dch.i);
                return;
            }
            dch.a(dch.d, new dbv(dch), dch.getString(R.string.as_account_spinner_a11y_tap_action));
            dch.a(dch.f, (View.OnClickListener) null, (String) null);
        }
    }
}
