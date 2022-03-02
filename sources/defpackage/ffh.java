package defpackage;

import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: ffh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ffh implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ffi a;

    public ffh(ffi ffi) {
        this.a = ffi;
    }

    public final void onGlobalLayout() {
        int i;
        this.a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        List list = (List) this.a.a.k.b();
        if (list != null) {
            if (list.size() < 3) {
                i = this.a.c.getBottom();
            } else {
                adl findViewHolderForLayoutPosition = this.a.c.findViewHolderForLayoutPosition(2);
                if (findViewHolderForLayoutPosition != null) {
                    i = this.a.c.getTop() + ((findViewHolderForLayoutPosition.a.getBottom() + findViewHolderForLayoutPosition.a.getTop()) / 2);
                } else {
                    return;
                }
            }
            this.a.b.a(i);
        }
    }
}
