package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: ata  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ata extends atb {
    final Matrix a = new Matrix();
    final ArrayList b = new ArrayList();
    float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    final Matrix j = new Matrix();
    int k;
    public int[] l;
    public String m = null;

    public final void a() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public final boolean b() {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (((atb) this.b.get(i2)).b()) {
                return true;
            }
        }
        return false;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            a();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            a();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            a();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            a();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            a();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            a();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            a();
        }
    }

    public ata() {
    }

    public final boolean a(int[] iArr) {
        boolean z = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            z |= ((atb) this.b.get(i2)).a(iArr);
        }
        return z;
    }

    public ata(ata ata, nz nzVar) {
        atc atc;
        this.c = ata.c;
        this.d = ata.d;
        this.e = ata.e;
        this.f = ata.f;
        this.g = ata.g;
        this.h = ata.h;
        this.i = ata.i;
        int[] iArr = ata.l;
        this.l = null;
        String str = ata.m;
        this.m = str;
        int i2 = ata.k;
        this.k = 0;
        if (str != null) {
            nzVar.put(str, this);
        }
        this.j.set(ata.j);
        ArrayList arrayList = ata.b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof ata) {
                this.b.add(new ata((ata) obj, nzVar));
            } else {
                if (obj instanceof asz) {
                    atc = new asz((asz) obj);
                } else if (obj instanceof asy) {
                    atc = new asy((asy) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(atc);
                String str2 = atc.n;
                if (str2 != null) {
                    nzVar.put(str2, atc);
                }
            }
        }
    }
}
