package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: zy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zy implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ aai b;

    public zy(aai aai, ArrayList arrayList) {
        this.b = aai;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aah aah = (aah) arrayList.get(i);
            aai aai = this.b;
            adl adl = aah.a;
            int i2 = aah.b;
            int i3 = aah.c;
            int i4 = aah.d;
            int i5 = aah.e;
            View view = adl.a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            aai.e.add(adl);
            animate.setDuration(250).setListener(new aad(aai, adl, i6, view, i7, animate)).start();
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
