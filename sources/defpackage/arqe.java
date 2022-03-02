package defpackage;

/* renamed from: arqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arqe extends arhj {
    final /* synthetic */ arqf a;
    private int[] b;
    private byte[] c;
    private byte[] d;
    private short[] e;
    private short[] f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arqe(arqf arqf) {
        super((arhj) null);
        this.a = arqf;
    }

    public final void a() {
        arqf arqf = this.a;
        this.b = arqf.a;
        this.c = arqf.b;
        this.d = arqf.e;
        this.e = arqf.f;
        this.f = arqf.g;
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
        arqf arqf = this.a;
        arqf.a = new int[i];
        arqf.b = new byte[i];
        arqf.e = new byte[i];
        arqf.f = new short[i];
        arqf.g = new short[i];
    }

    public final void a(int i, int i2) {
        arqf arqf = this.a;
        arqf.a[i2] = this.b[i];
        arqf.b[i2] = this.c[i];
        arqf.e[i2] = this.d[i];
        arqf.f[i2] = this.e[i];
        arqf.g[i2] = this.f[i];
    }
}
