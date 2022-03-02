package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: dcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dcj implements ax {
    private final dcm a;

    public dcj(dcm dcm) {
        this.a = dcm;
    }

    public final void a(Object obj) {
        dcm dcm = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout = dcm.b;
        if (swipeRefreshLayout.b != booleanValue) {
            swipeRefreshLayout.a(booleanValue);
        }
    }
}
