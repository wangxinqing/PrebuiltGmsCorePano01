package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ControlBar extends LinearLayout {
    int a = -1;
    boolean b = true;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if (this.b) {
            return getChildCount() / 2;
        }
        return 0;
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (i == 33 || i == 130) {
            int i3 = this.a;
            if (i3 >= 0 && i3 < getChildCount()) {
                arrayList.add(getChildAt(this.a));
            } else if (getChildCount() > 0) {
                arrayList.add(getChildAt(a()));
            }
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (getChildCount() > 0) {
            int i2 = this.a;
            if (getChildAt((i2 >= 0 && i2 < getChildCount()) ? this.a : a()).requestFocus(i, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.a = indexOfChild(view);
    }

    public ControlBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
