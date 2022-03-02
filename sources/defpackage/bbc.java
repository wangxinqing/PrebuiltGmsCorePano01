package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: bbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bbc {
    private final auk a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final float e;
    public Float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public PointF k;
    public PointF l;
    private float m;
    private float n;

    public bbc(auk auk, Object obj, Object obj2, Interpolator interpolator, float f2, Float f3) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.k = null;
        this.l = null;
        this.a = auk;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = f2;
        this.f = f3;
    }

    public final boolean a(float f2) {
        return f2 >= b() && f2 < c();
    }

    public final float b() {
        auk auk = this.a;
        if (auk == null) {
            return 0.0f;
        }
        float f2 = this.m;
        if (f2 != Float.MIN_VALUE) {
            return f2;
        }
        float b2 = (this.e - auk.h) / auk.b();
        this.m = b2;
        return b2;
    }

    public final float c() {
        float f2 = 1.0f;
        if (this.a == null) {
            return 1.0f;
        }
        float f3 = this.n;
        if (f3 != Float.MIN_VALUE) {
            return f3;
        }
        if (this.f != null) {
            f2 = ((this.f.floatValue() - this.e) / this.a.b()) + b();
        }
        this.n = f2;
        return f2;
    }

    public final boolean d() {
        return this.d == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.e + ", endFrame=" + this.f + ", interpolator=" + this.d + '}';
    }

    public bbc(Object obj) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.k = null;
        this.l = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = Float.MIN_VALUE;
        this.f = Float.valueOf(Float.MAX_VALUE);
    }
}
