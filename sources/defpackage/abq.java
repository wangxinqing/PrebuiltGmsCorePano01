package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: abq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abq implements View.OnTouchListener {
    final /* synthetic */ abs a;

    public abq(abs abs) {
        this.a = abs;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            PopupWindow popupWindow = this.a.q;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.q.getWidth() || y < 0 || y >= this.a.q.getHeight()) {
                return false;
            }
            abs abs = this.a;
            abs.o.postDelayed(abs.n, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            abs abs2 = this.a;
            abs2.o.removeCallbacks(abs2.n);
            return false;
        }
    }
}
