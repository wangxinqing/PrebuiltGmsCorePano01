package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: ddv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ddv implements ax {
    private final dee a;

    public ddv(dee dee) {
        this.a = dee;
    }

    public final void a(Object obj) {
        dee dee = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout = dee.f;
        if (swipeRefreshLayout.b != booleanValue) {
            swipeRefreshLayout.a(booleanValue);
        }
    }
}
