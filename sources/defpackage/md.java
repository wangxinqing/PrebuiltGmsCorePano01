package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: md  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class md extends Drawable implements Drawable.Callback, mc, mb {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    mf b;
    Drawable c;
    private int d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public md(Drawable drawable) {
        this.b = c();
        a(drawable);
    }

    private final boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        mf mfVar = this.b;
        ColorStateList colorStateList = mfVar.c;
        PorterDuff.Mode mode = mfVar.d;
        if (colorStateList == null || mode == null) {
            this.f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f && colorForState == this.d && mode == this.e)) {
                setColorFilter(colorForState, mode);
                this.d = colorForState;
                this.e = mode;
                this.f = true;
                return true;
            }
        }
        return false;
    }

    private final mf c() {
        return new mf(this.b);
    }

    public final Drawable a() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    public final void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        mf mfVar = this.b;
        return changingConfigurations | (mfVar != null ? mfVar.getChangingConfigurations() : 0) | this.c.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        mf mfVar = this.b;
        if (mfVar == null || mfVar.b == null) {
            return null;
        }
        mfVar.a = getChangingConfigurations();
        return this.b;
    }

    public final Drawable getCurrent() {
        return this.c.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.c.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    public final int[] getState() {
        return this.c.getState();
    }

    public final Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public final boolean isStateful() {
        mf mfVar;
        ColorStateList colorStateList = null;
        if (b() && (mfVar = this.b) != null) {
            colorStateList = mfVar.c;
        }
        return (colorStateList != null && colorStateList.isStateful()) || this.c.isStateful();
    }

    public final void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.b = c();
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.mutate();
            }
            mf mfVar = this.b;
            if (mfVar != null) {
                Drawable drawable2 = this.c;
                mfVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.c.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.b.c = colorStateList;
        a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.b.d = mode;
        a(getState());
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public md(mf mfVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.b = mfVar;
        if (mfVar != null && (constantState = mfVar.b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            mf mfVar = this.b;
            if (mfVar != null) {
                mfVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
