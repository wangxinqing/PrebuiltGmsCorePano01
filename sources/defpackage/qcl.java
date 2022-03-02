package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: qcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qcl extends aaj {
    private final Drawable a;
    private final int b;
    private final int c;
    private final int d;

    public qcl(Context context, Drawable drawable, int i, int i2, int i3) {
        super(context);
        this.a = drawable;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft() + this.d;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.c;
        int childCount = recyclerView.getChildCount();
        for (int i = this.b; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((acu) childAt.getLayoutParams()).bottomMargin;
            this.a.setBounds(paddingLeft, bottom, width, this.a.getIntrinsicHeight() + bottom);
            this.a.draw(canvas);
        }
    }
}
