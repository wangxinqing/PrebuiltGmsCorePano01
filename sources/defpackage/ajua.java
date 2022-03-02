package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: ajua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajua extends InsetDrawable {
    public ajua(Drawable drawable, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
    }

    public final int getMinimumHeight() {
        return -1;
    }

    public final int getMinimumWidth() {
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        return false;
    }
}
