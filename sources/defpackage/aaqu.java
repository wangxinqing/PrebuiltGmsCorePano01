package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: aaqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqu implements Runnable {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ aco b;

    public aaqu(RecyclerView recyclerView, aco aco) {
        this.a = recyclerView;
        this.b = aco;
    }

    public final void run() {
        this.a.setItemAnimator(this.b);
    }
}
