package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: atf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atf extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public atf(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        atg atg = new atg();
        atg.b = (VectorDrawable) this.a.newDrawable();
        return atg;
    }

    public final Drawable newDrawable(Resources resources) {
        atg atg = new atg();
        atg.b = (VectorDrawable) this.a.newDrawable(resources);
        return atg;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        atg atg = new atg();
        atg.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return atg;
    }
}
