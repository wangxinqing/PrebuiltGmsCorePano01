package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: aenc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aenc implements aend {
    static final aend a = new aenc();

    private aenc() {
    }

    public final void a(ValueAnimator valueAnimator, View view) {
        int i = aene.a;
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
