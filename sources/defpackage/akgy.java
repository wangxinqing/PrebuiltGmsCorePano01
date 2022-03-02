package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;

/* renamed from: akgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgy {
    public Animator a;
    public Animator b;
    private final DisplayMetrics c;

    public akgy(Context context) {
        this.c = context.getResources().getDisplayMetrics();
    }

    public final void a(int i, Animator animator, View view) {
        if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int size = childAnimations.size() - 1; size >= 0; size--) {
                a(i, childAnimations.get(size), view);
            }
        } else if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setTarget(view);
            long duration = valueAnimator.getDuration();
            long j = (long) i;
            if (j < duration) {
                valueAnimator.setCurrentPlayTime(j);
            } else {
                valueAnimator.setCurrentPlayTime(duration);
            }
        }
    }

    public final void a(Animator animator, long j) {
        long duration = animator.getDuration();
        if (duration != 0) {
            j = duration;
        }
        if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int size = childAnimations.size() - 1; size >= 0; size--) {
                a(childAnimations.get(size), j);
            }
        } else if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setDuration((long) TypedValue.applyDimension(1, (float) j, this.c));
        }
    }
}
