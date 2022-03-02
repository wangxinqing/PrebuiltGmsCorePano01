package defpackage;

import android.view.View;

/* renamed from: ajyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajyc implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        qb.r(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
