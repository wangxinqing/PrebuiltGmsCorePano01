package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: bep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bep extends LayerDrawable {
    public ColorStateList a = null;

    public bep(Drawable drawable) {
        super(new Drawable[]{drawable});
    }

    public static bep a(Drawable drawable) {
        if (drawable instanceof bep) {
            return (bep) drawable;
        }
        return new bep(drawable.mutate());
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || a();
    }

    public final boolean a() {
        ColorStateList colorStateList = this.a;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
