package defpackage;

import android.animation.Animator;
import android.view.animation.Animation;

/* renamed from: gq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gq {
    public final Animation a;
    public final Animator b;

    public gq(Animator animator) {
        this.a = null;
        this.b = animator;
    }

    public gq(Animation animation) {
        this.a = animation;
        this.b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}
