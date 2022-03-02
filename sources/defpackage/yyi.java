package defpackage;

import android.view.View;

/* renamed from: yyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yyi implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ yyl b;

    public yyi(yyl yyl, View view) {
        this.b = yyl;
        this.a = view;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
