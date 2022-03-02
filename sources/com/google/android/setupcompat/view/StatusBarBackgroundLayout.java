package com.google.android.setupcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StatusBarBackgroundLayout extends FrameLayout {
    public Drawable a;
    private Object b;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (this.b == null) {
            requestApplyInsets();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        int i = Build.VERSION.SDK_INT;
        Object obj = this.b;
        if (obj != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.a.draw(canvas);
        }
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
