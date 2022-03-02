package defpackage;

import android.view.ViewGroup;
import com.google.android.gms.nearby.sharing.animation.FadeTransition;

/* renamed from: vhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vhb implements Runnable {
    private final vhg a;

    public vhb(vhg vhg) {
        this.a = vhg;
    }

    public final void run() {
        vhg vhg = this.a;
        vhg.f = false;
        if (FadeTransition.a(vhg.c)) {
            vhg.c.setVisibility(0);
            vhg.d.getLayoutParams().height = -2;
            vhg.getWindow().getDecorView().setSystemUiVisibility(1280);
            FadeTransition fadeTransition = new FadeTransition(vhg);
            fadeTransition.a = 1;
            fadeTransition.setDuration(1);
            ViewGroup viewGroup = (ViewGroup) vhg.findViewById(16908290);
            vhg.a(viewGroup, viewGroup, fadeTransition);
        }
        vhg.e();
        vhg.g = null;
    }
}
