package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: ajsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajsw implements rf {
    final /* synthetic */ SwipeDismissBehavior a;

    public ajsw(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    public final boolean a(View view) {
        if (!this.a.d(view)) {
            return false;
        }
        int h = qb.h(view);
        int i = this.a.b;
        qb.h(view, (i != 0 ? i != 1 || h == 1 : h != 1) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        akan akan = this.a.f;
        if (akan != null) {
            akan.a(view);
        }
        return true;
    }
}
