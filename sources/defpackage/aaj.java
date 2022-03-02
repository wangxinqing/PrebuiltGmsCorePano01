package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* renamed from: aaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aaj extends acq {
    private static final int[] a = {16843284};
    private final Drawable b;
    private final Rect c = new Rect();

    public aaj(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    public void a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        if (recyclerView.getLayoutManager() != null && this.b != null) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                i = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                i = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.c);
                int round = this.c.bottom + Math.round(childAt.getTranslationY());
                this.b.setBounds(i2, round - this.b.getIntrinsicHeight(), i, round);
                this.b.draw(canvas);
            }
            canvas.restore();
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, adi adi) {
        Drawable drawable = this.b;
        if (drawable != null) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
