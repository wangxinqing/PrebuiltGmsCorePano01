package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: wiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class wiw implements View.OnTouchListener {
    private final View a;

    public wiw(View view) {
        this.a = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.a;
        wil.a(motionEvent, view, view2);
        return view2.dispatchTouchEvent(motionEvent);
    }
}
