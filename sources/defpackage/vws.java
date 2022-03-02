package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: vws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vws extends Drawable {
    public final vwr a;
    public final vwr b;
    public final vwr c;
    public boolean d = false;

    public vws(Context context) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth((float) wid.a(context, 4));
        paint.setColor(wid.b(context));
        this.a = new vwr(this, paint, wid.a(context, 14));
        this.b = new vwr(this, a(context));
        this.c = new vwr(this, a(context));
    }

    private static Paint a(Context context) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) wid.a(context, 4));
        paint.setColor(wid.b(context));
        return paint;
    }

    public final void draw(Canvas canvas) {
        if (this.d) {
            this.b.a(canvas);
            this.c.a(canvas);
        }
        this.a.a(canvas);
    }

    public final int getAlpha() {
        return this.a.b.getAlpha();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.b.b.setAlpha(i);
        this.c.b.setAlpha(i);
        this.a.b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.b.setColorFilter(colorFilter);
        this.c.b.setColorFilter(colorFilter);
        this.a.b.setColorFilter(colorFilter);
    }
}
