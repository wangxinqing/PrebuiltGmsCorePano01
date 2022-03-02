package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: jmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jmj implements View.OnTouchListener {
    final /* synthetic */ jml a;

    public jmj(jml jml) {
        this.a = jml;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        this.a.b();
        return false;
    }
}
