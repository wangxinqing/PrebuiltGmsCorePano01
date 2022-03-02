package defpackage;

import android.view.View;

/* renamed from: sl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sl implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ sq c;

    public sl(sq sqVar, View view, View view2) {
        this.c = sqVar;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        sq.a((View) this.c.f, this.a, this.b);
    }
}
