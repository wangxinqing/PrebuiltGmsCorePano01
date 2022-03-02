package defpackage;

import android.view.Choreographer;

/* renamed from: aemm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aemm implements Choreographer.FrameCallback {
    private final aemn a;

    public aemm(aemn aemn) {
        this.a = aemn;
    }

    public final void doFrame(long j) {
        this.a.a(j);
    }
}
