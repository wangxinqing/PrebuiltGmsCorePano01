package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: zz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zz implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ aai b;

    public zz(aai aai, ArrayList arrayList) {
        this.b = aai;
        this.a = arrayList;
    }

    public final void run() {
        View view;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aag aag = (aag) arrayList.get(i);
            aai aai = this.b;
            adl adl = aag.a;
            View view2 = null;
            if (adl != null) {
                view = adl.a;
            } else {
                view = null;
            }
            adl adl2 = aag.b;
            if (adl2 != null) {
                view2 = adl2.a;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(250);
                aai.g.add(aag.a);
                duration.translationX((float) (aag.e - aag.c));
                duration.translationY((float) (aag.f - aag.d));
                duration.alpha(0.0f).setListener(new aae(aai, aag, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                aai.g.add(aag.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(250).alpha(1.0f).setListener(new aaf(aai, aag, animate, view2)).start();
            }
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
