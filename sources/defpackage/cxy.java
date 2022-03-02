package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: cxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxy {
    public static void a(ImageView imageView, int i) {
        rt.a(imageView, ColorStateList.valueOf(i));
        if (imageView.getDrawable() != null) {
            Drawable drawable = imageView.getDrawable();
            if (awgy.a.a().h()) {
                drawable = imageView.getDrawable().mutate();
            }
            ma.a(drawable, i);
        }
    }
}
