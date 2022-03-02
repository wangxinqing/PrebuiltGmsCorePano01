package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: ajyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyt extends Drawable implements ajzw, mb {
    private ajys a;

    public ajyt(ajys ajys) {
        this.a = ajys;
    }

    public final void a(ajzl ajzl) {
        this.a.a.a(ajzl);
    }

    public final void draw(Canvas canvas) {
        ajys ajys = this.a;
        if (ajys.b) {
            ajys.a.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public final int getOpacity() {
        return this.a.a.getOpacity();
    }

    public final boolean isStateful() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Drawable mutate() {
        this.a = new ajys(this.a);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.a.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a2 = ajyu.a(iArr);
        ajys ajys = this.a;
        if (ajys.b == a2) {
            return onStateChange;
        }
        ajys.b = a2;
        return true;
    }

    public final void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    public final void setTint(int i) {
        this.a.a.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }
}
