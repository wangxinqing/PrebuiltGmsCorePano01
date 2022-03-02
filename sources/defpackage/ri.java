package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: ri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ri implements Runnable {
    final /* synthetic */ rj a;

    public ri(rj rjVar) {
        this.a = rjVar;
    }

    public final void run() {
        rj rjVar = this.a;
        if (rjVar.e) {
            if (rjVar.c) {
                rjVar.c = false;
                rh rhVar = rjVar.a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                rhVar.e = currentAnimationTimeMillis;
                rhVar.i = -1;
                rhVar.f = currentAnimationTimeMillis;
                rhVar.j = 0.5f;
                rhVar.g = 0;
                rhVar.h = 0;
            }
            rh rhVar2 = this.a.a;
            if ((rhVar2.i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= rhVar2.i + ((long) rhVar2.k)) && this.a.a()) {
                rj rjVar2 = this.a;
                if (rjVar2.d) {
                    rjVar2.d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    rjVar2.b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (rhVar2.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = rhVar2.a(currentAnimationTimeMillis2);
                    long j = rhVar2.f;
                    rhVar2.f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - j)) * ((-4.0f * a2 * a2) + (a2 * 4.0f));
                    rhVar2.g = (int) (rhVar2.c * f);
                    int i = (int) (f * rhVar2.d);
                    rhVar2.h = i;
                    ListView listView = this.a.f;
                    int i2 = Build.VERSION.SDK_INT;
                    listView.scrollListBy(i);
                    qb.a(this.a.b, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            this.a.e = false;
        }
    }
}
