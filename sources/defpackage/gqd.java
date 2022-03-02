package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: gqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gqd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ gqe a;

    public gqd(gqe gqe) {
        this.a = gqe;
    }

    public final void onGlobalLayout() {
        boolean z;
        int i;
        gqe gqe = this.a;
        Rect rect = new Rect();
        gqe.a.getWindowVisibleDisplayFrame(rect);
        if (rect.width() != gqe.c) {
            gqe.c = rect.width();
            z = true;
        } else {
            z = false;
        }
        if (rect.height() != gqe.d) {
            gqe.d = rect.height();
        } else if (!z) {
            return;
        }
        for (goy goy : gqe.b) {
            int i2 = gqe.c;
            int i3 = gqe.d;
            MinuteMaidChimeraActivity.a.b(String.format("onSizeChanged %d %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}), new Object[0]);
            int identifier = goy.a.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = goy.a.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            View findViewById = goy.a.findViewById(16908290);
            findViewById.getLayoutParams().height = i3 + i;
            findViewById.requestLayout();
        }
    }
}
