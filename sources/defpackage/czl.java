package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: czl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class czl extends acq {
    private final int a;

    public czl(int i) {
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, adi adi) {
        if (recyclerView.getChildAdapterPosition(view) != recyclerView.getAdapter().a() - 1) {
            rect.bottom = this.a;
        }
    }
}
