package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: aqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqa {
    final RectF a = new RectF();
    final Paint b = new Paint();
    final Paint c = new Paint();
    final Paint d = new Paint();
    float e = 0.0f;
    float f = 0.0f;
    public float g = 0.0f;
    float h = 5.0f;
    int[] i;
    int j;
    float k;
    float l;
    float m;
    boolean n;
    Path o;
    float p = 1.0f;
    public float q;
    public int r;
    public int s;
    int t = 255;
    int u;

    public aqa() {
        this.b.setStrokeCap(Paint.Cap.SQUARE);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setAntiAlias(true);
        this.d.setColor(0);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return (this.j + 1) % this.i.length;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (this.n != z) {
            this.n = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.i[this.j];
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.k = this.e;
        this.l = this.f;
        this.m = this.g;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }

    public final void a(float f2) {
        this.h = f2;
        this.b.setStrokeWidth(f2);
    }

    public final void a(int i2) {
        this.j = i2;
        this.u = this.i[i2];
    }

    public final void a(int[] iArr) {
        this.i = iArr;
        a(0);
    }
}
