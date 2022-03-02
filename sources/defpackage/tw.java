package defpackage;

import android.view.MenuItem;
import android.view.View;

/* renamed from: tw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tw implements wr {
    final /* synthetic */ ty a;

    public tw(ty tyVar) {
        this.a = tyVar;
    }

    public final void a(wt wtVar) {
        ty tyVar = this.a;
        if (tyVar.c == null) {
            return;
        }
        if (tyVar.a.i()) {
            this.a.c.onPanelClosed(108, wtVar);
        } else if (this.a.c.onPreparePanel(0, (View) null, wtVar)) {
            this.a.c.onMenuOpened(108, wtVar);
        }
    }

    public final boolean a(wt wtVar, MenuItem menuItem) {
        return false;
    }
}
