package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: aca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aca implements Runnable {
    final /* synthetic */ RecyclerView a;

    public aca(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.a;
        if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.a;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }
}
