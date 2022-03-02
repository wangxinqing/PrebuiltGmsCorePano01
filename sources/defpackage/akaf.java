package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* renamed from: akaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akaf implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            akat akat = (akat) message.obj;
            akat.e.d = new akal(akat);
            if (akat.e.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = akat.e.getLayoutParams();
                if (layoutParams instanceof ahm) {
                    ahm ahm = (ahm) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    baseTransientBottomBar$Behavior.g.a = akat.m;
                    baseTransientBottomBar$Behavior.f = new akan(akat);
                    ahm.a((ahj) baseTransientBottomBar$Behavior);
                    ahm.g = 80;
                }
                akat.a();
                akat.e.setVisibility(4);
                akat.c.addView(akat.e);
            }
            if (!qb.A(akat.e)) {
                akat.e.c = new akam(akat);
            } else {
                akat.f();
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            akat akat2 = (akat) message.obj;
            int i2 = message.arg1;
            if (!akat2.i() || akat2.e.getVisibility() != 0) {
                akat2.j();
            } else if (akat2.e.a != 1) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[]{0, akat2.g()});
                valueAnimator.setInterpolator(ajrr.b);
                valueAnimator.setDuration(250);
                valueAnimator.addListener(new akad(akat2, i2));
                valueAnimator.addUpdateListener(new akae(akat2));
                valueAnimator.start();
            } else {
                ValueAnimator a = akat2.a(1.0f, 0.0f);
                a.setDuration(75);
                a.addListener(new ajzy(akat2, i2));
                a.start();
            }
            return true;
        }
    }
}
