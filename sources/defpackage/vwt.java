package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.R;

/* renamed from: vwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwt extends Drawable {
    private final Drawable a;
    private final Drawable b;

    public vwt(Context context) {
        vt vtVar = (vt) context;
        this.a = atg.a(vtVar.a(), R.drawable.sharing_visibility_people_back_ic, context.getTheme());
        this.b = atg.a(vtVar.a(), R.drawable.sharing_visibility_person_front_ic, context.getTheme());
    }

    public final void applyTheme(Resources.Theme theme) {
        this.a.applyTheme(theme);
        this.b.applyTheme(theme);
        invalidateSelf();
    }

    public final boolean canApplyTheme() {
        return true;
    }

    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    public final int getAlpha() {
        return this.a.getAlpha();
    }

    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        this.b.setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.a.setTintList(colorStateList);
        this.b.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.setTintMode(mode);
        this.b.setTintMode(mode);
    }
}
