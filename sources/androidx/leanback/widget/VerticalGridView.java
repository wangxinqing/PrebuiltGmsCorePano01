package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VerticalGridView extends ajp {
    public VerticalGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a.a(1);
        a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.j);
        qb.a(this, context, ait.j, attributeSet, obtainStyledAttributes, 0, 0);
        if (obtainStyledAttributes.peekValue(0) != null) {
            this.a.e(obtainStyledAttributes.getLayoutDimension(0, 0));
            requestLayout();
        }
        this.a.c(obtainStyledAttributes.getInt(1, 1));
        requestLayout();
        obtainStyledAttributes.recycle();
    }
}
