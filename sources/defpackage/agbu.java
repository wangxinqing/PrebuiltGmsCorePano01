package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: agbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbu {
    public static int a(ImageView imageView) {
        int i;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null || layoutParams.width <= 0) {
            i = imageView.getWidth();
        } else {
            i = layoutParams.width;
        }
        int paddingLeft = i - (imageView.getPaddingLeft() + imageView.getPaddingRight());
        if (paddingLeft >= 0) {
            return paddingLeft;
        }
        return 0;
    }
}
