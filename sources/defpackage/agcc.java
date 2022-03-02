package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: agcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agcc implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ agcd b;

    public agcc(agcd agcd, Drawable drawable) {
        this.b = agcd;
        this.a = drawable;
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.b.b(this.a);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
