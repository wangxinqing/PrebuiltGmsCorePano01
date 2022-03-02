package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;

/* renamed from: agbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agbf extends AnimatorListenerAdapter {
    final /* synthetic */ agbh a;

    public agbf(agbh agbh) {
        this.a = agbh;
    }

    public final void onAnimationEnd(Animator animator) {
        agbh agbh = this.a;
        Property property = agbh.f;
        agbh.e = null;
    }
}
