package defpackage;

import android.widget.AbsListView;

/* renamed from: alix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alix implements AbsListView.OnScrollListener {
    private final aljc a;

    public alix(aljc aljc) {
        this.a = aljc;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (i + i2 < i3) {
            this.a.a(true);
        } else {
            this.a.a(false);
        }
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
