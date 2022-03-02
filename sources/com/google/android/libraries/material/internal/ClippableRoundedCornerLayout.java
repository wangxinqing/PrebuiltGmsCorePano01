package com.google.android.libraries.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClippableRoundedCornerLayout extends FrameLayout {
    public Path a;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.a != null) {
            int save = canvas.save();
            canvas.clipPath(this.a);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
