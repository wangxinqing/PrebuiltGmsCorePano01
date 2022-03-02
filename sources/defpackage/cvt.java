package defpackage;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* renamed from: cvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cvt implements Runnable {
    private final cvu a;
    private final HorizontalScrollView b;
    private final LinearLayout c;

    public cvt(cvu cvu, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.a = cvu;
        this.b = horizontalScrollView;
        this.c = linearLayout;
    }

    public final void run() {
        cvu cvu = this.a;
        HorizontalScrollView horizontalScrollView = this.b;
        LinearLayout linearLayout = this.c;
        if (cyd.a(cvu.c.e)) {
            horizontalScrollView.scrollTo(linearLayout.getWidth(), 0);
        } else {
            horizontalScrollView.scrollTo(0, 0);
        }
    }
}
