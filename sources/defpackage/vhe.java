package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: vhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vhe implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ vhf a;
    final /* synthetic */ vhg b;

    public vhe(vhg vhg, vhf vhf) {
        this.b = vhg;
        this.a = vhf;
    }

    public final boolean onPreDraw() {
        this.b.c.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.a();
        return true;
    }
}
