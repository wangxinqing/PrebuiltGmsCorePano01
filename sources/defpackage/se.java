package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: se  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class se extends ViewGroup.MarginLayoutParams {
    public int a = 8388627;

    public se() {
        super(-2, -2);
    }

    public se(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public se(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public se(se seVar) {
        super(seVar);
        this.a = seVar.a;
    }
}
