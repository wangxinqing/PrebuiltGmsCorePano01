package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: dbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dbb implements ax {
    private final dbi a;

    public dbb(dbi dbi) {
        this.a = dbi;
    }

    public final void a(Object obj) {
        dbi dbi = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout = dbi.b;
        if (swipeRefreshLayout.b != booleanValue) {
            swipeRefreshLayout.a(booleanValue);
        }
    }
}
