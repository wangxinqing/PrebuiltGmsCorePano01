package defpackage;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: sk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sk implements AbsListView.OnScrollListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public sk(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        sq.a((View) absListView, this.a, this.b);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
