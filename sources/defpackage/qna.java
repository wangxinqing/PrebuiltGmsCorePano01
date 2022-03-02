package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: qna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qna {
    public static final anax a = anax.a((Object) 3, (Object) 4);
    public final Activity b;
    public final View c;
    public final View d;
    public final View e;
    public int f = 0;
    private final int g;

    public qna(Activity activity, View view, View view2) {
        this.b = activity;
        View findViewById = activity.findViewById(16908290);
        this.c = findViewById;
        findViewById.setVisibility(4);
        this.d = view;
        this.e = view2;
        this.g = activity.getResources().getInteger(17694721);
    }

    public final void a(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator).with(objectAnimator2);
        animatorSet.setInterpolator(new aiq());
        animatorSet.setDuration((long) this.g);
        animatorSet.addListener(animatorListener);
        animatorSet.start();
    }
}
