package defpackage;

import android.view.View;

/* renamed from: yb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yb implements Runnable {
    final /* synthetic */ yh a;
    private final ye b;

    public yb(yh yhVar, ye yeVar) {
        this.a = yhVar;
        this.b = yeVar;
    }

    public final void run() {
        wr wrVar;
        wt wtVar = this.a.c;
        if (!(wtVar == null || (wrVar = wtVar.b) == null)) {
            wrVar.a(wtVar);
        }
        View view = (View) this.a.f;
        if (!(view == null || view.getWindowToken() == null || !this.b.b())) {
            this.a.l = this.b;
        }
        this.a.n = null;
    }
}
