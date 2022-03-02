package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: ahyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyq {
    public static final ahyq e = new ahyq();
    public final int a;
    public final int b;
    public final long[] c;
    public final float[][] d;

    private ahyq() {
        this.c = new long[0];
        this.d = (float[][]) Array.newInstance(float.class, new int[]{0, 0});
        this.a = 0;
        this.b = 0;
    }

    public final float a(int i, int i2) {
        return this.d[i2][b(i)];
    }

    public final int b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a + i;
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(67);
        sb.append("Try to access index at ");
        sb.append(i);
        sb.append(", the total length is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public ahyq(long[] jArr, float[][] fArr) {
        this(jArr, fArr, 0, jArr.length);
    }

    public final int a() {
        return this.d.length;
    }

    public final ahyq b(int i, int i2) {
        if (i2 == 0) {
            return e;
        }
        return new ahyq(this.c, this.d, b(i), i2);
    }

    private ahyq(long[] jArr, float[][] fArr, int i, int i2) {
        int length;
        if (jArr == null || fArr == null) {
            throw new IllegalArgumentException("timestampNanos or value is null.");
        } else if (fArr.length != 0 && jArr.length != fArr[0].length) {
            throw new IllegalArgumentException("Lengths of timestampNanos and values are not equal.");
        } else if (i < 0 || i >= (length = jArr.length) || i2 <= 0 || i + i2 > length) {
            int length2 = jArr.length;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Internal array length=");
            sb.append(length2);
            sb.append(", startIndex=");
            sb.append(i);
            sb.append(", length=");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else {
            this.c = jArr;
            this.d = fArr;
            this.a = i;
            this.b = i2;
        }
    }

    public final int a(long j) {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        long[] jArr = this.c;
        int i2 = this.a;
        int binarySearch = Arrays.binarySearch(jArr, i2, i + i2, j);
        int i3 = this.a;
        return binarySearch >= 0 ? binarySearch - i3 : binarySearch + i3;
    }

    public final long a(int i) {
        return this.c[b(i)];
    }

    public final ahyq a(long j, long j2, long j3, long j4) {
        int i;
        int i2;
        if (j >= 0) {
            i = a(j);
            if (i < 0 && ((-i) - 2 < 0 || j - a(i) > j2)) {
                i++;
            }
        } else {
            i = 0;
        }
        if (j3 < 0) {
            i2 = this.b - 1;
        } else {
            i2 = a(j3);
            if (i2 < 0 && ((-i2) - 1 >= this.b || a(i2) - j3 > j4)) {
                i2--;
            }
        }
        return i <= i2 ? b(i, (i2 - i) + 1) : e;
    }
}
