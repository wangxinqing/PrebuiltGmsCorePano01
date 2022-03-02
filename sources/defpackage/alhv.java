package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: alhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhv extends acq {
    public Drawable a;
    private int b;
    private int c;
    private int d;

    public alhv() {
    }

    private final boolean a(View view, RecyclerView recyclerView) {
        adl childViewHolder = recyclerView.getChildViewHolder(view);
        int c2 = childViewHolder.c();
        int a2 = recyclerView.getAdapter().a() - 1;
        if (!(childViewHolder instanceof alhu) || ((alhu) childViewHolder).b()) {
            if (this.d == 0) {
                return true;
            }
        } else if (this.d == 1 || c2 == a2) {
            return false;
        }
        if (c2 < a2) {
            adl findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(c2 + 1);
            return !(findViewHolderForLayoutPosition instanceof alhu) || ((alhu) findViewHolderForLayoutPosition).a();
        }
    }

    public alhv(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(alhx.d);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int i = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        a(drawable);
        this.b = dimensionPixelSize;
        this.d = i;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            int i = this.b;
            if (i == 0) {
                i = this.c;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (a(childAt, recyclerView)) {
                    int n = ((int) qb.n(childAt)) + childAt.getHeight();
                    this.a.setBounds(0, n, width, n + i);
                    this.a.draw(canvas);
                }
            }
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, adi adi) {
        if (a(view, recyclerView)) {
            int i = this.b;
            if (i == 0) {
                i = this.c;
            }
            rect.bottom = i;
        }
    }

    public final void a(Drawable drawable) {
        this.c = drawable != null ? drawable.getIntrinsicHeight() : 0;
        this.a = drawable;
    }
}
