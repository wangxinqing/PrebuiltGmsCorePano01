package defpackage;

/* renamed from: arrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arrr extends arhj {
    final /* synthetic */ arrs a;
    private short[] b;
    private long[] c;
    private int[] d;
    private int[] e;
    private long[] f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arrr(arrs arrs) {
        super((arhj) null);
        this.a = arrs;
    }

    public final void a() {
        arrs arrs = this.a;
        this.b = arrs.b;
        this.c = arrs.e;
        this.d = arrs.f;
        this.e = arrs.g;
        this.f = arrs.h;
    }

    public final void b() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void b(int i) {
    }

    public final void a(int i) {
        arrs arrs = this.a;
        arrs.b = new short[i];
        arrs.e = new long[i];
        arrs.f = new int[i];
        arrs.g = new int[i];
        arrs.h = new long[i];
    }

    public final void a(int i, int i2) {
        arrs arrs = this.a;
        arrs.b[i2] = this.b[i];
        arrs.e[i2] = this.c[i];
        arrs.f[i2] = this.d[i];
        arrs.g[i2] = this.e[i];
        arrs.h[i2] = this.f[i];
    }
}
