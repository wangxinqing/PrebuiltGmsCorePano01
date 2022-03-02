package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: jgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgq {
    public final RectF a = new RectF();
    public final Paint b = new Paint();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 5.0f;
    public float g = 2.5f;
    public int[] h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public double n;
    public int o;
    public final Paint p = new Paint();
    private final Paint q = new Paint();
    private final Drawable.Callback r;

    public jgq(Drawable.Callback callback) {
        this.r = callback;
        this.b.setStrokeCap(Paint.Cap.SQUARE);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        this.q.setStyle(Paint.Style.FILL);
        this.q.setAntiAlias(true);
    }

    public final void a() {
        this.i = (this.i + 1) % this.h.length;
    }

    public final void b() {
        this.j = this.c;
        this.k = this.d;
        this.l = this.e;
    }

    public final void c() {
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        a(0.0f);
        b(0.0f);
        c(0.0f);
    }

    public final void d() {
        this.r.invalidateDrawable((Drawable) null);
    }

    public final void e() {
        this.i = 0;
    }

    public final void a(float f2) {
        this.c = f2;
        d();
    }

    public final void b(float f2) {
        this.d = f2;
        d();
    }

    public final void c(float f2) {
        this.e = f2;
        d();
    }

    public final void a(int[] iArr) {
        this.h = iArr;
        e();
    }
}
