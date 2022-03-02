package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.gms.nearby.sharing.animation.DividerFadeTransition;

/* renamed from: vvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vvg implements ValueAnimator.AnimatorUpdateListener {
    private final Drawable a;

    public vvg(Drawable drawable) {
        this.a = drawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable drawable = this.a;
        int i = DividerFadeTransition.a;
        drawable.invalidateSelf();
    }
}
