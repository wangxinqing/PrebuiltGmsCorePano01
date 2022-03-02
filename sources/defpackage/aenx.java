package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;

/* renamed from: aenx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aenx implements ValueAnimator.AnimatorUpdateListener {
    private final aeoe a;
    private final float b;
    private final Rect c;

    public aenx(aeoe aeoe, float f, Rect rect) {
        this.a = aeoe;
        this.b = f;
        this.c = rect;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        aeoe aeoe = this.a;
        float f = this.b;
        Rect rect = this.c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = aeoe.c;
        float f2 = f * (1.0f - animatedFraction);
        RectF rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        if (clippableRoundedCornerLayout.a == null) {
            clippableRoundedCornerLayout.a = new Path();
        }
        clippableRoundedCornerLayout.a.reset();
        clippableRoundedCornerLayout.a.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        clippableRoundedCornerLayout.a.close();
        clippableRoundedCornerLayout.invalidate();
    }
}
