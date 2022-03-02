package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

/* renamed from: ezt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ezt extends Dialog {
    final /* synthetic */ ezu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ezt(ezu ezu, Context context, int i) {
        super(context, i);
        this.a = ezu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = (defpackage.fae) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r3 = this;
            ezu r0 = r3.a
            com.google.android.chimera.FragmentManager r0 = r0.getChildFragmentManager()
            int r1 = defpackage.ezu.b
            com.google.android.chimera.Fragment r0 = r0.findFragmentById(r1)
            if (r0 == 0) goto L_0x002a
            fae r0 = (defpackage.fae) r0
            android.webkit.WebView r1 = r0.b
            if (r1 == 0) goto L_0x002a
            boolean r1 = r1.canGoBack()
            if (r1 != 0) goto L_0x001b
            goto L_0x002a
        L_0x001b:
            android.webkit.WebView r0 = r0.b
            r0.goBack()
            ezu r0 = r3.a
            fgr r0 = r0.e
            r1 = 11
            r0.a(r1)
            return
        L_0x002a:
            ezu r0 = r3.a
            android.app.Dialog r0 = r0.getDialog()
            if (r0 == 0) goto L_0x0040
            ezu r1 = r3.a
            fgr r1 = r1.e
            r2 = 12
            r1.a(r2)
            ezu r1 = r3.a
            r1.onDismiss(r0)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezt.onBackPressed():void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View decorView;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Window window = getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null)) {
            Rect rect = new Rect();
            decorView.getHitRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                ezu ezu = this.a;
                int i = ezu.a;
                ezu.e.a(6);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
