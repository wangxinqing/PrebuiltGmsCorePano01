package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: ajsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajsg implements pq {
    final /* synthetic */ CollapsingToolbarLayout a;

    public ajsg(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    public final qn a(View view, qn qnVar) {
        qn qnVar2;
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        if (!qb.s(collapsingToolbarLayout)) {
            qnVar2 = null;
        } else {
            qnVar2 = qnVar;
        }
        if (!op.a(collapsingToolbarLayout.d, qnVar2)) {
            collapsingToolbarLayout.d = qnVar2;
            collapsingToolbarLayout.requestLayout();
        }
        int i = Build.VERSION.SDK_INT;
        return new qn(((WindowInsets) qnVar.a).consumeSystemWindowInsets());
    }
}
