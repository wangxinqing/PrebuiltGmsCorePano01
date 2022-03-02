package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: cwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class cwr implements Runnable {
    private final FrameLayout a;
    private final LinearLayout.LayoutParams b;

    public cwr(FrameLayout frameLayout, LinearLayout.LayoutParams layoutParams) {
        this.a = frameLayout;
        this.b = layoutParams;
    }

    public final void run() {
        this.a.setLayoutParams(this.b);
    }
}
