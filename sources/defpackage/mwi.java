package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: mwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mwi implements Runnable {
    private final int a;
    private final View b;
    private final View c;

    public mwi(int i, View view, View view2) {
        this.a = i;
        this.b = view;
        this.c = view2;
    }

    public final void run() {
        int i = this.a;
        View view = this.b;
        View view2 = this.c;
        int ceil = (int) Math.ceil((double) (((float) (i - view.getHeight())) / 2.0f));
        int ceil2 = (int) Math.ceil((double) (((float) (i - view.getWidth())) / 2.0f));
        if (ceil > 0 || ceil2 > 0) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            rect.top -= ceil;
            rect.bottom += ceil;
            rect.left -= ceil2;
            rect.right += ceil2;
            view2.setTouchDelegate(new TouchDelegate(rect, view));
        }
    }
}
