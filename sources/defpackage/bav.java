package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bav extends ValueAnimator {
    public final Set a = new CopyOnWriteArraySet();
    private final Set b = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    public final void a() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.b) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.a.add(animatorListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.add(animatorUpdateListener);
    }

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void removeAllListeners() {
        this.a.clear();
    }

    public final void removeAllUpdateListeners() {
        this.b.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.a.remove(animatorListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.remove(animatorUpdateListener);
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.a) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
