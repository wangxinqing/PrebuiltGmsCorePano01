package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* renamed from: atd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atd {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final ata d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final nz l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public atd() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new nz();
        this.d = new ata();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(ata ata, Matrix matrix, Canvas canvas, int i2, int i3) {
        ata ata2 = ata;
        Canvas canvas2 = canvas;
        ata2.a.set(matrix);
        ata2.a.preConcat(ata2.j);
        canvas.save();
        for (int i4 = 0; i4 < ata2.b.size(); i4++) {
            atb atb = (atb) ata2.b.get(i4);
            if (atb instanceof ata) {
                a((ata) atb, ata2.a, canvas, i2, i3);
                int i5 = i2;
                int i6 = i3;
            } else if (atb instanceof atc) {
                atc atc = (atc) atb;
                float f2 = ((float) i2) / this.g;
                float f3 = ((float) i3) / this.h;
                float min = Math.min(f2, f3);
                Matrix matrix2 = ata2.a;
                this.o.set(matrix2);
                this.o.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                double hypot = Math.hypot((double) fArr[0], (double) fArr[1]);
                float f4 = min;
                double hypot2 = Math.hypot((double) fArr[2], (double) fArr[3]);
                float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) hypot, (float) hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    ln[] lnVarArr = atc.m;
                    if (lnVarArr != null) {
                        ln.a(lnVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (atc.a()) {
                        this.n.setFillType(atc.o != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                        this.n.addPath(path2, this.o);
                        canvas2.clipPath(this.n);
                    } else {
                        asz asz = (asz) atc;
                        float f6 = asz.g;
                        if (!(f6 == 0.0f && asz.h == 1.0f)) {
                            float f7 = asz.i;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (asz.h + f7) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path2.reset();
                            if (f10 > f11) {
                                this.p.getSegment(f10, length, path2, true);
                                this.p.getSegment(0.0f, f11, path2, true);
                            } else {
                                this.p.getSegment(f10, f11, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (asz.d.c()) {
                            kv kvVar = asz.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (kvVar.a()) {
                                Shader shader = kvVar.a;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(asz.f * 255.0f));
                            } else {
                                paint2.setShader((Shader) null);
                                paint2.setAlpha(255);
                                paint2.setColor(atg.a(kvVar.b, asz.f));
                            }
                            paint2.setColorFilter((ColorFilter) null);
                            this.n.setFillType(asz.o != 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                            canvas2.drawPath(this.n, paint2);
                        }
                        if (asz.b.c()) {
                            kv kvVar2 = asz.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = asz.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = asz.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(asz.l);
                            if (kvVar2.a()) {
                                Shader shader2 = kvVar2.a;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(asz.e * 255.0f));
                            } else {
                                paint4.setShader((Shader) null);
                                paint4.setAlpha(255);
                                paint4.setColor(atg.a(kvVar2.b, asz.e));
                            }
                            paint4.setColorFilter((ColorFilter) null);
                            paint4.setStrokeWidth(asz.c * abs * f4);
                            canvas2.drawPath(this.n, paint4);
                        }
                    }
                }
            } else {
                int i7 = i2;
                int i8 = i3;
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.i = i2;
    }

    public atd(atd atd) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new nz();
        this.d = new ata(atd.d, this.l);
        this.m = new Path(atd.m);
        this.n = new Path(atd.n);
        this.e = atd.e;
        this.f = atd.f;
        this.g = atd.g;
        this.h = atd.h;
        int i2 = atd.q;
        this.q = 0;
        this.i = atd.i;
        this.j = atd.j;
        String str = atd.j;
        if (str != null) {
            this.l.put(str, this);
        }
        this.k = atd.k;
    }
}
