package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.auth.api.credentials.yolo.ui.EventsInterceptableLinearLayout;

/* renamed from: frp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class frp extends AnimatorListenerAdapter {
    final /* synthetic */ EventsInterceptableLinearLayout a;

    public frp(EventsInterceptableLinearLayout eventsInterceptableLinearLayout) {
        this.a = eventsInterceptableLinearLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setAlpha(0.5f);
    }
}
