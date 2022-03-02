package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.animation.FadeTransition;

/* renamed from: vvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvh extends vvc {
    final /* synthetic */ View a;
    final /* synthetic */ FadeTransition b;

    public vvh(FadeTransition fadeTransition, View view) {
        this.b = fadeTransition;
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        int i = FadeTransition.b;
        view.setTag(R.id.root, Boolean.valueOf(this.b.a == 2));
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        int i = FadeTransition.b;
        view.setTag(R.id.root, true);
    }
}
