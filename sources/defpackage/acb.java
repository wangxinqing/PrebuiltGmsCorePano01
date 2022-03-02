package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: acb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acb implements Runnable {
    final /* synthetic */ RecyclerView a;

    public acb(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        aco aco = this.a.mItemAnimator;
        if (aco != null) {
            aco.a();
        }
        this.a.mPostedAnimatorRunner = false;
    }
}
