package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: akci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akci extends AnimatorListenerAdapter {
    final /* synthetic */ akck a;

    public akci(akck akck) {
        this.a = akck;
    }

    public final void onAnimationEnd(Animator animator) {
        akck akck = this.a;
        CheckableImageButton checkableImageButton = akck.m;
        int i = akck.j;
        checkableImageButton.setChecked(akck.d);
        this.a.i.start();
    }
}
