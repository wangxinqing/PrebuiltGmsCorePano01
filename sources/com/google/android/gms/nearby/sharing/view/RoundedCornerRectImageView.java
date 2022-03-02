package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RoundedCornerRectImageView extends AppCompatImageView {
    public int a;
    private final float b;
    private final Path c = new Path();
    private final Paint d = new Paint(0);
    private final Paint e = new Paint(1);
    private final Paint f = new Paint(0);

    public RoundedCornerRectImageView(Context context) {
        super(context);
        this.b = (float) wid.a(context, 8);
        this.d.setColor(-1728053248);
        this.d.setStyle(Paint.Style.FILL);
        this.f.setColor(wid.c(context));
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth((float) wid.a(context, 1));
        this.e.setColor(-1);
        this.e.setTextSize((float) wid.a(context, 20));
        this.e.setTextAlign(Paint.Align.CENTER);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int paddingLeft2 = getPaddingLeft();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        int paddingTop2 = getPaddingTop();
        Path path = this.c;
        float f5 = (float) paddingLeft;
        float f6 = (float) paddingTop;
        float f7 = (float) ((width - paddingRight) - paddingLeft2);
        float f8 = (float) ((height - paddingBottom) - paddingTop2);
        float f9 = this.b;
        path.addRoundRect(f5, f6, f7, f8, f9, f9, Path.Direction.CW);
        canvas2.clipPath(this.c);
        super.onDraw(canvas);
        if (this.a > 0) {
            f4 = f5;
            f3 = f6;
            f2 = f7;
            canvas.drawRect(f4, f3, f7, f8, this.d);
            int width2 = getWidth();
            int height2 = getHeight();
            float descent = this.e.descent();
            float ascent = this.e.ascent();
            int i = this.a;
            StringBuilder sb = new StringBuilder(12);
            sb.append("+");
            sb.append(i);
            canvas2.drawText(sb.toString(), (float) (width2 / 2), (float) ((int) ((((float) height2) / 2.0f) - ((descent + ascent) / 2.0f))), this.e);
        } else {
            f4 = f5;
            f3 = f6;
            f2 = f7;
        }
        float f10 = this.b;
        canvas.drawRoundRect(f4, f3, f2, f8, f10, f10, this.f);
    }

    public RoundedCornerRectImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = (float) wid.a(context, 8);
        this.d.setColor(-1728053248);
        this.d.setStyle(Paint.Style.FILL);
        this.f.setColor(wid.c(context));
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth((float) wid.a(context, 1));
        this.e.setColor(-1);
        this.e.setTextSize((float) wid.a(context, 20));
        this.e.setTextAlign(Paint.Align.CENTER);
    }

    public RoundedCornerRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = (float) wid.a(context, 8);
        this.d.setColor(-1728053248);
        this.d.setStyle(Paint.Style.FILL);
        this.f.setColor(wid.c(context));
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth((float) wid.a(context, 1));
        this.e.setColor(-1);
        this.e.setTextSize((float) wid.a(context, 20));
        this.e.setTextAlign(Paint.Align.CENTER);
    }
}
