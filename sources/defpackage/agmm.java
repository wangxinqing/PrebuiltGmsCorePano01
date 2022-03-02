package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: agmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agmm implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ agmn a;
    private View b;

    public agmm(agmn agmn, View view) {
        this.a = agmn;
        this.b = view;
    }

    public final boolean onPreDraw() {
        try {
            if (this.b != null) {
                agmn agmn = this.a;
                agmn.a.unregisterActivityLifecycleCallbacks(agmn);
                this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                agzj.a(new agml(this));
            }
            return true;
        } catch (RuntimeException e) {
            agmp agmp = agmp.a;
            return true;
        } finally {
            this.b = null;
        }
    }
}
