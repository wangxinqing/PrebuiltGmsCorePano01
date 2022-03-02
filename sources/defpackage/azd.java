package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: azd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azd extends ayu {
    private final StringBuilder g = new StringBuilder(2);
    private final RectF h = new RectF();
    private final Matrix i = new Matrix();
    private final Paint j = new azb();
    private final Paint k = new azc();
    private final Map l = new HashMap();
    private final oh m = new oh();
    private final awz n;
    private final avc o;
    private final auk p;
    private awm q;
    private awm r;
    private awm s;
    private awm t;

    public azd(avc avc, ayx ayx) {
        super(avc, ayx);
        axo axo;
        axo axo2;
        axn axn;
        axn axn2;
        this.o = avc;
        this.p = ayx.b;
        awz d = ayx.p.a();
        this.n = d;
        d.a((awl) this);
        a((awm) this.n);
        axx axx = ayx.q;
        if (!(axx == null || (axn2 = axx.a) == null)) {
            awm a = axn2.a();
            this.q = a;
            a.a((awl) this);
            a(this.q);
        }
        if (!(axx == null || (axn = axx.b) == null)) {
            awm a2 = axn.a();
            this.r = a2;
            a2.a((awl) this);
            a(this.r);
        }
        if (!(axx == null || (axo2 = axx.c) == null)) {
            awm a3 = axo2.a();
            this.s = a3;
            a3.a((awl) this);
            a(this.s);
        }
        if (axx != null && (axo = axx.d) != null) {
            awm a4 = axo.a();
            this.t = a4;
            a4.a((awl) this);
            a(this.t);
        }
    }

    private static final List a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        int i3;
        axc axc;
        String str;
        int i4;
        String str2;
        List list;
        List list2;
        float f;
        Canvas canvas2 = canvas;
        canvas.save();
        if (!this.o.j()) {
            canvas.setMatrix(matrix);
        }
        axf axf = (axf) this.n.f();
        axg axg = (axg) this.p.c.get(axf.b);
        if (axg != null) {
            awm awm = this.q;
            if (awm != null) {
                this.j.setColor(((Integer) awm.f()).intValue());
            } else {
                this.j.setColor(axf.g);
            }
            awm awm2 = this.r;
            if (awm2 != null) {
                this.k.setColor(((Integer) awm2.f()).intValue());
            } else {
                this.k.setColor(axf.h);
            }
            awm awm3 = this.f.e;
            if (awm3 != null) {
                i3 = ((Integer) awm3.f()).intValue();
            } else {
                i3 = 100;
            }
            int i5 = (i3 * 255) / 100;
            this.j.setAlpha(i5);
            this.k.setAlpha(i5);
            awm awm4 = this.s;
            if (awm4 != null) {
                this.k.setStrokeWidth(((Float) awm4.f()).floatValue());
            } else {
                float a = bbb.a(matrix);
                Paint paint = this.k;
                double d = axf.i;
                double a2 = (double) bbb.a();
                Double.isNaN(a2);
                double d2 = d * a2;
                double d3 = (double) a;
                Double.isNaN(d3);
                paint.setStrokeWidth((float) (d2 * d3));
            }
            if (this.o.j()) {
                float f2 = ((float) axf.c) / 100.0f;
                float a3 = bbb.a(matrix);
                String str3 = axf.a;
                float a4 = ((float) axf.e) * bbb.a();
                List a5 = a(str3);
                int size = a5.size();
                int i6 = 0;
                while (i6 < size) {
                    String str4 = (String) a5.get(i6);
                    float f3 = 0.0f;
                    int i7 = 0;
                    while (i7 < str4.length()) {
                        axh axh = (axh) this.p.d.a(axh.a(str4.charAt(i7), axg.a, axg.c));
                        if (axh != null) {
                            double d4 = (double) f3;
                            double d5 = axh.b;
                            list2 = a5;
                            f = a4;
                            double d6 = (double) f2;
                            Double.isNaN(d6);
                            double d7 = d5 * d6;
                            double a6 = (double) bbb.a();
                            Double.isNaN(a6);
                            double d8 = d7 * a6;
                            double d9 = (double) a3;
                            Double.isNaN(d9);
                            Double.isNaN(d4);
                            f3 = (float) (d4 + (d8 * d9));
                        } else {
                            list2 = a5;
                            f = a4;
                        }
                        i7++;
                        a4 = f;
                        a5 = list2;
                    }
                    List list3 = a5;
                    float f4 = a4;
                    canvas.save();
                    a(axf.k, canvas2, f3);
                    canvas2.translate(0.0f, (((float) i6) * f4) - ((((float) (size - 1)) * f4) / 2.0f));
                    int i8 = 0;
                    while (i8 < str4.length()) {
                        axh axh2 = (axh) this.p.d.a(axh.a(str4.charAt(i8), axg.a, axg.c));
                        if (axh2 == null) {
                            str2 = str4;
                        } else {
                            if (this.l.containsKey(axh2)) {
                                list = (List) this.l.get(axh2);
                            } else {
                                List list4 = axh2.a;
                                int size2 = list4.size();
                                ArrayList arrayList = new ArrayList(size2);
                                int i9 = 0;
                                while (i9 < size2) {
                                    arrayList.add(new avv(this.o, this, (ayn) list4.get(i9)));
                                    i9++;
                                    list4 = list4;
                                    size2 = size2;
                                }
                                this.l.put(axh2, arrayList);
                                list = arrayList;
                            }
                            int i10 = 0;
                            while (i10 < list.size()) {
                                Path e = ((avv) list.get(i10)).e();
                                e.computeBounds(this.h, false);
                                this.i.set(matrix);
                                String str5 = str4;
                                this.i.preTranslate(0.0f, ((float) (-axf.f)) * bbb.a());
                                this.i.preScale(f2, f2);
                                e.transform(this.i);
                                if (axf.j) {
                                    a(e, this.j, canvas2);
                                    a(e, this.k, canvas2);
                                } else {
                                    a(e, this.k, canvas2);
                                    a(e, this.j, canvas2);
                                }
                                i10++;
                                str4 = str5;
                            }
                            str2 = str4;
                            float a7 = ((float) axh2.b) * f2 * bbb.a() * a3;
                            float f5 = ((float) axf.d) / 10.0f;
                            awm awm5 = this.t;
                            if (awm5 != null) {
                                f5 += ((Float) awm5.f()).floatValue();
                            }
                            canvas2.translate(a7 + (f5 * a3), 0.0f);
                        }
                        i8++;
                        str4 = str2;
                    }
                    canvas.restore();
                    i6++;
                    a4 = f4;
                    a5 = list3;
                }
            } else {
                float a8 = bbb.a(matrix);
                avc avc = this.o;
                String str6 = axg.a;
                String str7 = axg.c;
                Typeface typeface = null;
                if (avc.getCallback() != null) {
                    if (avc.i == null) {
                        avc.i = new axc(avc.getCallback());
                    }
                    axc = avc.i;
                } else {
                    axc = null;
                }
                if (axc != null) {
                    axm axm = axc.a;
                    axm.a = str6;
                    axm.b = str7;
                    typeface = (Typeface) axc.b.get(axm);
                    if (typeface == null) {
                        typeface = (Typeface) axc.c.get(str6);
                        if (typeface == null) {
                            typeface = Typeface.createFromAsset(axc.d, "fonts/" + str6 + axc.e);
                            axc.c.put(str6, typeface);
                        }
                        boolean contains = str7.contains("Italic");
                        boolean contains2 = str7.contains("Bold");
                        if (!contains || !contains2) {
                            i4 = contains ? 2 : contains2 ? 1 : 0;
                        } else {
                            i4 = 3;
                        }
                        if (typeface.getStyle() != i4) {
                            typeface = Typeface.create(typeface, i4);
                        }
                        axc.b.put(axc.a, typeface);
                    }
                }
                if (typeface != null) {
                    String str8 = axf.a;
                    this.j.setTypeface(typeface);
                    Paint paint2 = this.j;
                    double d10 = axf.c;
                    double a9 = (double) bbb.a();
                    Double.isNaN(a9);
                    paint2.setTextSize((float) (d10 * a9));
                    this.k.setTypeface(this.j.getTypeface());
                    this.k.setTextSize(this.j.getTextSize());
                    float a10 = ((float) axf.e) * bbb.a();
                    List a11 = a(str8);
                    int size3 = a11.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        String str9 = (String) a11.get(i11);
                        a(axf.k, canvas2, this.k.measureText(str9));
                        canvas2.translate(0.0f, (((float) i11) * a10) - ((((float) (size3 - 1)) * a10) / 2.0f));
                        int i12 = 0;
                        while (i12 < str9.length()) {
                            int codePointAt = str9.codePointAt(i12);
                            int charCount = Character.charCount(codePointAt) + i12;
                            while (charCount < str9.length()) {
                                int codePointAt2 = str9.codePointAt(charCount);
                                if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 19) {
                                    break;
                                }
                                charCount += Character.charCount(codePointAt2);
                                codePointAt = (codePointAt * 31) + codePointAt2;
                            }
                            long j2 = (long) codePointAt;
                            if (this.m.b(j2) < 0) {
                                this.g.setLength(0);
                                int i13 = i12;
                                while (i13 < charCount) {
                                    int codePointAt3 = str9.codePointAt(i13);
                                    this.g.appendCodePoint(codePointAt3);
                                    i13 += Character.charCount(codePointAt3);
                                }
                                str = this.g.toString();
                                this.m.b(j2, str);
                            } else {
                                str = (String) this.m.a(j2);
                            }
                            i12 += str.length();
                            if (axf.j) {
                                a(str, this.j, canvas2);
                                a(str, this.k, canvas2);
                            } else {
                                a(str, this.k, canvas2);
                                a(str, this.j, canvas2);
                            }
                            float measureText = this.j.measureText(str, 0, 1);
                            float f6 = ((float) axf.d) / 10.0f;
                            awm awm6 = this.t;
                            if (awm6 != null) {
                                f6 += ((Float) awm6.f()).floatValue();
                            }
                            canvas2.translate(measureText + (f6 * a8), 0.0f);
                        }
                        canvas.setMatrix(matrix);
                    }
                }
            }
            canvas.restore();
            return;
        }
        canvas.restore();
    }

    private static final void a(int i2, Canvas canvas, float f) {
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            canvas.translate(-f, 0.0f);
        } else if (i3 == 2) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private static final void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawPath(path, paint);
        }
    }

    private static final void a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.p.g.width(), (float) this.p.g.height());
    }

    public final void a(Object obj, bbe bbe) {
        super.a(obj, bbe);
        if (obj == avh.a) {
            awm awm = this.q;
            if (awm == null) {
                axb axb = new axb(bbe);
                this.q = axb;
                axb.a((awl) this);
                a(this.q);
                return;
            }
            awm.d = bbe;
        } else if (obj == avh.b) {
            awm awm2 = this.r;
            if (awm2 == null) {
                axb axb2 = new axb(bbe);
                this.r = axb2;
                axb2.a((awl) this);
                a(this.r);
                return;
            }
            awm2.d = bbe;
        } else if (obj == avh.o) {
            awm awm3 = this.s;
            if (awm3 == null) {
                axb axb3 = new axb(bbe);
                this.s = axb3;
                axb3.a((awl) this);
                a(this.s);
                return;
            }
            awm3.d = bbe;
        } else if (obj == avh.p) {
            awm awm4 = this.t;
            if (awm4 == null) {
                axb axb4 = new axb(bbe);
                this.t = axb4;
                axb4.a((awl) this);
                a(this.t);
                return;
            }
            awm4.d = bbe;
        }
    }
}
