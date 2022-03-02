package defpackage;

import android.view.View;
import java.util.Set;

/* renamed from: cxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cxj implements Runnable {
    private final cxk a;
    private final int b;
    private final int c;
    private final int d;
    private final Set e;

    public cxj(cxk cxk, int i, int i2, int i3, Set set) {
        this.a = cxk;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = set;
    }

    public final void run() {
        cxk cxk = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        Set set = this.e;
        cxk.d.s.setPadding(i, 0, i, 0);
        cxu.a(cxk.d.s, i2, i3);
        if (set.size() == 1) {
            cxl.a((View) set.iterator().next(), Math.min(i2 - (i + i), i3));
        }
        if (cyd.a(cxk.d.v.j)) {
            cxl cxl = cxk.d;
            cxl.s.scrollTo(cxl.t.getWidth(), 0);
            return;
        }
        cxk.d.s.scrollTo(0, 0);
    }
}
