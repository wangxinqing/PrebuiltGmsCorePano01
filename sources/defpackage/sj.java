package defpackage;

import android.view.View;

/* renamed from: sj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sj implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ sq c;

    public sj(sq sqVar, View view, View view2) {
        this.c = sqVar;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        sq.a((View) this.c.s, this.a, this.b);
    }
}
