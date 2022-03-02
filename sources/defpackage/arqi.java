package defpackage;

/* renamed from: arqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arqi extends arhi {
    final /* synthetic */ arqj a;
    private long[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arqi(arqj arqj, arhj arhj) {
        super(arhj);
        this.a = arqj;
    }

    public final void a() {
        this.b = this.a.a;
        super.a();
    }

    public final int b(int i) {
        int d = this.a.d(this.b[i]);
        if (d < 0) {
            d ^= -1;
        }
        super.a(i, d);
        return d;
    }

    public final int c(int i) {
        return arqj.b(this.a.a[i]);
    }

    public final void a(int i) {
        this.a.a = new long[i];
        super.a(i);
    }

    public final void b() {
        this.b = null;
        super.b();
    }
}
