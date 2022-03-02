package defpackage;

/* renamed from: arqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arqn extends arhj {
    final /* synthetic */ arqo a;
    private long[] b;
    private long[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arqn(arqo arqo) {
        super((arhj) null);
        this.a = arqo;
    }

    public final void a() {
        arqo arqo = this.a;
        this.b = arqo.a;
        this.c = arqo.b;
    }

    public final void b() {
        this.b = null;
        this.c = null;
    }

    public final void b(int i) {
    }

    public final void a(int i) {
        arqo arqo = this.a;
        arqo.a = new long[i];
        arqo.b = new long[i];
    }

    public final void a(int i, int i2) {
        arqo arqo = this.a;
        arqo.a[i2] = this.b[i];
        arqo.b[i2] = this.c[i];
    }
}
