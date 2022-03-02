package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: alje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alje {
    public static InsetDrawable a(Drawable drawable, int i, int i2, View view) {
        int i3 = Build.VERSION.SDK_INT;
        if (view.getLayoutDirection() == 1) {
            return new InsetDrawable(drawable, i2, 0, i, 0);
        }
        return new InsetDrawable(drawable, i, 0, i2, 0);
    }
}
