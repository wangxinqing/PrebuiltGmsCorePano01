package defpackage;

import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: jjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jjb implements Iterable {
    protected static final long a = TimeUnit.SECONDS.toMillis(1);
    protected static final int b = g(-16384);
    protected static final int c = g(16256);
    protected static final int d = g(127);
    protected static final int e = (((int) Math.pow(2.0d, (double) (32 - b))) - 1);
    public final int[] f;
    public int g = 0;
    public int h = 0;
    public long i = -1;
    private int j = 0;
    private long k = -1;

    public static int d(int i2) {
        return (i2 & -16384) >>> b;
    }

    private final boolean d() {
        return this.g == 0;
    }

    public static int e(int i2) {
        return (i2 & 16256) >>> c;
    }

    public static int f(int i2) {
        return (i2 & 127) >>> d;
    }

    private static int g(int i2) {
        int i3 = 0;
        while (i2 != 0 && (i2 & 1) == 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public abstract String a(long j2, int i2, int i3);

    public void a() {
        this.j = 0;
        this.g = 0;
        this.h++;
        this.i = -1;
        this.k = -1;
    }

    public final int b(int i2) {
        return c(i2 + 1);
    }

    public final int c() {
        return c(this.j - this.g);
    }

    public jjb(int i2) {
        this.f = new int[i2];
    }

    public final void a(int i2) {
        a(i2, 0);
    }

    /* renamed from: b */
    public final ListIterator iterator() {
        return new jja(this);
    }

    public final int c(int i2) {
        int length = this.f.length;
        return ((i2 % length) + length) % length;
    }

    public final void a(int i2, int i3) {
        long currentTimeMillis = System.currentTimeMillis() / a;
        int i4 = 0;
        if (!d()) {
            int i5 = (int) (currentTimeMillis - this.k);
            if (i5 < 0 || i5 / e >= this.f.length - 1) {
                a();
            } else {
                while (true) {
                    int i6 = e;
                    if (i5 < i6) {
                        break;
                    }
                    a(i6, 0, 0);
                    i5 -= e;
                }
                i4 = i5;
            }
        }
        if (d()) {
            this.i = currentTimeMillis;
            this.k = currentTimeMillis;
        }
        a(i4, i2, i3);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3, int i4) {
        long j2 = this.i;
        if (j2 == -1 || this.k == -1) {
            throw new IllegalStateException();
        }
        int i5 = this.g;
        int[] iArr = this.f;
        if (i5 == iArr.length) {
            this.i = j2 + ((long) d(iArr[c()]));
        } else {
            this.g = i5 + 1;
        }
        int[] iArr2 = this.f;
        int i6 = this.j;
        if (i2 <= e) {
            iArr2[i6] = ((i3 << c) & 16256) | ((i2 << b) & -16384) | ((i4 << d) & 127);
            this.j = b(i6);
            this.k += (long) i2;
            this.h++;
            return;
        }
        throw new IllegalStateException();
    }
}
