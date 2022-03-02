package defpackage;

/* renamed from: clm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class clm {
    public final String a;
    public int[] b;
    private final long[] c = new long[2];
    private final long[] d = new long[2];
    private final long[] e = new long[2];
    private final long[] f = new long[2];

    public clm(String str) {
        iva.c(str);
        this.a = str;
        this.b = new int[16];
        for (int i = 0; i < 2; i++) {
            this.c[i] = 0;
            this.d[i] = 0;
            this.e[i] = Long.MAX_VALUE;
            this.f[i] = 0;
        }
    }

    public final long a(int i) {
        int i2 = this.b[0];
        if (i2 == 0) {
            return 0;
        }
        double d2 = (double) this.c[i];
        double d3 = (double) i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public final long b(int i) {
        if (this.b[0] == 0) {
            return 0;
        }
        long a2 = a(i);
        double d2 = (double) this.d[i];
        double d3 = (double) this.b[0];
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) (a2 * a2);
        Double.isNaN(d5);
        return Math.round(Math.sqrt(d4 - d5));
    }

    public final long c(int i) {
        if (this.b[0] != 0) {
            return this.e[i];
        }
        return -1;
    }

    public final long d(int i) {
        if (this.b[0] != 0) {
            return this.f[i];
        }
        return -1;
    }

    public final void a(long j, int i) {
        long[] jArr = this.c;
        jArr[i] = jArr[i] + j;
        long[] jArr2 = this.d;
        jArr2[i] = jArr2[i] + (j * j);
        long[] jArr3 = this.e;
        jArr3[i] = Math.min(jArr3[i], j);
        long[] jArr4 = this.f;
        jArr4[i] = Math.max(jArr4[i], j);
    }
}
