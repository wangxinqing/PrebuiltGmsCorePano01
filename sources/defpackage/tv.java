package defpackage;

import android.view.Window;

/* renamed from: tv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tv implements xg {
    final /* synthetic */ ty a;
    private boolean b;

    public tv(ty tyVar) {
        this.a = tyVar;
    }

    public final void a(wt wtVar, boolean z) {
        if (!this.b) {
            this.b = true;
            this.a.a.n();
            Window.Callback callback = this.a.c;
            if (callback != null) {
                callback.onPanelClosed(108, wtVar);
            }
            this.b = false;
        }
    }

    public final boolean a(wt wtVar) {
        Window.Callback callback = this.a.c;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(108, wtVar);
        return true;
    }
}
