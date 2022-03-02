package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: zxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zxp extends acq {
    private static final int[] a = {16843284};
    private final Drawable b;

    public zxp(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    private static boolean a(View view, RecyclerView recyclerView) {
        adl childViewHolder = recyclerView.getChildViewHolder(view);
        if ((childViewHolder instanceof zxf) || (childViewHolder instanceof zxd) || (childViewHolder.d() == recyclerView.getAdapter().a() - 1 && recyclerView.getAdapter().a() != 1)) {
            return false;
        }
        return true;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (a(childAt, recyclerView)) {
                int bottom = childAt.getBottom() + ((acu) childAt.getLayoutParams()).bottomMargin;
                this.b.setBounds(paddingLeft, bottom, width, this.b.getIntrinsicHeight() + bottom);
                this.b.draw(canvas);
            }
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, adi adi) {
        if (a(view, recyclerView)) {
            rect.set(0, 0, 0, this.b.getIntrinsicHeight());
        }
    }
}
