package defpackage;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

/* renamed from: ahyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyb {
    public final int a;
    public int b;
    public int c;
    public long[] d;
    public float[][] e;
    private final long f;
    private final long g;

    public ahyb(int i, int i2, int i3, int i4) {
        long j;
        this.a = i;
        this.d = new long[i2];
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.e = (float[][]) Array.newInstance(float.class, iArr);
        long j2 = Long.MAX_VALUE;
        if (i3 != 0) {
            j = TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / ((long) i3);
        } else {
            j = Long.MAX_VALUE;
        }
        this.f = j;
        this.g = i4 != 0 ? TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / ((long) i4) : j2;
    }

    private final int b(int i) {
        if (i >= 0 && i < this.c) {
            return (this.b + i) % this.d.length;
        }
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(56);
        sb.append("Index ");
        sb.append(i);
        sb.append(" out of bound. Current size=");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final float a(int i, int i2) {
        return this.e[i2][b(i)];
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final int a(long j) {
        if (a()) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i >= i2) {
                return i2 - 1;
            }
            if (a(i) <= j) {
                i++;
            } else if (i != 0) {
                return i - 1;
            } else {
                return -1;
            }
        }
    }

    public final int a(long j, int i) {
        if (a()) {
            return -1;
        }
        if (i == -1) {
            return 0;
        }
        if (a(i) == j) {
            return i;
        }
        if (i != this.c - 1) {
            return i + 1;
        }
        return -1;
    }

    public final long a(int i) {
        return this.d[b(i)];
    }

    public final void a(long j, float[] fArr) {
        if (!a()) {
            int i = -1;
            if (!a()) {
                i = ((this.b + this.c) - 1) % this.d.length;
            }
            long j2 = j - this.d[i];
            if (j2 > this.g) {
                this.b = 0;
                this.c = 0;
            } else if (j2 < this.f) {
                return;
            }
        }
        int i2 = this.b;
        int i3 = this.c;
        long[] jArr = this.d;
        int length = (i2 + i3) % jArr.length;
        jArr[length] = j;
        for (int i4 = 0; i4 < this.a; i4++) {
            this.e[i4][length] = fArr[i4];
        }
        int i5 = this.c;
        int length2 = this.d.length;
        if (i5 == length2) {
            this.b = (this.b + 1) % length2;
        } else {
            this.c = i5 + 1;
        }
    }
}
