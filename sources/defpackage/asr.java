package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: asr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asr extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public asr(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        ass ass = new ass();
        ass.b = this.a.newDrawable();
        ass.b.setCallback(ass.a);
        return ass;
    }

    public final Drawable newDrawable(Resources resources) {
        ass ass = new ass();
        ass.b = this.a.newDrawable(resources);
        ass.b.setCallback(ass.a);
        return ass;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ass ass = new ass();
        ass.b = this.a.newDrawable(resources, theme);
        ass.b.setCallback(ass.a);
        return ass;
    }
}
