package defpackage;

import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;

/* renamed from: yqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqn implements Animation.AnimationListener {
    final /* synthetic */ yqq a;

    public yqn(yqq yqq) {
        this.a = yqq;
    }

    public final void onAnimationEnd(Animation animation) {
        yqq yqq = this.a;
        if (!yqq.c.hasFocus()) {
            yqq.c.requestFocus();
            ((InputMethodManager) yqq.getActivity().getSystemService("input_method")).toggleSoftInputFromWindow(yqq.c.getApplicationWindowToken(), 1, 0);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
