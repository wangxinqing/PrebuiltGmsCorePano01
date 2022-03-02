package defpackage;

import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;

/* renamed from: yqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqm implements Animation.AnimationListener {
    final /* synthetic */ yqq a;

    public yqm(yqq yqq, String str) {
        this.a = yqq;
        yqq.g = str != null ? str.trim() : null;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.d();
        yqq yqq = this.a;
        ((InputMethodManager) yqq.getActivity().getSystemService("input_method")).toggleSoftInputFromWindow(yqq.c.getApplicationWindowToken(), 1, 0);
        this.a.b.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
