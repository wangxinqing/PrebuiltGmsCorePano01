package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: ajxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajxs {
    public final ArrayList a = new ArrayList();
    public ajxr b = null;
    public ValueAnimator c = null;
    private final Animator.AnimatorListener d = new ajxq(this);

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        ajxr ajxr = new ajxr(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(ajxr);
    }
}
