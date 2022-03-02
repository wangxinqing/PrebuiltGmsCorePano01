package defpackage;

import android.view.Choreographer;

/* renamed from: aemo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aemo extends aemp {
    private final Choreographer a = Choreographer.getInstance();

    public final void a(aemn aemn) {
        this.a.postFrameCallback(aemn.a());
    }

    public final void b(aemn aemn) {
        this.a.removeFrameCallback(aemn.a());
    }
}
