package defpackage;

import android.view.Menu;
import android.view.Window;

/* renamed from: tm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tm implements xg {
    final /* synthetic */ tn a;

    public tm(tn tnVar) {
        this.a = tnVar;
    }

    public final void a(wt wtVar, boolean z) {
        wt wtVar2;
        wt j = wtVar.j();
        tn tnVar = this.a;
        if (j == wtVar) {
            wtVar2 = wtVar;
        } else {
            wtVar2 = j;
        }
        tl a2 = tnVar.a((Menu) wtVar2);
        if (a2 == null) {
            return;
        }
        if (j != wtVar) {
            this.a.a(a2.a, a2, (Menu) j);
            this.a.a(a2, true);
            return;
        }
        this.a.a(a2, z);
    }

    public final boolean a(wt wtVar) {
        Window.Callback q;
        if (wtVar != null) {
            return true;
        }
        tn tnVar = this.a;
        if (!tnVar.s || (q = tnVar.q()) == null || this.a.y) {
            return true;
        }
        q.onMenuOpened(108, (Menu) null);
        return true;
    }
}
