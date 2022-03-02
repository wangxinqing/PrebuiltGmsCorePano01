package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: acoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acoa extends View {
    public final Paint a = new Paint();
    public int b;
    private final Path c = new Path();

    public acoa(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            int height = canvas.getHeight();
            float width = (float) (canvas.getWidth() / 2);
            canvas.drawCircle((float) (height / 2), width, width, this.a);
        } else if (i2 == 1) {
            double width2 = (double) canvas.getWidth();
            Double.isNaN(width2);
            Double.isNaN(width2);
            float sqrt = (float) Math.sqrt((width2 * width2) / 2.0d);
            int width3 = canvas.getWidth();
            canvas.rotate(45.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
            float f = (((float) width3) - sqrt) / 2.0f;
            canvas.translate(f, f);
            canvas.drawRect(0.0f, 0.0f, sqrt, sqrt, this.a);
        } else if (i2 == 2) {
            int height2 = canvas.getHeight();
            int width4 = canvas.getWidth();
            float f2 = (float) height2;
            this.c.moveTo(0.0f, f2);
            this.c.lineTo((float) width4, f2);
            this.c.lineTo((float) (width4 / 2), 0.0f);
            this.c.lineTo(0.0f, f2);
            canvas.drawPath(this.c, this.a);
        } else if (i2 == 3) {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.a);
        }
    }
}
