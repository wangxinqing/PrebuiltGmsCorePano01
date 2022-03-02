package defpackage;

/* renamed from: arrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arrm extends arhj {
    final /* synthetic */ arrn a;
    private short[] b;
    private long[] c;
    private int[] d;
    private long[] e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arrm(arrn arrn) {
        super((arhj) null);
        this.a = arrn;
    }

    public final void a() {
        arrn arrn = this.a;
        this.b = arrn.b;
        this.c = arrn.e;
        this.d = arrn.f;
        this.e = arrn.g;
    }

    public final void b() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final void b(int i) {
    }

    public final void a(int i) {
        arrn arrn = this.a;
        arrn.b = new short[i];
        arrn.e = new long[i];
        arrn.f = new int[i];
        arrn.g = new long[i];
    }

    public final void a(int i, int i2) {
        arrn arrn = this.a;
        arrn.b[i2] = this.b[i];
        arrn.e[i2] = this.c[i];
        arrn.f[i2] = this.d[i];
        arrn.g[i2] = this.e[i];
    }
}
