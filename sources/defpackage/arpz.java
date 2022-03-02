package defpackage;

/* renamed from: arpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arpz extends arhj {
    final /* synthetic */ arqa a;
    private int[] b;
    private byte[] c;
    private byte[] d;
    private short[] e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arpz(arqa arqa) {
        super((arhj) null);
        this.a = arqa;
    }

    public final void a() {
        arqa arqa = this.a;
        this.b = arqa.a;
        this.c = arqa.b;
        this.d = arqa.e;
        this.e = arqa.f;
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
        arqa arqa = this.a;
        arqa.a = new int[i];
        arqa.b = new byte[i];
        arqa.e = new byte[i];
        arqa.f = new short[i];
    }

    public final void a(int i, int i2) {
        arqa arqa = this.a;
        arqa.a[i2] = this.b[i];
        arqa.b[i2] = this.c[i];
        arqa.e[i2] = this.d[i];
        arqa.f[i2] = this.e[i];
    }
}
