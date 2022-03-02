package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;

/* renamed from: vwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwr {
    public int a;
    public final Paint b;
    public final float c;
    final /* synthetic */ vws d;
    private ValueAnimator e;

    public vwr(vws vws, Paint paint) {
        this(vws, paint, 0);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.a = 0;
    }

    public vwr(vws vws, Paint paint, int i) {
        this.d = vws;
        this.b = paint;
        this.a = i;
        this.c = paint.getStrokeWidth();
    }

    public final void a(long j) {
        a();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.e = ofFloat;
        ofFloat.setStartDelay(j);
        this.e.setDuration(2000);
        this.e.setInterpolator(new LinearInterpolator());
        this.e.addUpdateListener(new vwq(this));
        this.e.setRepeatCount(-1);
        this.e.start();
    }

    /* access modifiers changed from: package-private */
    public final void a(Canvas canvas) {
        int width = this.d.getBounds().width() / 2;
        int height = this.d.getBounds().height() / 2;
        int i = this.a;
        canvas.drawOval((float) (width - i), (float) (height - i), (float) (width + i), (float) (height + i), this.b);
    }
}
