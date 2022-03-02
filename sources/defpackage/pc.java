package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: pc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pc {
    public final pb a;

    public final void a(MotionEvent motionEvent) {
        this.a.a.onTouchEvent(motionEvent);
    }

    public pc(Context context, GestureDetector.OnGestureListener onGestureListener) {
        int i = Build.VERSION.SDK_INT;
        this.a = new pb(context, onGestureListener);
    }
}
