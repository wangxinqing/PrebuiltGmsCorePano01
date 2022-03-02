package defpackage;

import android.animation.ObjectAnimator;

/* renamed from: aeou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeou {
    public static ObjectAnimator a(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{1.0f});
        ofFloat.setInterpolator(aemq.a);
        ofFloat.setDuration(500);
        return ofFloat;
    }

    public static ObjectAnimator b(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{0.0f});
        ofFloat.setInterpolator(aemq.a);
        ofFloat.setDuration(500);
        return ofFloat;
    }
}
