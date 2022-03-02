package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnackbarLayout extends LinearLayout {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public jmm f;
    public jmn g;

    public SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlw.a, 0, 0);
        this.a = obtainStyledAttributes.getInt(3, 0);
        this.b = obtainStyledAttributes.getInt(5, 0);
        this.c = obtainStyledAttributes.getInt(4, 0);
        this.d = (int) obtainStyledAttributes.getDimension(6, 0.0f);
        this.e = (int) obtainStyledAttributes.getDimension(7, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        jmm jmm = this.f;
        if (jmm != null) {
            jml jml = (jml) jmm;
            if (!jml.a.get()) {
                ((WindowManager) jml.b.getSystemService("window")).addView(jml.c, jml.d);
                jml.b();
            }
        }
        super.onDetachedFromWindow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jmn jmn = this.g;
        if (jmn != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                synchronized (jmn) {
                    ((jml) jmn).c();
                }
            } else if (actionMasked == 1) {
                ((jml) jmn).b();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SnackbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlw.a, i, 0);
        this.a = obtainStyledAttributes.getInt(3, 0);
        this.b = obtainStyledAttributes.getInt(5, 0);
        this.c = obtainStyledAttributes.getInt(4, 0);
        this.d = (int) obtainStyledAttributes.getDimension(6, 0.0f);
        this.e = (int) obtainStyledAttributes.getDimension(7, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
