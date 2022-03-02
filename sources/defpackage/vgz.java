package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: vgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vgz implements View.OnTouchListener {
    private final vhg a;

    public vgz(vhg vhg) {
        this.a = vhg;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        vhg vhg = this.a;
        if (motionEvent.getAction() == 1) {
            vhg.finish();
        }
        return true;
    }
}
