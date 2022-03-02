package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: wi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wi implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ wn a;

    public wi(wn wnVar) {
        this.a = wnVar;
    }

    public final void onGlobalLayout() {
        if (this.a.e() && this.a.b.size() > 0) {
            if (!((wm) this.a.b.get(0)).a.p) {
                View view = this.a.d;
                if (view != null && view.isShown()) {
                    List list = this.a.b;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((wm) list.get(i)).a.ar();
                    }
                    return;
                }
                this.a.d();
            }
        }
    }
}
