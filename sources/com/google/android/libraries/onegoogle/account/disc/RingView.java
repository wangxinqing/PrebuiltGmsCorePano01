package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RingView extends AppCompatImageView {
    public final Path a = new Path();
    public int b = -1;
    public int c = -1;
    public int d = -1;

    public RingView(Context context) {
        super(context);
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.d;
        if (!(i == this.b || i == -1)) {
            canvas.clipPath(this.a);
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    public RingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = Build.VERSION.SDK_INT;
    }

    public RingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = Build.VERSION.SDK_INT;
    }
}
