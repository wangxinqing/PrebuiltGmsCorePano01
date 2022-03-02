package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: vub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vub implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ vud a;
    final /* synthetic */ vue b;

    public vub(vue vue, vud vud) {
        this.b = vue;
        this.a = vud;
    }

    public final boolean onPreDraw() {
        this.a.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.a(this.a);
        return true;
    }
}
