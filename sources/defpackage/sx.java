package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* renamed from: sx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sx implements pq {
    final /* synthetic */ tn a;

    public sx(tn tnVar) {
        this.a = tnVar;
    }

    public final qn a(View view, qn qnVar) {
        boolean z;
        qn qnVar2;
        int i;
        int i2;
        boolean z2;
        int b = qnVar.b();
        tn tnVar = this.a;
        int b2 = qnVar.b();
        ActionBarContextView actionBarContextView = tnVar.l;
        int i3 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tnVar.l.getLayoutParams();
            boolean z3 = true;
            if (tnVar.l.isShown()) {
                if (tnVar.B == null) {
                    tnVar.B = new Rect();
                    tnVar.C = new Rect();
                }
                Rect rect = tnVar.B;
                Rect rect2 = tnVar.C;
                rect.set(qnVar.a(), qnVar.b(), qnVar.c(), qnVar.d());
                afs.a(tnVar.q, rect, rect2);
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                qn t = qb.t(tnVar.q);
                if (t != null) {
                    i = t.a();
                } else {
                    i = 0;
                }
                if (t != null) {
                    i2 = t.c();
                } else {
                    i2 = 0;
                }
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 > 0 && tnVar.r == null) {
                    tnVar.r = new View(tnVar.e);
                    tnVar.r.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = i2;
                    tnVar.q.addView(tnVar.r, -1, layoutParams);
                } else {
                    View view2 = tnVar.r;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i && marginLayoutParams2.rightMargin == i2)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i;
                            marginLayoutParams2.rightMargin = i2;
                            tnVar.r.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = tnVar.r;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    View view4 = tnVar.r;
                    view4.setBackgroundColor((qb.q(view4) & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? kf.b(tnVar.e, R.color.abc_decor_view_status_guard_light) : kf.b(tnVar.e, R.color.abc_decor_view_status_guard));
                }
                if (!tnVar.u && z3) {
                    b2 = 0;
                    boolean z4 = z3;
                    z3 = z2;
                    z = z4;
                } else {
                    boolean z5 = z3;
                    z3 = z2;
                    z = z5;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                tnVar.l.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = tnVar.r;
        if (view5 != null) {
            if (z) {
                i3 = 0;
            }
            view5.setVisibility(i3);
        }
        if (b != b2) {
            int a2 = qnVar.a();
            int c = qnVar.c();
            int d = qnVar.d();
            int i7 = Build.VERSION.SDK_INT;
            qnVar2 = new qn(((WindowInsets) qnVar.a).replaceSystemWindowInsets(a2, b2, c, d));
        } else {
            qnVar2 = qnVar;
        }
        return qb.a(view, qnVar2);
    }
}
