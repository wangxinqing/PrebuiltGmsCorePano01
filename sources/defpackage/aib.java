package defpackage;

import android.view.Choreographer;

/* renamed from: aib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aib {
    final ahz a;
    private final Choreographer b = Choreographer.getInstance();
    private final Choreographer.FrameCallback c = new aic(this);

    public final void a() {
        this.b.postFrameCallback(this.c);
    }

    public aib(ahz ahz) {
        this.a = ahz;
    }
}
