package defpackage;

import android.animation.AnimatorSet;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;

/* renamed from: aenw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aenw implements Runnable {
    private final aeoe a;

    public aenw(aeoe aeoe) {
        this.a = aeoe;
    }

    public final void run() {
        aeoe aeoe = this.a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = aeoe.c;
        clippableRoundedCornerLayout.setTranslationY((float) clippableRoundedCornerLayout.getHeight());
        AnimatorSet a2 = aeoe.a(true);
        a2.addListener(new aeob(aeoe));
        a2.start();
    }
}
