package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: hy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hy implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ Rect b;

    public hy(View view, Rect rect) {
        this.a = view;
        this.b = rect;
    }

    public final void run() {
        il ilVar = ib.a;
        View view = this.a;
        if (view != null) {
            il.a(view, this.b);
        }
    }
}
