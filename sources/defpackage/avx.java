package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: avx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avx implements awe, awl, awc {
    private final Path a = new Path();
    private final String b;
    private final avc c;
    private final awm d;
    private final awm e;
    private final ayb f;
    private final avt g = new avt();
    private boolean h;

    public avx(avc avc, ayu ayu, ayb ayb) {
        this.b = ayb.a;
        this.c = avc;
        this.d = ayb.c.a();
        this.e = ayb.b.a();
        this.f = ayb;
        ayu.a(this.d);
        ayu.a(this.e);
        this.d.a((awl) this);
        this.e.a((awl) this);
    }

    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    public final String b() {
        return this.b;
    }

    public final Path e() {
        if (!this.h) {
            this.a.reset();
            if (!this.f.e) {
                PointF pointF = (PointF) this.d.f();
                float f2 = pointF.x / 2.0f;
                float f3 = pointF.y / 2.0f;
                float f4 = f2 * 0.55228f;
                float f5 = 0.55228f * f3;
                this.a.reset();
                if (this.f.d) {
                    float f6 = -f3;
                    this.a.moveTo(0.0f, f6);
                    float f7 = -f4;
                    float f8 = -f2;
                    float f9 = -f5;
                    this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
                    float f10 = f5 + 0.0f;
                    float f11 = f6;
                    this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
                    float f12 = f4 + 0.0f;
                    this.a.cubicTo(f12, f3, f2, f10, f2, 0.0f);
                    this.a.cubicTo(f2, f9, f12, f11, 0.0f, f11);
                } else {
                    float f13 = -f3;
                    this.a.moveTo(0.0f, f13);
                    float f14 = f4 + 0.0f;
                    float f15 = -f5;
                    this.a.cubicTo(f14, f13, f2, f15, f2, 0.0f);
                    float f16 = f5 + 0.0f;
                    this.a.cubicTo(f2, f16, f14, f3, 0.0f, f3);
                    float f17 = -f4;
                    float f18 = -f2;
                    this.a.cubicTo(f17, f3, f18, f16, f18, 0.0f);
                    this.a.cubicTo(f18, f15, f17, f13, 0.0f, f13);
                }
                PointF pointF2 = (PointF) this.e.f();
                this.a.offset(pointF2.x, pointF2.y);
                this.a.close();
                this.g.a(this.a);
                this.h = true;
                return this.a;
            }
            this.h = true;
        }
        return this.a;
    }

    public final void a(axi axi, int i, List list, axi axi2) {
        bba.a(axi, i, list, axi2, this);
    }

    public final void a(Object obj, bbe bbe) {
        awm awm;
        if (obj == avh.g) {
            awm = this.d;
        } else if (obj == avh.j) {
            awm = this.e;
        } else {
            return;
        }
        awm.d = bbe;
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            avu avu = (avu) list.get(i);
            if (avu instanceof awk) {
                awk awk = (awk) avu;
                if (awk.e == 1) {
                    this.g.a(awk);
                    awk.a(this);
                }
            }
        }
    }
}
