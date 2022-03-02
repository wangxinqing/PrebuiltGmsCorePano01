package defpackage;

import java.io.Serializable;

/* renamed from: ahpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpa implements Serializable {
    private final float[] a;
    private int b = 0;
    private boolean c = false;
    private float d;

    public ahpa(int i) {
        this.a = new float[i];
    }

    public final float a(int i) {
        int length = this.a.length;
        if (a() == 0) {
            throw new IndexOutOfBoundsException("Array is empty.");
        } else if (i >= a()) {
            int a2 = a();
            StringBuilder sb = new StringBuilder(61);
            sb.append("Index of ");
            sb.append(i);
            sb.append(" is larger than array size of ");
            sb.append(a2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (!this.c) {
            return this.a[i];
        } else {
            int i2 = i + this.b;
            if (i2 >= length) {
                i2 -= length;
            }
            return this.a[i2];
        }
    }

    public final int a() {
        return this.c ? this.a.length : this.b;
    }

    public final void b(float f) {
        int i;
        int i2;
        if (a() != 0) {
            float[] fArr = this.a;
            if (this.c && (i2 = this.b) > 0) {
                i = i2 - 1;
            } else {
                i = a() - 1;
            }
            fArr[i] = f;
            return;
        }
        throw new IndexOutOfBoundsException("Array is empty.");
    }

    public final float c() {
        int i;
        int i2;
        if (a() != 0) {
            float[] fArr = this.a;
            if (this.c && (i2 = this.b) > 0) {
                i = i2 - 1;
            } else {
                i = a() - 1;
            }
            return fArr[i];
        }
        throw new IndexOutOfBoundsException("Array is empty.");
    }

    public final float[] b() {
        if (a() <= 1) {
            return new float[0];
        }
        int a2 = a() - 1;
        float[] fArr = new float[a2];
        int i = this.b;
        int a3 = a();
        int length = this.a.length;
        int i2 = ((i - a3) + length) % length;
        for (int i3 = 0; i3 < a2; i3++) {
            float[] fArr2 = this.a;
            int i4 = i2 + i3;
            int length2 = fArr2.length;
            fArr[i3] = fArr2[(i4 + 1) % length2] - fArr2[i4 % length2];
        }
        return fArr;
    }

    public final void a(float f) {
        if (this.c) {
            this.d -= this.a[this.b];
        }
        float[] fArr = this.a;
        int i = this.b;
        fArr[i] = f;
        this.d += f;
        if (i == fArr.length - 1) {
            this.b = 0;
            this.c = true;
            return;
        }
        this.b = i + 1;
    }
}
