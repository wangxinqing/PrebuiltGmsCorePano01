package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.gms.R;

/* renamed from: ddb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ddb extends AnimatorListenerAdapter {
    final /* synthetic */ ddf a;

    public ddb(ddf ddf) {
        this.a = ddf;
    }

    public final void onAnimationEnd(Animator animator) {
        ddd ddd = this.a.c;
        if (!cyd.b(ddd.a.getContext())) {
            ddd.a.a.a();
            return;
        }
        Resources resources = ddd.a.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.as_expanded_avatar_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.as_appbar_expanded_avatar_top_margin);
        float dimensionPixelSize3 = ((float) dimensionPixelSize) / ((float) resources.getDimensionPixelSize(R.dimen.as_ob_avatar_size));
        ddd.a.e.animate().translationY((((float) dimensionPixelSize2) - ddd.a.e.getY()) - ((((float) resources.getDimensionPixelSize(R.dimen.as_ob_avatar_size)) * (1.0f - dimensionPixelSize3)) / 2.0f)).scaleX(dimensionPixelSize3).scaleY(dimensionPixelSize3).setDuration(250).setInterpolator(new air()).setListener(new ddc(ddd));
    }
}
