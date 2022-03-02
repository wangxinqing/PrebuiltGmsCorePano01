package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: aqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqc implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;

    public aqc(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        aqk aqk;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (swipeRefreshLayout.b) {
            swipeRefreshLayout.j.setAlpha(255);
            this.a.j.start();
            SwipeRefreshLayout swipeRefreshLayout2 = this.a;
            if (swipeRefreshLayout2.k && (aqk = swipeRefreshLayout2.a) != null) {
                aqk.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.a;
            swipeRefreshLayout3.c = swipeRefreshLayout3.e.getTop();
            return;
        }
        swipeRefreshLayout.a();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
