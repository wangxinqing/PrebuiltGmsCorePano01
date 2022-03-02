package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* renamed from: ajsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ajsm extends ajso {
    public final Rect a = new Rect();
    final Rect b = new Rect();
    public int c = 0;
    public int d;

    public ajsm() {
    }

    public abstract View a(List list);

    /* access modifiers changed from: protected */
    public boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void c(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a2 = a(coordinatorLayout.b(view));
        if (a2 != null) {
            ahm ahm = (ahm) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + ahm.leftMargin, a2.getBottom() + ahm.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ahm.rightMargin, ((coordinatorLayout.getHeight() + a2.getBottom()) - coordinatorLayout.getPaddingBottom()) - ahm.bottomMargin);
            qn qnVar = coordinatorLayout.g;
            if (qnVar != null && qb.s(coordinatorLayout) && !qb.s(view)) {
                rect.left += qnVar.a();
                rect.right -= qnVar.c();
            }
            Rect rect2 = this.b;
            int i2 = ahm.c;
            pd.a(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int f = f(a2);
            view.layout(rect2.left, rect2.top - f, rect2.right, rect2.bottom - f);
            this.c = rect2.top - a2.getBottom();
            return;
        }
        coordinatorLayout.b(view, i);
        this.c = 0;
    }

    public float d(View view) {
        throw null;
    }

    public int e(View view) {
        throw null;
    }

    public final int f(View view) {
        if (this.d == 0) {
            return 0;
        }
        float d2 = d(view);
        int i = this.d;
        return mk.a((int) (d2 * ((float) i)), 0, i);
    }

    public ajsm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
