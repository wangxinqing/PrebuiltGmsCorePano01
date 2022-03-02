package defpackage;

import android.widget.AbsListView;

/* renamed from: abp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abp implements AbsListView.OnScrollListener {
    final /* synthetic */ abs a;

    public abp(abs abs) {
        this.a = abs;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.j() && this.a.q.getContentView() != null) {
            abs abs = this.a;
            abs.o.removeCallbacks(abs.n);
            this.a.n.run();
        }
    }
}
