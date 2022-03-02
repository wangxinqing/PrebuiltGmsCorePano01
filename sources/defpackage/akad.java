package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: akad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akad extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ akat b;

    public akad(akat akat, int i) {
        this.b = akat;
        this.a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.j();
    }

    public final void onAnimationStart(Animator animator) {
        akat akat = this.b;
        String str = akat.b;
        SnackbarContentLayout snackbarContentLayout = akat.l;
        snackbarContentLayout.a.setAlpha(1.0f);
        snackbarContentLayout.a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }
}
