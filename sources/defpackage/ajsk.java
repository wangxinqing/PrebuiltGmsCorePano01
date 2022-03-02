package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ajsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajsk implements Runnable {
    final /* synthetic */ ajsl a;
    private final CoordinatorLayout b;
    private final View c;

    public ajsk(ajsl ajsl, CoordinatorLayout coordinatorLayout, View view) {
        this.a = ajsl;
        this.b = coordinatorLayout;
        this.c = view;
    }

    public final void run() {
        OverScroller overScroller;
        if (this.c != null && (overScroller = this.a.c) != null) {
            if (overScroller.computeScrollOffset()) {
                ajsl ajsl = this.a;
                ajsl.b(this.b, this.c, ajsl.c.getCurrY());
                qb.a(this.c, (Runnable) this);
                return;
            }
            this.a.b(this.b, this.c);
        }
    }
}
