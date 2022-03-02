package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.smart_profile.SmartProfileContainerView;

/* renamed from: abgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgy extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ SmartProfileContainerView a;

    public abgy(SmartProfileContainerView smartProfileContainerView) {
        this.a = smartProfileContainerView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        this.a.c.c();
        this.a.f.forceFinished(true);
        SmartProfileContainerView smartProfileContainerView = this.a;
        int i2 = smartProfileContainerView.a;
        if (i2 == 1) {
            i = smartProfileContainerView.c.getHeight();
        } else if (i2 != 2) {
            i = (int) smartProfileContainerView.d();
        } else {
            i = smartProfileContainerView.e.getScrollY();
            f2 = -f2;
        }
        this.a.a((float) i, f2);
        qb.e(this.a);
        return true;
    }
}
