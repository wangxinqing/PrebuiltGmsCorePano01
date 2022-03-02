package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HorizontalGridView extends ajp {
    private Paint d;

    public HorizontalGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Paint();
        new Rect();
        this.a.a(0);
        a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.e);
        qb.a(this, context, ait.e, attributeSet, obtainStyledAttributes, 0, 0);
        if (obtainStyledAttributes.peekValue(1) != null) {
            this.a.e(obtainStyledAttributes.getLayoutDimension(1, 0));
            requestLayout();
        }
        this.a.c(obtainStyledAttributes.getInt(0, 1));
        requestLayout();
        obtainStyledAttributes.recycle();
        setLayerType(0, (Paint) null);
        setWillNotDraw(true);
        Paint paint = new Paint();
        this.d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
