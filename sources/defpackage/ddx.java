package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: ddx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ddx implements View.OnTouchListener {
    private final dee a;

    public ddx(dee dee) {
        this.a = dee;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dee dee = this.a;
        if (motionEvent.getAction() == 1) {
            view.performClick();
            return false;
        }
        dee.d.clearFocus();
        return false;
    }
}
