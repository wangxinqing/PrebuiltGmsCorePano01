package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: apx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apx extends ImageView {
    public Animation.AnimationListener a;
    private int b;

    public apx(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(apw.a);
        this.b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        int i = Build.VERSION.SDK_INT;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        qb.a((View) this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.b);
        qb.a((View) this, (Drawable) shapeDrawable);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = Build.VERSION.SDK_INT;
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.b = i;
        }
    }
}
