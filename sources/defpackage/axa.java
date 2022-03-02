package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: axa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axa {
    public awm a;
    public awm b;
    public awm c;
    public awm d;
    public awm e;
    public final awo f;
    public final awo g;
    public final awm h;
    public final awm i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public axa(axy axy) {
        awm awm;
        awm awm2;
        awm awm3;
        awm awm4;
        awm awm5;
        awm awm6;
        axr axr = axy.a;
        if (axr != null) {
            awm = axr.a();
        } else {
            awm = null;
        }
        this.a = awm;
        axz axz = axy.b;
        if (axz != null) {
            awm2 = axz.a();
        } else {
            awm2 = null;
        }
        this.b = awm2;
        axt axt = axy.c;
        if (axt != null) {
            awm3 = axt.a();
        } else {
            awm3 = null;
        }
        this.c = awm3;
        axo axo = axy.d;
        if (axo != null) {
            awm4 = axo.a();
        } else {
            awm4 = null;
        }
        this.d = awm4;
        axo axo2 = axy.f;
        if (axo2 != null) {
            awm5 = axo2.a();
        } else {
            awm5 = null;
        }
        awo awo = (awo) awm5;
        this.f = awo;
        if (awo != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        axo axo3 = axy.g;
        if (axo3 != null) {
            awm6 = axo3.a();
        } else {
            awm6 = null;
        }
        this.g = (awo) awm6;
        axq axq = axy.e;
        if (axq != null) {
            this.e = axq.a();
        }
        axo axo4 = axy.h;
        if (axo4 != null) {
            this.h = axo4.a();
        } else {
            this.h = null;
        }
        axo axo5 = axy.i;
        if (axo5 != null) {
            this.i = axo5.a();
        } else {
            this.i = null;
        }
    }

    private final void b() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.n[i2] = 0.0f;
        }
    }

    public final Matrix a() {
        float f2;
        float f3;
        float f4;
        this.j.reset();
        awm awm = this.b;
        if (awm != null) {
            PointF pointF = (PointF) awm.f();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.j.preTranslate(pointF.x, pointF.y);
            }
        }
        awm awm2 = this.d;
        if (awm2 != null) {
            if (awm2 instanceof axb) {
                f4 = ((Float) awm2.f()).floatValue();
            } else {
                f4 = ((awo) awm2).g();
            }
            if (f4 != 0.0f) {
                this.j.preRotate(f4);
            }
        }
        if (this.f != null) {
            awo awo = this.g;
            if (awo != null) {
                f2 = (float) Math.cos(Math.toRadians((double) ((-awo.g()) + 90.0f)));
            } else {
                f2 = 0.0f;
            }
            awo awo2 = this.g;
            if (awo2 != null) {
                f3 = (float) Math.sin(Math.toRadians((double) ((-awo2.g()) + 90.0f)));
            } else {
                f3 = 1.0f;
            }
            double tan = Math.tan(Math.toRadians((double) this.f.g()));
            b();
            float[] fArr = this.n;
            fArr[0] = f2;
            fArr[1] = f3;
            float f5 = -f3;
            fArr[3] = f5;
            fArr[4] = f2;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            b();
            float[] fArr2 = this.n;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.l.setValues(fArr2);
            b();
            float[] fArr3 = this.n;
            fArr3[0] = f2;
            fArr3[1] = f5;
            fArr3[3] = f3;
            fArr3[4] = f2;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        awm awm3 = this.c;
        if (awm3 != null) {
            bbf bbf = (bbf) awm3.f();
            float f6 = bbf.a;
            if (!(f6 == 1.0f && bbf.b == 1.0f)) {
                this.j.preScale(f6, bbf.b);
            }
        }
        awm awm4 = this.a;
        if (awm4 != null) {
            PointF pointF2 = (PointF) awm4.f();
            if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
                this.j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.j;
    }

    public final Matrix a(float f2) {
        PointF pointF;
        bbf bbf;
        awm awm = this.b;
        PointF pointF2 = null;
        if (awm != null) {
            pointF = (PointF) awm.f();
        } else {
            pointF = null;
        }
        awm awm2 = this.c;
        if (awm2 != null) {
            bbf = (bbf) awm2.f();
        } else {
            bbf = null;
        }
        this.j.reset();
        if (pointF != null) {
            this.j.preTranslate(pointF.x * f2, pointF.y * f2);
        }
        if (bbf != null) {
            double d2 = (double) f2;
            this.j.preScale((float) Math.pow((double) bbf.a, d2), (float) Math.pow((double) bbf.b, d2));
        }
        awm awm3 = this.d;
        if (awm3 != null) {
            float floatValue = ((Float) awm3.f()).floatValue();
            awm awm4 = this.a;
            if (awm4 != null) {
                pointF2 = (PointF) awm4.f();
            }
            Matrix matrix = this.j;
            float f3 = floatValue * f2;
            float f4 = 0.0f;
            float f5 = pointF2 != null ? pointF2.x : 0.0f;
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f5, f4);
        }
        return this.j;
    }

    public final void a(awl awl) {
        awm awm = this.e;
        if (awm != null) {
            awm.a(awl);
        }
        awm awm2 = this.h;
        if (awm2 != null) {
            awm2.a(awl);
        }
        awm awm3 = this.i;
        if (awm3 != null) {
            awm3.a(awl);
        }
        awm awm4 = this.a;
        if (awm4 != null) {
            awm4.a(awl);
        }
        awm awm5 = this.b;
        if (awm5 != null) {
            awm5.a(awl);
        }
        awm awm6 = this.c;
        if (awm6 != null) {
            awm6.a(awl);
        }
        awm awm7 = this.d;
        if (awm7 != null) {
            awm7.a(awl);
        }
        awo awo = this.f;
        if (awo != null) {
            awo.a(awl);
        }
        awo awo2 = this.g;
        if (awo2 != null) {
            awo2.a(awl);
        }
    }

    public final void a(ayu ayu) {
        ayu.a(this.e);
        ayu.a(this.h);
        ayu.a(this.i);
        ayu.a(this.a);
        ayu.a(this.b);
        ayu.a(this.c);
        ayu.a(this.d);
        ayu.a((awm) this.f);
        ayu.a((awm) this.g);
    }

    public final boolean a(Object obj, bbe bbe) {
        awm awm;
        awm awm2;
        if (obj == avh.e) {
            awm awm3 = this.a;
            if (awm3 == null) {
                new PointF();
                this.a = new axb(bbe, (byte[]) null);
                return true;
            }
            awm3.d = bbe;
            return true;
        } else if (obj == avh.f) {
            awm awm4 = this.b;
            if (awm4 == null) {
                new PointF();
                this.b = new axb(bbe, (byte[]) null);
                return true;
            }
            awm4.d = bbe;
            return true;
        } else if (obj == avh.k) {
            awm awm5 = this.c;
            if (awm5 == null) {
                new bbf();
                this.c = new axb(bbe, (byte[]) null);
                return true;
            }
            awm5.d = bbe;
            return true;
        } else if (obj == avh.l) {
            awm awm6 = this.d;
            if (awm6 == null) {
                this.d = new axb(bbe, (byte[]) null);
                return true;
            }
            awm6.d = bbe;
            return true;
        } else {
            if (obj == avh.c) {
                awm = this.e;
                if (awm == null) {
                    this.e = new axb(bbe, (byte[]) null);
                    return true;
                }
            } else if ((obj == avh.y && (awm2 = this.h) != null) || ((obj == avh.z && (awm2 = this.i) != null) || (obj == avh.m && (awm2 = this.f) != null))) {
                awm2.d = bbe;
                return true;
            } else if (obj != avh.n || (awm = this.g) == null) {
                return false;
            }
            awm.d = bbe;
            return true;
        }
    }
}
