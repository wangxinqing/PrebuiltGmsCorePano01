package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: ajyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyv {
    public static final int[] g = new int[3];
    public static final float[] h = {0.0f, 0.5f, 1.0f};
    public static final int[] i = new int[4];
    public static final float[] j = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a = new Paint();
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path k = new Path();
    public final Paint l = new Paint();

    public final void a(int i2) {
        this.d = lk.b(i2, 68);
        this.e = lk.b(i2, 20);
        this.f = lk.b(i2, 0);
        this.a.setColor(this.d);
    }

    public ajyv() {
        a(-16777216);
        this.l.setColor(0);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(this.b);
    }
}
