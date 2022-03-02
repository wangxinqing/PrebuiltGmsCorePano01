package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: akab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akab extends AnimatorListenerAdapter {
    final /* synthetic */ akat a;

    public akab(akat akat) {
        this.a = akat;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.h();
    }

    public final void onAnimationStart(Animator animator) {
        akat akat = this.a;
        String str = akat.b;
        SnackbarContentLayout snackbarContentLayout = akat.l;
        snackbarContentLayout.a.setAlpha(0.0f);
        snackbarContentLayout.a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(0.0f);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }
}
