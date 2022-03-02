package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: aau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aau implements Runnable {
    final /* synthetic */ aav a;

    public aau(aav aav) {
        this.a = aav;
    }

    public final void run() {
        aav aav = this.a;
        aav.d();
        View view = aav.c;
        if (view.isEnabled() && !view.isLongClickable() && aav.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            aav.d = true;
        }
    }
}
