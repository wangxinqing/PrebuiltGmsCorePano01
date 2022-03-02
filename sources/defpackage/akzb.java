package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: akzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akzb implements View.OnTouchListener {
    final /* synthetic */ akzj a;

    public akzb(akzj akzj) {
        this.a = akzj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (motionEvent.getAction() == 0) {
            this.a.j.setAlpha(1.0f);
            return false;
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            this.a.j.setAlpha(0.87f);
            return false;
        }
    }
}
