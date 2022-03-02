package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: awg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awg implements awl, awc, awe {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final boolean d;
    private final avc e;
    private final awm f;
    private final awm g;
    private final awm h;
    private final avt i = new avt();
    private boolean j;

    public awg(avc avc, ayu ayu, ayj ayj) {
        this.c = ayj.a;
        this.d = ayj.e;
        this.e = avc;
        this.f = ayj.b.a();
        this.g = ayj.c.a();
        this.h = ayj.d.a();
        ayu.a(this.f);
        ayu.a(this.g);
        ayu.a(this.h);
        this.f.a((awl) this);
        this.g.a((awl) this);
        this.h.a((awl) this);
    }

    public final void a() {
        this.j = false;
        this.e.invalidateSelf();
    }

    public final String b() {
        return this.c;
    }

    public final Path e() {
        float f2;
        if (!this.j) {
            this.a.reset();
            if (!this.d) {
                PointF pointF = (PointF) this.g.f();
                float f3 = pointF.x / 2.0f;
                float f4 = pointF.y / 2.0f;
                awm awm = this.h;
                if (awm != null) {
                    f2 = ((awo) awm).g();
                } else {
                    f2 = 0.0f;
                }
                float min = Math.min(f3, f4);
                if (f2 > min) {
                    f2 = min;
                }
                PointF pointF2 = (PointF) this.f.f();
                this.a.moveTo(pointF2.x + f3, (pointF2.y - f4) + f2);
                this.a.lineTo(pointF2.x + f3, (pointF2.y + f4) - f2);
                if (f2 > 0.0f) {
                    float f5 = f2 + f2;
                    this.b.set((pointF2.x + f3) - f5, (pointF2.y + f4) - f5, pointF2.x + f3, pointF2.y + f4);
                    this.a.arcTo(this.b, 0.0f, 90.0f, false);
                }
                this.a.lineTo((pointF2.x - f3) + f2, pointF2.y + f4);
                if (f2 > 0.0f) {
                    float f6 = f2 + f2;
                    this.b.set(pointF2.x - f3, (pointF2.y + f4) - f6, (pointF2.x - f3) + f6, pointF2.y + f4);
                    this.a.arcTo(this.b, 90.0f, 90.0f, false);
                }
                this.a.lineTo(pointF2.x - f3, (pointF2.y - f4) + f2);
                if (f2 > 0.0f) {
                    float f7 = f2 + f2;
                    this.b.set(pointF2.x - f3, pointF2.y - f4, (pointF2.x - f3) + f7, (pointF2.y - f4) + f7);
                    this.a.arcTo(this.b, 180.0f, 90.0f, false);
                }
                this.a.lineTo((pointF2.x + f3) - f2, pointF2.y - f4);
                if (f2 > 0.0f) {
                    float f8 = f2 + f2;
                    this.b.set((pointF2.x + f3) - f8, pointF2.y - f4, pointF2.x + f3, (pointF2.y - f4) + f8);
                    this.a.arcTo(this.b, 270.0f, 90.0f, false);
                }
                this.a.close();
                this.i.a(this.a);
            }
            this.j = true;
        }
        return this.a;
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        bba.a(axi, i2, list, axi2, this);
    }

    public final void a(Object obj, bbe bbe) {
        awm awm;
        if (obj == avh.h) {
            awm = this.g;
        } else if (obj == avh.j) {
            awm = this.f;
        } else if (obj == avh.i) {
            awm = this.h;
        } else {
            return;
        }
        awm.d = bbe;
    }

    public final void a(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            avu avu = (avu) list.get(i2);
            if (avu instanceof awk) {
                awk awk = (awk) avu;
                if (awk.e == 1) {
                    this.i.a(awk);
                    awk.a(this);
                }
            }
        }
    }
}
