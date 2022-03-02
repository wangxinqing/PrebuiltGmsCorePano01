package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: alim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alim extends LayerDrawable {
    public alim(Drawable[] drawableArr) {
        super(drawableArr);
    }

    public final boolean getPadding(Rect rect) {
        if (super.getPadding(rect)) {
            return (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) ? false : true;
        }
        return false;
    }
}
