package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: ajsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajsj implements ajsf {
    final /* synthetic */ CollapsingToolbarLayout a;

    public ajsj(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        int i2;
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        collapsingToolbarLayout.c = i;
        qn qnVar = collapsingToolbarLayout.d;
        if (qnVar != null) {
            i2 = qnVar.b();
        } else {
            i2 = 0;
        }
        int childCount = this.a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.a.getChildAt(i3);
            ajsi ajsi = (ajsi) childAt.getLayoutParams();
            ajsp a2 = CollapsingToolbarLayout.a(childAt);
            int i4 = ajsi.a;
            if (i4 == 1) {
                a2.a(mk.a(-i, 0, this.a.b(childAt)));
            } else if (i4 == 2) {
                a2.a(Math.round(((float) (-i)) * ajsi.b));
            }
        }
        this.a.a();
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.a;
        if (collapsingToolbarLayout2.b != null && i2 > 0) {
            qb.e(collapsingToolbarLayout2);
        }
        this.a.a.b(((float) Math.abs(i)) / ((float) ((this.a.getHeight() - qb.l(this.a)) - i2)));
    }
}
