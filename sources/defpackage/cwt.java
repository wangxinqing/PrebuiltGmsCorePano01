package defpackage;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* renamed from: cwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cwt implements Runnable {
    private final cwu a;
    private final HorizontalScrollView b;
    private final LinearLayout c;

    public cwt(cwu cwu, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.a = cwu;
        this.b = horizontalScrollView;
        this.c = linearLayout;
    }

    public final void run() {
        cwu cwu = this.a;
        HorizontalScrollView horizontalScrollView = this.b;
        LinearLayout linearLayout = this.c;
        if (cyd.a(cwu.c.e)) {
            horizontalScrollView.scrollTo(linearLayout.getWidth(), 0);
        } else {
            horizontalScrollView.scrollTo(0, 0);
        }
    }
}
