package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: bsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bsk extends acq {
    public Drawable a;
    public int b;
    final /* synthetic */ bso c;

    public bsk(bso bso) {
        this.c = bso;
    }

    private static final boolean a(View view, RecyclerView recyclerView) {
        adl childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof anb) || !((anb) childViewHolder).v) {
            return false;
        }
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return true;
        }
        adl childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
        if (!(childViewHolder2 instanceof anb) || !((anb) childViewHolder2).u) {
            return false;
        }
        return true;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (a(childAt, recyclerView)) {
                    int n = ((int) qb.n(childAt)) + childAt.getHeight();
                    this.a.setBounds(0, n, width, this.b + n);
                    this.a.draw(canvas);
                }
            }
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, adi adi) {
        if (a(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }
}
