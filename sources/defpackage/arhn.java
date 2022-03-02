package defpackage;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

/* renamed from: arhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arhn extends arhl {
    private int[] k;
    private int[] l;
    private int[] m;
    private int[] n;
    private int[] o;
    private transient int[] p;

    public arhn(arhi arhi, int i, int i2, float f, ByteBuffer byteBuffer) {
        super(arhi, i, i2, f, byteBuffer, Integer.MAX_VALUE);
    }

    private static int[] l(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int a(int i) {
        return this.m[j(i)];
    }

    public final int b() {
        return (this.f * 16) + 48 + (this.e * 4);
    }

    public final int c(int i) {
        return this.l[i];
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.p = this.k;
    }

    public final int d(int i) {
        return this.k[i];
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.p = null;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        int i;
        int i2 = this.f;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i2 - 1;
            if (i4 >= i) {
                break;
            }
            int i5 = i4 + 1;
            iArr[i4] = i5;
            i4 = i5;
        }
        iArr[i] = 0;
        this.k = iArr;
        int i6 = this.f;
        int[] iArr2 = new int[i6];
        int i7 = i6 - 1;
        iArr2[0] = i7;
        while (i3 < i7) {
            int i8 = i3 + 1;
            iArr2[i8] = i3;
            i3 = i8;
        }
        this.l = iArr2;
        this.m = l(this.e);
        this.n = l(this.f);
        this.o = l(this.f);
    }

    /* access modifiers changed from: protected */
    public final int f(int i) {
        return this.p[i];
    }

    /* access modifiers changed from: protected */
    public final void g(int i) {
        int i2 = this.h;
        if (i != i2) {
            int[] iArr = this.l;
            int i3 = iArr[i];
            int i4 = iArr[i2];
            if (i == i4) {
                this.h = i;
                this.i = i3;
                return;
            }
            if (i == this.i) {
                this.i = i3;
            }
            int[] iArr2 = this.k;
            int i5 = iArr2[i];
            iArr2[i] = i2;
            iArr[i] = i4;
            iArr2[i3] = i5;
            iArr[i5] = i3;
            iArr2[i4] = i;
            iArr[i2] = i;
            this.h = i;
            this.d++;
        }
    }

    /* access modifiers changed from: protected */
    public final void h(int i) {
        int i2 = this.n[i];
        int i3 = this.o[i];
        int j = j(this.j.c(i));
        int[] iArr = this.m;
        if (i == iArr[j]) {
            iArr[j] = i2;
        } else {
            this.n[i3] = i2;
        }
        if (i2 != -1) {
            this.o[i2] = i3;
        }
        this.n[i] = -1;
        this.o[i] = -1;
        this.g--;
        this.d++;
    }

    public final void a() {
        int i = this.f;
        int i2 = this.b;
        if (i == i2) {
            Arrays.fill(this.m, -1);
            int i3 = this.h;
            int i4 = this.g;
            for (int i5 = 0; i5 < i4; i5++) {
                this.n[i3] = -1;
                this.o[i3] = -1;
                this.j.d(i3);
                i3 = this.k[i3];
            }
            this.h = this.i;
            this.g = 0;
        } else {
            k(i2);
        }
        this.d++;
    }

    public final int b(int i) {
        return this.n[i];
    }

    public final void b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.k);
        asIntBuffer.put(this.l);
        asIntBuffer.put(this.m);
        asIntBuffer.put(this.n);
        asIntBuffer.put(this.o);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    public final void a(int i, int i2) {
        int[] iArr;
        int j = j(i2);
        int[] iArr2 = this.m;
        int i3 = iArr2[j];
        if (i3 == -1) {
            iArr2[j] = i;
            this.o[i] = -1;
        } else {
            while (true) {
                iArr = this.n;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
            this.o[i] = i3;
        }
        this.g++;
        this.d++;
    }

    public final void e(int i) {
        int i2 = this.i;
        if (i != i2) {
            int[] iArr = this.k;
            int i3 = iArr[i];
            int i4 = iArr[i2];
            if (i == i4) {
                this.i = i;
                this.h = i3;
                return;
            }
            if (i == this.h) {
                this.h = i3;
            }
            int[] iArr2 = this.l;
            int i5 = iArr2[i];
            iArr[i] = i4;
            iArr2[i] = i2;
            iArr[i5] = i3;
            iArr2[i3] = i5;
            iArr[i2] = i;
            iArr2[i4] = i;
            this.i = i;
            this.d++;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        int i = this.f;
        this.k = new int[i];
        this.l = new int[i];
        this.m = new int[this.e];
        this.n = new int[i];
        this.o = new int[i];
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.k);
        asIntBuffer.get(this.l);
        asIntBuffer.get(this.m);
        asIntBuffer.get(this.n);
        asIntBuffer.get(this.o);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }
}
