package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: akbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbz extends ajzf {
    public final RectF a;
    private final Paint b;
    private int c;

    akbz() {
        this((ajzl) null);
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f != this.a.left || f2 != this.a.top || f3 != this.a.right || f4 != this.a.bottom) {
            this.a.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akbz(ajzl ajzl) {
        super(ajzl == null ? new ajzl() : ajzl);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.b.setColor(-1);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.a = new RectF();
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            int i = Build.VERSION.SDK_INT;
            this.c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        } else {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        }
        super.draw(canvas);
        canvas.drawRect(this.a, this.b);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.c);
        }
    }
}
