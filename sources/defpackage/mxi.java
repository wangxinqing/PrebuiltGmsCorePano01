package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/* renamed from: mxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mxi implements View.OnTouchListener {
    final /* synthetic */ Toast a;

    public mxi(Toast toast) {
        this.a = toast;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.cancel();
        } else if (action == 1) {
            view.performClick();
        }
        return true;
    }
}
