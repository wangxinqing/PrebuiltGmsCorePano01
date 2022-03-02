package defpackage;

/* renamed from: artc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class artc extends arhj {
    final /* synthetic */ artd a;
    private long[] b;
    private byte[][] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public artc(artd artd) {
        super((arhj) null);
        this.a = artd;
    }

    public final void a() {
        artd artd = this.a;
        this.b = artd.a;
        this.c = artd.b;
    }

    public final void b() {
        this.b = null;
        this.c = null;
    }

    public final void a(int i) {
        artd artd = this.a;
        artd.a = new long[i];
        artd.b = new byte[i][];
    }

    public final void b(int i) {
        this.a.b[i] = null;
    }

    public final void a(int i, int i2) {
        artd artd = this.a;
        artd.a[i2] = this.b[i];
        artd.b[i2] = this.c[i];
    }
}
