package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

/* renamed from: ewc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ewc extends Dialog {
    final /* synthetic */ ewd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ewc(ewd ewd, Context context, int i) {
        super(context, i);
        this.a = ewd;
    }

    public final void onBackPressed() {
        ewd ewd = this.a;
        anaf anaf = ewd.a;
        ewd.b.a(12);
        super.onBackPressed();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            Rect rect = new Rect();
            decorView.getHitRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                ewd ewd = this.a;
                anaf anaf = ewd.a;
                ewd.b.a(6);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
