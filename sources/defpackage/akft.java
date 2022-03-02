package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewDebug;

/* renamed from: akft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akft extends View {
    public View a;
    public Drawable b;
    public float c = 1.0f;

    public akft(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @ViewDebug.ExportedProperty(category = "drawing")
    public final float getAlpha() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getHeight() - getPaddingBottom(), getWidth() - getPaddingRight(), (getHeight() - getPaddingBottom()) + this.b.getIntrinsicHeight());
            this.b.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onSetAlpha(int i) {
        return true;
    }

    public final void setAlpha(float f) {
        if (this.c != f) {
            this.c = f;
            Drawable background = getBackground();
            int i = (int) (f * 255.0f);
            if (background != null) {
                background.setAlpha(i);
            }
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
            invalidate();
        }
    }

    public final void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
            drawable.setAlpha((int) (this.c * 255.0f));
        }
    }
}
