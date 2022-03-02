package defpackage;

import android.animation.ValueAnimator;

/* renamed from: aao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aao implements Runnable {
    final /* synthetic */ aas a;

    public aao(aas aas) {
        this.a = aas;
    }

    public final void run() {
        aas aas = this.a;
        int i = aas.q;
        if (i == 1) {
            aas.p.cancel();
        } else if (i != 2) {
            return;
        }
        aas.q = 3;
        ValueAnimator valueAnimator = aas.p;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        aas.p.setDuration(500);
        aas.p.start();
    }
}
