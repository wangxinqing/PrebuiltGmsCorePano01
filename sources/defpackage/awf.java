package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: awf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awf implements awe, awl, awc {
    private final Path a = new Path();
    private final String b;
    private final avc c;
    private final boolean d;
    private final awm e;
    private final awm f;
    private final awm g;
    private final awm h;
    private final awm i;
    private final awm j;
    private final awm k;
    private final avt l = new avt();
    private boolean m;
    private final int n;

    public awf(avc avc, ayu ayu, ayi ayi) {
        this.c = avc;
        this.b = ayi.a;
        this.n = ayi.j;
        this.d = ayi.i;
        this.e = ayi.b.a();
        this.f = ayi.c.a();
        this.g = ayi.d.a();
        this.i = ayi.f.a();
        this.k = ayi.h.a();
        if (this.n == 1) {
            this.h = ayi.e.a();
            this.j = ayi.g.a();
        } else {
            this.h = null;
            this.j = null;
        }
        ayu.a(this.e);
        ayu.a(this.f);
        ayu.a(this.g);
        ayu.a(this.i);
        ayu.a(this.k);
        if (this.n == 1) {
            ayu.a(this.h);
            ayu.a(this.j);
        }
        this.e.a((awl) this);
        this.f.a((awl) this);
        this.g.a((awl) this);
        this.i.a((awl) this);
        this.k.a((awl) this);
        if (this.n == 1) {
            this.h.a((awl) this);
            this.j.a((awl) this);
        }
    }

    public final void a() {
        this.m = false;
        this.c.invalidateSelf();
    }

    public final String b() {
        return this.b;
    }

    public final Path e() {
        float f2;
        float f3;
        float f4;
        double d2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        double d3;
        int i2;
        if (this.m) {
            return this.a;
        }
        this.a.reset();
        if (!this.d) {
            int i3 = this.n;
            if (i3 != 0) {
                double d4 = 0.0d;
                if (i3 == 1) {
                    float floatValue = ((Float) this.e.f()).floatValue();
                    awm awm = this.g;
                    if (awm != null) {
                        d4 = (double) ((Float) awm.f()).floatValue();
                    }
                    double radians = Math.toRadians(d4 - 0.0498046875d);
                    double d5 = (double) floatValue;
                    Double.isNaN(d5);
                    float f16 = (float) (6.283185307179586d / d5);
                    float f17 = f16 / 2.0f;
                    float f18 = floatValue - ((float) ((int) floatValue));
                    if (f18 != 0.0f) {
                        double d6 = (double) ((1.0f - f18) * f17);
                        Double.isNaN(d6);
                        radians += d6;
                    }
                    float floatValue2 = ((Float) this.i.f()).floatValue();
                    float floatValue3 = ((Float) this.h.f()).floatValue();
                    awm awm2 = this.j;
                    if (awm2 != null) {
                        f2 = ((Float) awm2.f()).floatValue() / 100.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    awm awm3 = this.k;
                    if (awm3 != null) {
                        f3 = ((Float) awm3.f()).floatValue() / 100.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (f18 != 0.0f) {
                        float f19 = ((floatValue2 - floatValue3) * f18) + floatValue3;
                        f4 = f2;
                        double d7 = (double) f19;
                        double cos = Math.cos(radians);
                        Double.isNaN(d7);
                        float f20 = f17;
                        float f21 = (float) (d7 * cos);
                        double sin = Math.sin(radians);
                        Double.isNaN(d7);
                        float f22 = (float) (d7 * sin);
                        this.a.moveTo(f21, f22);
                        double d8 = (double) ((f16 * f18) / 2.0f);
                        Double.isNaN(d8);
                        double d9 = radians + d8;
                        f5 = f21;
                        f8 = f20;
                        double d10 = d9;
                        f6 = f22;
                        f7 = f19;
                        d2 = d10;
                    } else {
                        float f23 = f17;
                        f4 = f2;
                        double d11 = (double) floatValue2;
                        double cos2 = Math.cos(radians);
                        Double.isNaN(d11);
                        f5 = (float) (cos2 * d11);
                        double sin2 = Math.sin(radians);
                        Double.isNaN(d11);
                        float f24 = (float) (d11 * sin2);
                        this.a.moveTo(f5, f24);
                        f8 = f23;
                        double d12 = (double) f8;
                        Double.isNaN(d12);
                        d2 = radians + d12;
                        f6 = f24;
                        f7 = 0.0f;
                    }
                    double ceil = Math.ceil(d5);
                    double d13 = ceil + ceil;
                    double d14 = d2;
                    boolean z = false;
                    int i4 = 0;
                    float f25 = f5;
                    while (true) {
                        float f26 = floatValue2;
                        float f27 = floatValue3;
                        double d15 = (double) i4;
                        if (d15 >= d13) {
                            break;
                        }
                        if (!z) {
                            f9 = f27;
                        } else {
                            f9 = f26;
                        }
                        float f28 = (f7 == 0.0f || d15 != d13 + -2.0d) ? f8 : (f16 * f18) / 2.0f;
                        float f29 = f16;
                        float f30 = f8;
                        double d16 = (double) ((f7 == 0.0f || d15 != d13 + -1.0d) ? f9 : f7);
                        double cos3 = Math.cos(d14);
                        Double.isNaN(d16);
                        double d17 = d15;
                        float f31 = (float) (d16 * cos3);
                        double sin3 = Math.sin(d14);
                        Double.isNaN(d16);
                        float f32 = (float) (d16 * sin3);
                        if (f4 == 0.0f && f3 == 0.0f) {
                            this.a.lineTo(f31, f32);
                            f10 = f7;
                            f11 = f28;
                        } else {
                            f10 = f7;
                            f11 = f28;
                            double atan2 = (double) ((float) (Math.atan2((double) f6, (double) f25) - 2.858407346410207d));
                            float cos4 = (float) Math.cos(atan2);
                            float sin4 = (float) Math.sin(atan2);
                            float f33 = f6;
                            float f34 = f25;
                            double atan22 = (double) ((float) (Math.atan2((double) f32, (double) f31) - 2.858407346410207d));
                            float cos5 = (float) Math.cos(atan22);
                            float sin5 = (float) Math.sin(atan22);
                            if (!z) {
                                f12 = f3;
                            } else {
                                f12 = f4;
                            }
                            if (!z) {
                                f13 = f4;
                            } else {
                                f13 = f3;
                            }
                            if (!z) {
                                f14 = f26;
                            } else {
                                f14 = f27;
                            }
                            float f35 = f14 * f12 * 0.47829f;
                            float f36 = cos4 * f35;
                            float f37 = f35 * sin4;
                            float f38 = f9 * f13 * 0.47829f;
                            float f39 = cos5 * f38;
                            float f40 = f38 * sin5;
                            if (f18 != 0.0f) {
                                if (i4 == 0) {
                                    f36 *= f18;
                                    f37 *= f18;
                                } else if (d17 == d13 - 4.0d) {
                                    f39 *= f18;
                                    f40 *= f18;
                                }
                            }
                            this.a.cubicTo(f34 - f36, f33 - f37, f31 + f39, f32 + f40, f31, f32);
                        }
                        double d18 = (double) f11;
                        Double.isNaN(d18);
                        d14 += d18;
                        z = !z;
                        i4++;
                        f6 = f32;
                        f25 = f31;
                        floatValue2 = f26;
                        floatValue3 = f27;
                        f16 = f29;
                        f8 = f30;
                        f7 = f10;
                    }
                    PointF pointF = (PointF) this.f.f();
                    this.a.offset(pointF.x, pointF.y);
                    this.a.close();
                } else if (i3 == 2) {
                    int floor = (int) Math.floor((double) ((Float) this.e.f()).floatValue());
                    awm awm4 = this.g;
                    if (awm4 != null) {
                        d4 = (double) ((Float) awm4.f()).floatValue();
                    }
                    double radians2 = Math.toRadians(d4 - 0.0498046875d);
                    double d19 = (double) floor;
                    float floatValue4 = ((Float) this.k.f()).floatValue() / 100.0f;
                    float floatValue5 = ((Float) this.i.f()).floatValue();
                    double d20 = (double) floatValue5;
                    double cos6 = Math.cos(radians2);
                    Double.isNaN(d20);
                    float f41 = (float) (d20 * cos6);
                    double sin6 = Math.sin(radians2);
                    Double.isNaN(d20);
                    float f42 = floatValue5;
                    float f43 = (float) (d20 * sin6);
                    this.a.moveTo(f41, f43);
                    Double.isNaN(d19);
                    double d21 = (double) ((float) (6.283185307179586d / d19));
                    Double.isNaN(d21);
                    double d22 = radians2 + d21;
                    double ceil2 = Math.ceil(d19);
                    int i5 = 0;
                    while (((double) i5) < ceil2) {
                        double cos7 = Math.cos(d22);
                        Double.isNaN(d20);
                        float f44 = (float) (cos7 * d20);
                        double sin7 = Math.sin(d22);
                        Double.isNaN(d20);
                        double d23 = d21;
                        float f45 = (float) (d20 * sin7);
                        if (floatValue4 != 0.0f) {
                            i2 = i5;
                            double atan23 = (double) ((float) (Math.atan2((double) f43, (double) f41) - 2.858407346410207d));
                            d3 = d20;
                            double atan24 = (double) ((float) (Math.atan2((double) f45, (double) f44) - 2.858407346410207d));
                            float f46 = f42 * floatValue4 * 0.25f;
                            f15 = floatValue4;
                            this.a.cubicTo(f41 - (((float) Math.cos(atan23)) * f46), f43 - (((float) Math.sin(atan23)) * f46), f44 + (((float) Math.cos(atan24)) * f46), f45 + (f46 * ((float) Math.sin(atan24))), f44, f45);
                        } else {
                            f15 = floatValue4;
                            d3 = d20;
                            i2 = i5;
                            this.a.lineTo(f44, f45);
                        }
                        Double.isNaN(d23);
                        d22 += d23;
                        i5 = i2 + 1;
                        f43 = f45;
                        f41 = f44;
                        d21 = d23;
                        d20 = d3;
                        floatValue4 = f15;
                    }
                    PointF pointF2 = (PointF) this.f.f();
                    this.a.offset(pointF2.x, pointF2.y);
                    this.a.close();
                }
                this.a.close();
                this.l.a(this.a);
                this.m = true;
                return this.a;
            }
            throw null;
        }
        this.m = true;
        return this.a;
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        bba.a(axi, i2, list, axi2, this);
    }

    public final void a(Object obj, bbe bbe) {
        awm awm;
        awm awm2;
        if (obj == avh.s) {
            this.e.d = bbe;
        } else if (obj == avh.t) {
            this.g.d = bbe;
        } else if (obj == avh.j) {
            this.f.d = bbe;
        } else if (obj == avh.u && (awm2 = this.h) != null) {
            awm2.d = bbe;
        } else if (obj == avh.v) {
            this.i.d = bbe;
        } else if (obj == avh.w && (awm = this.j) != null) {
            awm.d = bbe;
        } else if (obj == avh.x) {
            this.k.d = bbe;
        }
    }

    public final void a(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            avu avu = (avu) list.get(i2);
            if (avu instanceof awk) {
                awk awk = (awk) avu;
                if (awk.e == 1) {
                    this.l.a(awk);
                    awk.a(this);
                }
            }
        }
    }
}
