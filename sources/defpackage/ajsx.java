package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: ajsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajsx implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public ajsx(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    public final void run() {
        akan akan;
        sd sdVar = this.a.a;
        if (sdVar != null && sdVar.b()) {
            qb.a(this.b, (Runnable) this);
        } else if (this.c && (akan = this.a.f) != null) {
            akan.a(this.b);
        }
    }
}
