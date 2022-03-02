package defpackage;

import android.transition.Transition;

/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class C0001if implements Transition.TransitionListener {
    final /* synthetic */ Runnable a;

    public C0001if(Runnable runnable) {
        this.a = runnable;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
