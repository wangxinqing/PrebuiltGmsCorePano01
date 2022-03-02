package defpackage;

import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: ewr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ewr implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ews a;

    public ewr(ews ews) {
        this.a = ews;
    }

    public final void onGlobalLayout() {
        int i;
        this.a.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        List list = (List) this.a.b.i.b();
        if (list != null) {
            if (list.size() < 3) {
                i = this.a.d.getBottom();
            } else {
                adl findViewHolderForLayoutPosition = this.a.d.findViewHolderForLayoutPosition(2);
                if (findViewHolderForLayoutPosition != null) {
                    i = this.a.d.getTop() + ((findViewHolderForLayoutPosition.a.getBottom() + findViewHolderForLayoutPosition.a.getTop()) / 2);
                } else {
                    return;
                }
            }
            this.a.a.a(i);
        }
    }
}
