package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: exl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class exl implements ViewTreeObserver.OnScrollChangedListener {
    private final ext a;
    private final View b;
    private final View c;

    public exl(ext ext, View view, View view2) {
        this.a = ext;
        this.b = view;
        this.c = view2;
    }

    public final void onScrollChanged() {
        ext ext = this.a;
        View view = this.b;
        View view2 = this.c;
        ext.a(view.getBottom() - (view2.getHeight() + view2.getScrollY()) != 0);
    }
}
