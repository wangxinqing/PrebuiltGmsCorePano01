package defpackage;

/* renamed from: arqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arqu extends arhj {
    final /* synthetic */ arqv a;
    private byte[] b;
    private short[] c;
    private short[] d;
    private long[] e;
    private long[] f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arqu(arqv arqv) {
        super((arhj) null);
        this.a = arqv;
    }

    public final void a() {
        arqv arqv = this.a;
        this.b = arqv.a;
        this.c = arqv.b;
        this.d = arqv.e;
        this.e = arqv.f;
        this.f = arqv.g;
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
        arqv arqv = this.a;
        arqv.a = new byte[(i * 3)];
        arqv.b = new short[i];
        arqv.e = new short[i];
        arqv.f = new long[i];
        arqv.g = new long[i];
    }

    public final void a(int i, int i2) {
        System.arraycopy(this.b, i * 3, this.a.a, i2 * 3, 3);
        arqv arqv = this.a;
        arqv.b[i2] = this.c[i];
        arqv.e[i2] = this.d[i];
        arqv.f[i2] = this.e[i];
        arqv.g[i2] = this.f[i];
    }
}
