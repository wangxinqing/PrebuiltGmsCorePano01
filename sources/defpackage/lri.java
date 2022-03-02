package defpackage;

/* renamed from: lri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lri implements lsg {
    private final int a;
    private final long b;
    private long c;
    private int d;

    public lri(jiq jiq, agvx agvx, agvx agvx2, int i, long j) {
        iva.a((Object) jiq);
        this.a = ((Integer) agvx.c()).intValue();
        this.b = ((Long) agvx2.c()).longValue();
        this.d = i;
        this.c = j;
    }

    private final synchronized void a(long j) {
        long j2 = j - this.c;
        long j3 = this.b;
        long j4 = -j3;
        int i = this.a;
        long j5 = (long) i;
        if (j2 < j4 * j5) {
            this.c = (j5 * j3) + j;
            j2 = j4;
        }
        if (j2 >= j3) {
            int i2 = (int) (((long) this.d) + (j2 / j3));
            this.d = i2;
            this.c = j - (j2 % j3);
            this.d = Math.min(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int b() {
        return this.d;
    }

    public final synchronized boolean c() {
        a(System.currentTimeMillis());
        return this.d > 0;
    }

    public final synchronized boolean d() {
        boolean c2;
        c2 = c();
        if (c2) {
            this.d--;
        }
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long e() {
        long currentTimeMillis = System.currentTimeMillis();
        a(currentTimeMillis);
        int i = this.d;
        if (i <= 0) {
            long j = this.c + this.b;
            this.c = j;
            return j - currentTimeMillis;
        }
        this.d = i - 1;
        return 0;
    }

    public final synchronized void f() {
        long e = e();
        if (e > 0) {
            try {
                Thread.sleep(e);
            } catch (InterruptedException e2) {
                this.c -= this.b;
                throw e2;
            }
        }
    }

    public final void g() {
    }
}
