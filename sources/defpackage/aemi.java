package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: aemi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aemi extends AnimatorListenerAdapter {
    private final ou a = new ou();

    /* access modifiers changed from: protected */
    public final boolean a(Animator animator) {
        return this.a.containsKey(animator) && ((Boolean) this.a.get(animator)).booleanValue();
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.put(animator, true);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.put(animator, false);
    }
}
