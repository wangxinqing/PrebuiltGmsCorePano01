package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: alex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alex {
    public static void a(Animation animation, View view, int i) {
        Animation animation2 = view.getAnimation();
        if ((view.getVisibility() != i || animation2 != null) && animation2 != animation) {
            animation.setAnimationListener(new alew(view, i));
            view.setTag(Integer.valueOf(i));
            view.startAnimation(animation);
        }
    }
}
