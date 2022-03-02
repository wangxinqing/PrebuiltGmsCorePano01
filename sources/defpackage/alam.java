package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: alam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alam implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ Runnable b;

    public alam(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.b.run();
    }
}
