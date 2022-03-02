package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ddc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ddc extends AnimatorListenerAdapter {
    final /* synthetic */ ddd a;

    public ddc(ddd ddd) {
        this.a = ddd;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a.a.a();
    }
}
