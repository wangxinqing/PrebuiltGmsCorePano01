package defpackage;

import android.view.Window;

/* renamed from: tc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tc implements xg {
    final /* synthetic */ tn a;

    public tc(tn tnVar) {
        this.a = tnVar;
    }

    public final void a(wt wtVar, boolean z) {
        this.a.b(wtVar);
    }

    public final boolean a(wt wtVar) {
        Window.Callback q = this.a.q();
        if (q == null) {
            return true;
        }
        q.onMenuOpened(108, wtVar);
        return true;
    }
}
