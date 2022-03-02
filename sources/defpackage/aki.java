package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: aki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aki extends LinearLayout {
    private Drawable a;
    private boolean b;
    private final Rect c;

    public aki(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.b) {
                this.b = false;
                Rect rect = this.c;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.a;
        if (drawable != null && drawable.isStateful()) {
            this.a.setState(getDrawableState());
        }
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b = z | this.b;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    public aki(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aki(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || Build.VERSION.SDK_INT < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    if (this.a != drawable) {
                        this.a = drawable;
                        this.b = true;
                        setWillNotDraw(false);
                        this.a.setCallback(this);
                        if (this.a.isStateful()) {
                            this.a.setState(getDrawableState());
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 23) {
                    setForeground(drawable);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
