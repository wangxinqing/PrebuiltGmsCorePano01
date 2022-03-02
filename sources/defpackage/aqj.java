package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: aqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqj extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public aqj(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        float f2 = swipeRefreshLayout.g;
        swipeRefreshLayout.a(f2 + ((-f2) * f));
        this.a.b(f);
    }
}
