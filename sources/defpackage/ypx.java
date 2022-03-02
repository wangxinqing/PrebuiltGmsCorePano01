package defpackage;

import android.animation.ObjectAnimator;

/* renamed from: ypx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ypx implements Runnable {
    final /* synthetic */ ObjectAnimator a;

    public ypx(ObjectAnimator objectAnimator) {
        this.a = objectAnimator;
    }

    public final void run() {
        this.a.start();
    }
}
