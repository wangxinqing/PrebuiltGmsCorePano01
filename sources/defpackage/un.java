package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;

/* renamed from: un  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class un extends up {
    private final ObjectAnimator a;
    private final boolean b;

    public final void a() {
        this.a.start();
    }

    public final void b() {
        this.a.cancel();
    }

    public final boolean c() {
        return this.b;
    }

    public final void d() {
        this.a.reverse();
    }

    public un(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int i2;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z) {
            i = numberOfFrames - 1;
        } else {
            i = 0;
        }
        if (!z) {
            i2 = numberOfFrames - 1;
        } else {
            i2 = 0;
        }
        uo uoVar = new uo(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
        int i3 = Build.VERSION.SDK_INT;
        ofInt.setAutoCancel(true);
        ofInt.setDuration((long) uoVar.a);
        ofInt.setInterpolator(uoVar);
        this.b = z2;
        this.a = ofInt;
    }
}
