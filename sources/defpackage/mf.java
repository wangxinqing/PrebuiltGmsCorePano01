package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: mf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mf extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c = null;
    PorterDuff.Mode d = md.a;

    public mf(mf mfVar) {
        if (mfVar != null) {
            this.a = mfVar.a;
            this.b = mfVar.b;
            this.c = mfVar.c;
            this.d = mfVar.d;
        }
    }

    public final int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public final Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public final Drawable newDrawable(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        return new me(this, resources);
    }
}
