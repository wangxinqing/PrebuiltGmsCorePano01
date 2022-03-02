package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: alfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfc {
    public final int a;
    public final int b;
    public final ExpandingScrollView c;
    public final aley d;
    public final aley e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j = -1.0f;
    public boolean k;
    public int l = 1;

    public alfc(ExpandingScrollView expandingScrollView, alff alff, alff alff2) {
        new Rect();
        this.c = expandingScrollView;
        this.d = new aley(alff);
        this.e = new aley(alff2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(expandingScrollView.getContext());
        this.a = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledPagingTouchSlop();
    }

    public static boolean a(View view, int i2, int i3) {
        int i4;
        if (view.getVisibility() == 8) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && a(childAt, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return qb.a(view, -1);
    }
}
