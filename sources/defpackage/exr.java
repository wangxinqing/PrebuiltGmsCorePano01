package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: exr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class exr implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ ext d;

    public exr(ext ext, View view, View view2, View view3) {
        this.d = ext;
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    public final void onGlobalLayout() {
        boolean z;
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ext ext = this.d;
        if (this.b.getHeight() != this.c.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        ext.a(z);
    }
}
