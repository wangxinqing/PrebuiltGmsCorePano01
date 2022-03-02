package defpackage;

import android.graphics.PointF;
import android.os.Handler;
import android.util.SparseArray;
import android.view.animation.AccelerateInterpolator;

/* renamed from: akeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akeq {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public Handler f;
    public akfp g;
    private PointF h;
    private PointF i;

    public akeq() {
        this((akfp) null);
    }

    private final void c(float f2, float f3) {
        this.a = f2;
        this.b = f3;
        float f4 = this.i.x;
        float f5 = this.a;
        if (f4 > f5) {
            this.i.x = f5;
        }
        float f6 = this.i.y;
        float f7 = this.b;
        if (f6 > f7) {
            this.i.y = f7;
        }
    }

    public final PointF a() {
        return new PointF((this.i.x * this.c) / this.a, (this.i.y * this.d) / this.b);
    }

    public final void b() {
        float f2 = this.c;
        if (f2 > 0.0f) {
            float f3 = this.d;
            if (f3 > 0.0f) {
                float f4 = this.e;
                if (f4 > 0.0f) {
                    c(f2 / f4, f3 / f4);
                }
            }
        }
    }

    public akeq(akfp akfp) {
        this.h = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
        this.i = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
        new AccelerateInterpolator();
        this.f = new akep(this);
        this.g = akfp;
        new SparseArray(1);
        this.a = 120.0f;
        this.b = 50.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }

    public final void a(float f2, float f3) {
        this.i.x = f2;
        this.i.y = f3;
        this.h.x = f2;
        this.h.y = f3;
        if (this.i.x < 0.0f) {
            a(0.0f, this.i.y);
        } else {
            float f4 = this.i.x;
            float f5 = this.a;
            if (f4 > f5) {
                a(f5, this.i.y);
            }
        }
        if (this.i.y < 0.0f) {
            a(this.i.x, 0.0f);
        } else if (this.i.y > this.b) {
            a(this.i.x, this.b);
        }
    }

    public final void b(float f2, float f3) {
        if (this.e <= 0.0f) {
            c(f2, f3);
        }
    }
}
