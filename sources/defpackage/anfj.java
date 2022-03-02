package defpackage;

import java.util.Arrays;

/* renamed from: anfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfj {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    public transient float g;
    public transient int h;

    anfj() {
        f(3);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.c == 0 ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = i + 1;
        if (i2 >= this.c) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final Object c(int i) {
        amrl.a(i, this.c);
        return this.a[i];
    }

    /* access modifiers changed from: package-private */
    public final int d(int i) {
        amrl.a(i, this.c);
        return this.b[i];
    }

    /* access modifiers changed from: package-private */
    public final int e(int i) {
        long[] jArr;
        long j;
        Object obj = this.a[i];
        int a2 = a(this.f[i]);
        int a3 = a() & a2;
        int i2 = this.e[a3];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (a(this.f[i2]) != a2 || !amqx.a(obj, this.a[i2])) {
                int i4 = (int) this.f[i2];
                if (i4 == -1) {
                    return 0;
                }
                int i5 = i4;
                i3 = i2;
                i2 = i5;
            } else {
                int i6 = this.b[i2];
                if (i3 == -1) {
                    this.e[a3] = (int) this.f[i2];
                } else {
                    long[] jArr2 = this.f;
                    jArr2[i3] = a(jArr2[i3], (int) jArr2[i2]);
                }
                int i7 = this.c - 1;
                if (i2 < i7) {
                    Object[] objArr = this.a;
                    objArr[i2] = objArr[i7];
                    int[] iArr = this.b;
                    iArr[i2] = iArr[i7];
                    objArr[i7] = null;
                    iArr[i7] = 0;
                    long[] jArr3 = this.f;
                    long j2 = jArr3[i7];
                    jArr3[i2] = j2;
                    jArr3[i7] = -1;
                    int a4 = a(j2) & a();
                    int[] iArr2 = this.e;
                    int i8 = iArr2[a4];
                    if (i8 == i7) {
                        iArr2[a4] = i2;
                    } else {
                        while (true) {
                            jArr = this.f;
                            j = jArr[i8];
                            int i9 = (int) j;
                            if (i9 == i7) {
                                break;
                            }
                            i8 = i9;
                        }
                        jArr[i8] = a(j, i2);
                    }
                } else {
                    this.a[i2] = null;
                    this.b[i2] = 0;
                    this.f[i2] = -1;
                }
                this.c--;
                this.d++;
                return i6;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i) {
        amrl.a(true, (Object) "Initial capacity must be non-negative");
        amrl.a(true, (Object) "Illegal load factor");
        int b2 = amzi.b(i);
        this.e = a(b2);
        this.g = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f = jArr;
        this.h = Math.max(1, (int) ((float) b2));
    }

    public anfj(int i) {
        f(i);
    }

    public static int[] a(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int a() {
        return this.e.length - 1;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        int a2 = amzi.a(obj);
        int i = this.e[a() & a2];
        while (i != -1) {
            long j = this.f[i];
            if (a(j) == a2 && amqx.a(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        amrl.a(i, this.c);
        this.b[i] = i2;
    }
}
