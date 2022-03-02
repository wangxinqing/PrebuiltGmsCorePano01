package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;

/* renamed from: albq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class albq implements Runnable {
    final /* synthetic */ albv a;

    public albq(albv albv) {
        this.a = albv;
    }

    public final void run() {
        akzj akzj = this.a.c;
        int width = akzj.getView().getWidth();
        int height = this.a.c.getView().getHeight();
        if (!akzj.w) {
            akzj.w = true;
            akzj.n = width;
            akzj.o = height;
            akzj.e.a((rqs) new akzd(akzj));
            ((FrameLayout.LayoutParams) akzj.g.getLayoutParams()).setMargins(0, 0, 0, alan.a(18.0f, (Context) akzj.getActivity()));
            ((FrameLayout.LayoutParams) akzj.h.getLayoutParams()).setMargins(0, 0, 0, 0);
            ((FrameLayout.LayoutParams) akzj.i.getLayoutParams()).setMargins(0, 0, 0, 0);
            if (akzj.j != null) {
                akzj.h();
            }
            akzj.m = new Point(akzj.n / 2, akzj.o / 2);
            akzj.i();
        }
    }
}
