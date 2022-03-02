package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ddm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ddm implements ViewTreeObserver.OnScrollChangedListener {
    private final ddn a;
    private final int b;

    public ddm(ddn ddn, int i) {
        this.a = ddn;
        this.b = i;
    }

    public final void onScrollChanged() {
        ddn ddn = this.a;
        int i = this.b;
        ddp ddp = ddn.a;
        ddp.a(ddp.d.getScrollX(), i);
    }
}
