package com.google.android.gms.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrawableView extends View {
    public Paint a;
    public Bitmap b;
    public Canvas c;
    public Paint d;
    public Bitmap e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public int i;
    private Path j;
    private float k;
    private float l;

    public DrawableView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        this.a = new Paint(4);
        this.j = new Path();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setDither(true);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeJoin(Paint.Join.ROUND);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        int dimension = (int) getResources().getDimension(R.dimen.gf_paint_stroke_width);
        this.i = dimension;
        this.d.setStrokeWidth((float) dimension);
        this.d.setColor((int) axgy.g());
        this.d.setAlpha((int) axgy.f());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
            canvas.drawPath(this.j, this.d);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.j.reset();
            this.j.moveTo(x, y);
            this.k = x;
            this.l = y;
            invalidate();
        } else if (action == 1) {
            this.j.lineTo(this.k, this.l);
            if (!this.c.quickReject(this.j, Canvas.EdgeType.BW)) {
                this.c.drawPath(this.j, this.d);
                Path path = new Path(this.j);
                int color = this.d.getColor();
                int alpha = this.d.getAlpha();
                this.f.add(path);
                this.g.add(Integer.valueOf(color));
                this.h.add(Integer.valueOf(alpha));
            }
            this.j.reset();
            invalidate();
            performClick();
        } else if (action == 2) {
            float abs = Math.abs(x - this.k);
            float abs2 = Math.abs(y - this.l);
            if (abs >= ((float) axgy.l()) || abs2 >= ((float) axgy.l())) {
                Path path2 = this.j;
                float f2 = this.k;
                float f3 = this.l;
                path2.quadTo(f2, f3, (x + f2) / 2.0f, (y + f3) / 2.0f);
                this.k = x;
                this.l = y;
            }
            invalidate();
        }
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public DrawableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public DrawableView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public final void a(int i2, int i3) {
        this.d.setColor(i2);
        this.d.setAlpha(i3);
    }
}
