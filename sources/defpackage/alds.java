package defpackage;

import android.widget.FrameLayout;

/* renamed from: alds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alds implements Runnable {
    final /* synthetic */ aldu a;

    public alds(aldu aldu) {
        this.a = aldu;
    }

    public final void run() {
        aldu aldu = this.a;
        aleo aleo = aldu.a;
        int b = aldu.c.b(alfg.COLLAPSED);
        alee alee = (alee) aleo.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) alee.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, b);
        alee.requestLayout();
    }
}
