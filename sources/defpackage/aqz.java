package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: aqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqz extends asm {
    public aqz() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float a(defpackage.arw r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0013
            java.util.Map r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0013
            float r1 = r1.floatValue()
            return r1
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqz.a(arw, float):float");
    }

    public final Animator b(View view, arw arw) {
        asc.a.b();
        return a(view, a(arw, 1.0f), 0.0f);
    }

    public aqz(int i) {
        this.o = i;
    }

    private final Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        asc.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, asc.b, new float[]{f2});
        ofFloat.addListener(new aqy(view));
        a((arm) new aqx(view));
        return ofFloat;
    }

    public final Animator a(View view, arw arw) {
        float f = 0.0f;
        float a = a(arw, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return a(view, f, 1.0f);
    }

    public final void a(arw arw) {
        asm.d(arw);
        arw.a.put("android:fade:transitionAlpha", Float.valueOf(asc.a(arw.b)));
    }
}
