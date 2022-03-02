package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: aqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqh extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public aqh(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.l) {
            i = swipeRefreshLayout.i - Math.abs(swipeRefreshLayout.h);
        } else {
            i = swipeRefreshLayout.i;
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        int i2 = swipeRefreshLayout2.f;
        this.a.a((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.e.getTop());
        this.a.j.a(1.0f - f);
    }
}
