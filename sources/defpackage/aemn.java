package defpackage;

import android.view.Choreographer;

/* renamed from: aemn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aemn {
    private Choreographer.FrameCallback a;

    /* access modifiers changed from: package-private */
    public final Choreographer.FrameCallback a() {
        if (this.a == null) {
            this.a = new aemm(this);
        }
        return this.a;
    }

    public abstract void a(long j);
}
