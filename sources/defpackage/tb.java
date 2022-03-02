package defpackage;

import android.view.View;

/* renamed from: tb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tb extends qi {
    final /* synthetic */ tn a;

    public tb(tn tnVar) {
        this.a = tnVar;
    }

    public final void b() {
        this.a.l.setAlpha(1.0f);
        this.a.o.a((qh) null);
        this.a.o = null;
    }

    public final void c() {
        this.a.l.setVisibility(0);
        this.a.l.sendAccessibilityEvent(32);
        if (this.a.l.getParent() instanceof View) {
            qb.r((View) this.a.l.getParent());
        }
    }
}
