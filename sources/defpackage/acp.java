package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: acp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acp implements acm {
    final /* synthetic */ RecyclerView a;

    public acp(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(adl adl) {
        adl.a(true);
        if (adl.h != null && adl.i == null) {
            adl.h = null;
        }
        adl.i = null;
        if ((adl.j & 16) == 0 && !this.a.removeAnimatingView(adl.a) && adl.o()) {
            this.a.removeDetachedView(adl.a, false);
        }
    }
}
