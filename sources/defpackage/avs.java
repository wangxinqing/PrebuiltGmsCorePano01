package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class avs implements awl, awc, avw {
    protected final ayu a;
    final Paint b;
    private final PathMeasure c = new PathMeasure();
    private final Path d = new Path();
    private final Path e = new Path();
    private final RectF f = new RectF();
    private final avc g;
    private final List h = new ArrayList();
    private final float[] i;
    private final awm j;
    private final awm k;
    private final List l;
    private final awm m;
    private awm n;

    public avs(avc avc, ayu ayu, Paint.Cap cap, Paint.Join join, float f2, axq axq, axo axo, List list, axo axo2) {
        avq avq = new avq(1);
        this.b = avq;
        this.g = avc;
        this.a = ayu;
        avq.setStyle(Paint.Style.STROKE);
        this.b.setStrokeCap(cap);
        this.b.setStrokeJoin(join);
        this.b.setStrokeMiter(f2);
        this.k = axq.a();
        this.j = axo.a();
        if (axo2 != null) {
            this.m = axo2.a();
        } else {
            this.m = null;
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(((axo) list.get(i2)).a());
        }
        ayu.a(this.k);
        ayu.a(this.j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            ayu.a((awm) this.l.get(i3));
        }
        awm awm = this.m;
        if (awm != null) {
            ayu.a(awm);
        }
        this.k.a((awl) this);
        this.j.a((awl) this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((awm) this.l.get(i4)).a((awl) this);
        }
        awm awm2 = this.m;
        if (awm2 != null) {
            awm2.a((awl) this);
        }
    }

    public final void a() {
        this.g.invalidateSelf();
    }

    public void a(Canvas canvas, Matrix matrix, int i2) {
        int i3;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        boolean z = false;
        bbb.a[0] = 0.0f;
        bbb.a[1] = 0.0f;
        bbb.a[2] = 37394.73f;
        bbb.a[3] = 39575.234f;
        matrix2.mapPoints(bbb.a);
        if (bbb.a[0] == bbb.a[2] || bbb.a[1] == bbb.a[3]) {
            auf.a();
            return;
        }
        awq awq = (awq) this.k;
        float b2 = (((float) i2) / 255.0f) * ((float) awq.b(awq.b(), awq.d()));
        float f5 = 100.0f;
        this.b.setAlpha(bba.a((int) ((b2 / 100.0f) * 255.0f)));
        this.b.setStrokeWidth(((awo) this.j).g() * bbb.a(matrix));
        if (this.b.getStrokeWidth() > 0.0f) {
            if (this.l.isEmpty()) {
                auf.a();
            } else {
                float a2 = bbb.a(matrix);
                for (int i4 = 0; i4 < this.l.size(); i4++) {
                    this.i[i4] = ((Float) ((awm) this.l.get(i4)).f()).floatValue();
                    if (i4 % 2 == 0) {
                        float[] fArr = this.i;
                        if (fArr[i4] < 1.0f) {
                            fArr[i4] = 1.0f;
                        }
                    } else {
                        float[] fArr2 = this.i;
                        if (fArr2[i4] < 0.1f) {
                            fArr2[i4] = 0.1f;
                        }
                    }
                    float[] fArr3 = this.i;
                    fArr3[i4] = fArr3[i4] * a2;
                }
                awm awm = this.m;
                this.b.setPathEffect(new DashPathEffect(this.i, awm != null ? ((Float) awm.f()).floatValue() * a2 : 0.0f));
                auf.a();
            }
            awm awm2 = this.n;
            if (awm2 != null) {
                this.b.setColorFilter((ColorFilter) awm2.f());
                i3 = 0;
            } else {
                i3 = 0;
            }
            while (i3 < this.h.size()) {
                avr avr = (avr) this.h.get(i3);
                if (avr.b != null) {
                    this.d.reset();
                    for (int size = avr.a.size() - 1; size >= 0; size--) {
                        this.d.addPath(((awe) avr.a.get(size)).e(), matrix2);
                    }
                    this.c.setPath(this.d, z);
                    float length = this.c.getLength();
                    while (this.c.nextContour()) {
                        length += this.c.getLength();
                    }
                    float floatValue = (((Float) avr.b.d.f()).floatValue() * length) / 360.0f;
                    float floatValue2 = ((((Float) avr.b.b.f()).floatValue() * length) / f5) + floatValue;
                    float floatValue3 = ((((Float) avr.b.c.f()).floatValue() * length) / f5) + floatValue;
                    int size2 = avr.a.size() - 1;
                    float f6 = 0.0f;
                    while (size2 >= 0) {
                        this.e.set(((awe) avr.a.get(size2)).e());
                        this.e.transform(matrix2);
                        this.c.setPath(this.e, z);
                        float length2 = this.c.getLength();
                        if (floatValue3 > length) {
                            float f7 = floatValue3 - length;
                            if (f7 < f6 + length2 && f6 < f7) {
                                if (floatValue2 > length) {
                                    f4 = (floatValue2 - length) / length2;
                                } else {
                                    f4 = 0.0f;
                                }
                                bbb.a(this.e, f4, Math.min(f7 / length2, 1.0f), 0.0f);
                                canvas2.drawPath(this.e, this.b);
                                f6 += length2;
                                size2--;
                                z = false;
                            }
                        }
                        float f8 = f6 + length2;
                        if (f8 >= floatValue2 && f6 <= floatValue3) {
                            if (f8 > floatValue3 || floatValue2 >= f6) {
                                if (floatValue2 >= f6) {
                                    f2 = (floatValue2 - f6) / length2;
                                } else {
                                    f2 = 0.0f;
                                }
                                if (floatValue3 <= f8) {
                                    f3 = (floatValue3 - f6) / length2;
                                } else {
                                    f3 = 1.0f;
                                }
                                bbb.a(this.e, f2, f3, 0.0f);
                                canvas2.drawPath(this.e, this.b);
                            } else {
                                canvas2.drawPath(this.e, this.b);
                            }
                        }
                        f6 += length2;
                        size2--;
                        z = false;
                    }
                    auf.a();
                } else {
                    this.d.reset();
                    for (int size3 = avr.a.size() - 1; size3 >= 0; size3--) {
                        this.d.addPath(((awe) avr.a.get(size3)).e(), matrix2);
                    }
                    auf.a();
                    canvas2.drawPath(this.d, this.b);
                    auf.a();
                }
                i3++;
                f5 = 100.0f;
                z = false;
            }
            auf.a();
            return;
        }
        auf.a();
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.d.reset();
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            avr avr = (avr) this.h.get(i2);
            for (int i3 = 0; i3 < avr.a.size(); i3++) {
                this.d.addPath(((awe) avr.a.get(i3)).e(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        float g2 = ((awo) this.j).g();
        RectF rectF2 = this.f;
        float f2 = g2 / 2.0f;
        rectF2.set(rectF2.left - f2, this.f.top - f2, this.f.right + f2, this.f.bottom + f2);
        rectF.set(this.f);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        auf.a();
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        bba.a(axi, i2, list, axi2, this);
    }

    public void a(Object obj, bbe bbe) {
        awm awm;
        if (obj == avh.d) {
            awm = this.k;
        } else if (obj == avh.o) {
            awm = this.j;
        } else if (obj == avh.B) {
            axb axb = new axb(bbe);
            this.n = axb;
            axb.a((awl) this);
            this.a.a(this.n);
            return;
        } else {
            return;
        }
        awm.d = bbe;
    }

    public final void a(List list, List list2) {
        avr avr = null;
        awk awk = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            avu avu = (avu) list.get(size);
            if (avu instanceof awk) {
                awk awk2 = (awk) avu;
                if (awk2.e == 2) {
                    awk = awk2;
                }
            }
        }
        if (awk != null) {
            awk.a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            avu avu2 = (avu) list2.get(size2);
            if (avu2 instanceof awk) {
                awk awk3 = (awk) avu2;
                if (awk3.e == 2) {
                    if (avr != null) {
                        this.h.add(avr);
                    }
                    avr avr2 = new avr(awk3);
                    awk3.a(this);
                    avr = avr2;
                }
            }
            if (avu2 instanceof awe) {
                if (avr == null) {
                    avr = new avr(awk);
                }
                avr.a.add((awe) avu2);
            }
        }
        if (avr != null) {
            this.h.add(avr);
        }
    }
}
