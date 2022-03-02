package defpackage;

import java.util.Arrays;

/* renamed from: aisn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aisn {
    private long a;
    private long b;
    private int[] c = new int[23];

    private final void b() {
        if (this.c == null) {
            throw new IllegalStateException("The Builder is invalid after is has been built.");
        }
    }

    public final synchronized aism a() {
        aism aism;
        b();
        aism = new aism(this.c, this.a, this.b);
        this.c = null;
        return aism;
    }

    public final synchronized aism a(int i) {
        b();
        int i2 = 0;
        for (int i3 = 0; i3 < 23; i3++) {
            int i4 = this.c[i3];
            if (!(i3 == i || i4 == 0)) {
                i2 += i4;
            }
        }
        double d = (double) i2;
        Double.isNaN(d);
        double d2 = d / 30.0d;
        if (d2 == 0.0d) {
            Arrays.fill(this.c, 0);
            this.c[4] = 100;
        } else {
            for (int i5 = 0; i5 < 23; i5++) {
                int[] iArr = this.c;
                double d3 = (double) iArr[i5];
                Double.isNaN(d3);
                iArr[i5] = (int) Math.round(d3 / d2);
            }
            this.c[i] = 70;
        }
        return a();
    }

    public final synchronized void b(long j) {
        b();
        this.b = j;
    }

    public final synchronized void a(int i, int i2) {
        b();
        this.c[i] = i2;
    }

    public final synchronized void a(long j) {
        b();
        this.a = j;
    }

    public final synchronized void a(aism aism) {
        b();
        this.a = aism.a;
        this.b = aism.b;
        System.arraycopy(aism.c, 0, this.c, 0, 23);
    }
}
