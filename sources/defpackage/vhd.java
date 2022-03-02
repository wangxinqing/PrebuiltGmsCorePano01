package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: vhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vhd implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ vhg a;

    public vhd(vhg vhg) {
        this.a = vhg;
    }

    public final boolean onPreDraw() {
        this.a.d.getViewTreeObserver().removeOnPreDrawListener(this);
        try {
            this.a.startPostponedEnterTransition();
            return true;
        } catch (NullPointerException e) {
            return true;
        }
    }
}
