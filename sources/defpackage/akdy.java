package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import com.google.android.pano.widget.FrameLayoutWithShadows;

/* renamed from: akdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akdy extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;
    final /* synthetic */ akdz c;

    public akdy(akdz akdz, View view, boolean z) {
        this.c = akdz;
        this.a = view;
        this.b = z;
    }

    public final void onAnimationEnd(Animator animator) {
        FrameLayoutWithShadows frameLayoutWithShadows;
        this.a.setLayerType(0, (Paint) null);
        if (this.b && (frameLayoutWithShadows = this.c.c) != null) {
            frameLayoutWithShadows.a(1.0f);
        }
    }
}
