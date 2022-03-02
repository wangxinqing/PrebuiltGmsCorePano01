package defpackage;

import java.util.ArrayList;

/* renamed from: syh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syh implements Runnable {
    final /* synthetic */ sze a;
    final /* synthetic */ Runnable b;

    public syh(sze sze, Runnable runnable) {
        this.a = sze;
        this.b = runnable;
    }

    public final void run() {
        this.a.y();
        sze sze = this.a;
        Runnable runnable = this.b;
        sze.r();
        if (sze.j == null) {
            sze.j = new ArrayList();
        }
        sze.j.add(runnable);
        this.a.u();
    }
}
