package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: abe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abe extends ViewGroup.MarginLayoutParams {
    public float g;
    public int h;

    public abe(int i) {
        super(i, -2);
        this.h = -1;
        this.g = 0.0f;
    }

    public abe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh.o);
        this.g = obtainStyledAttributes.getFloat(3, 0.0f);
        this.h = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public abe(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
