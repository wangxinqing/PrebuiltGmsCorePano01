package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: akew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akew extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ akey b;

    public akew(akey akey, View view) {
        this.b = akey;
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        akey akey = this.b;
        int i = akey.k;
        akey.b.removeView(this.a);
    }
}
