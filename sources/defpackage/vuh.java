package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: vuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vuh implements View.OnTouchListener {
    private final vuj a;

    public vuh(vuj vuj) {
        this.a = vuj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SwitchCompat switchCompat = this.a.s;
        wil.a(motionEvent, view, (View) switchCompat);
        return switchCompat.dispatchTouchEvent(motionEvent);
    }
}
