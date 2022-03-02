package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: jnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jnf extends acq {
    static final int[] a = {16843284};
    private final Drawable b;

    public jnf(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    private static int a(RecyclerView recyclerView) {
        return ((abk) recyclerView.getLayoutManager()).i;
    }

    private static final boolean a(View view, RecyclerView recyclerView) {
        adl childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder instanceof jne) {
            return ((jne) childViewHolder).v();
        }
        return true;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            int i = 0;
            if (a(recyclerView) == 1) {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                while (i < childCount) {
                    View childAt = recyclerView.getChildAt(i);
                    if (a(childAt, recyclerView)) {
                        int bottom = childAt.getBottom() + ((acu) childAt.getLayoutParams()).bottomMargin;
                        this.b.setBounds(paddingLeft, bottom, width, this.b.getIntrinsicHeight() + bottom);
                        this.b.draw(canvas);
                    }
                    i++;
                }
                return;
            }
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount2 = recyclerView.getChildCount();
            while (i < childCount2) {
                View childAt2 = recyclerView.getChildAt(i);
                if (a(childAt2, recyclerView)) {
                    int right = childAt2.getRight() + ((acu) childAt2.getLayoutParams()).rightMargin;
                    this.b.setBounds(right, paddingTop, this.b.getIntrinsicHeight() + right, height);
                    this.b.draw(canvas);
                }
                i++;
            }
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, adi adi) {
        if (!a(view, recyclerView)) {
            return;
        }
        if (a(recyclerView) == 1) {
            rect.set(0, 0, 0, this.b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.b.getIntrinsicWidth(), 0);
        }
    }
}
