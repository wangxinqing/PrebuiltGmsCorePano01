package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import com.google.android.pano.chimera.Action;

/* renamed from: akdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akdm extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Action c;
    final /* synthetic */ akdr d;

    public akdm(akdr akdr, View view, boolean z, Action action) {
        this.d = akdr;
        this.a = view;
        this.b = z;
        this.c = action;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setLayerType(0, (Paint) null);
        if (!this.b) {
            akdq akdq = this.d.e;
            if (akdq != null) {
                akdq.d(this.c);
            }
            akdo akdo = this.d.c;
            if (akdo != null) {
                akdo.a(this.c);
                return;
            }
            return;
        }
        akdq akdq2 = this.d.e;
        if (akdq2 != null) {
            akdq2.c(this.c);
        }
    }
}
