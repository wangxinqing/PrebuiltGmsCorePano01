package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: bsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bsj implements Runnable {
    final /* synthetic */ bso a;

    public bsj(bso bso) {
        this.a = bso;
    }

    public final void run() {
        RecyclerView recyclerView = this.a.b;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
