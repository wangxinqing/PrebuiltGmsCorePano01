package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ajwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajwu implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ajxa a;

    public ajwu(ajxa ajxa) {
        this.a = ajxa;
    }

    public final boolean onPreDraw() {
        ajxa ajxa = this.a;
        float rotation = ajxa.B.getRotation();
        if (ajxa.r == rotation) {
            return true;
        }
        ajxa.r = rotation;
        ajxa.j();
        return true;
    }
}
