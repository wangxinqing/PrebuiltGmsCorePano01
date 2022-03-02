package defpackage;

import android.widget.AbsListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: pvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvd implements AbsListView.OnScrollListener {
    final /* synthetic */ pvi a;

    public pvd(pvi pvi) {
        this.a = pvi;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (this.a.b.getChildCount() <= 0 || this.a.b.getChildAt(0).getTop() >= 0) {
            z = true;
        } else {
            z = false;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.a.h;
        if (i != 0) {
            z2 = false;
        } else if (!z) {
            z2 = false;
        }
        swipeRefreshLayout.setEnabled(z2);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
