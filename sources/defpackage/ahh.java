package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ahh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahh implements pq {
    final /* synthetic */ CoordinatorLayout a;

    public ahh(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final qn a(View view, qn qnVar) {
        boolean z;
        CoordinatorLayout coordinatorLayout = this.a;
        if (!op.a(coordinatorLayout.g, qnVar)) {
            coordinatorLayout.g = qnVar;
            int b = qnVar.b();
            boolean z2 = true;
            if (b <= 0) {
                z = false;
            } else {
                z = true;
            }
            coordinatorLayout.h = z;
            if (b > 0 || coordinatorLayout.getBackground() != null) {
                z2 = false;
            }
            coordinatorLayout.setWillNotDraw(z2);
            if (!qnVar.e()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (qb.s(childAt) && ((ahm) childAt.getLayoutParams()).a != null && qnVar.e()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return qnVar;
    }
}
