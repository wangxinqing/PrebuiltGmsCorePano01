package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: aena  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aena implements aend {
    public static final aend a = new aena();

    private aena() {
    }

    public final void a(ValueAnimator valueAnimator, View view) {
        int i = aene.a;
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }
}
