package defpackage;

import android.view.Menu;
import android.view.View;

/* renamed from: tt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tt implements Runnable {
    final /* synthetic */ ty a;

    public tt(ty tyVar) {
        this.a = tyVar;
    }

    public final void run() {
        wt wtVar;
        ty tyVar = this.a;
        Menu q = tyVar.q();
        if (q instanceof wt) {
            wtVar = (wt) q;
        } else {
            wtVar = null;
        }
        if (wtVar != null) {
            wtVar.e();
        }
        try {
            q.clear();
            if (!tyVar.c.onCreatePanelMenu(0, q) || !tyVar.c.onPreparePanel(0, (View) null, q)) {
                q.clear();
            }
            if (wtVar != null) {
                wtVar.f();
            }
        } catch (Throwable th) {
            if (wtVar != null) {
                wtVar.f();
            }
            throw th;
        }
    }
}
