package defpackage;

/* renamed from: arga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arga extends arhi {
    final /* synthetic */ argb a;
    private long[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arga(argb argb, arhj arhj) {
        super(arhj);
        this.a = argb;
    }

    public final void a() {
        this.b = this.a.a;
        super.a();
    }

    public final int b(int i) {
        int b2 = this.a.b(this.b[i]);
        if (b2 < 0) {
            b2 ^= -1;
        }
        super.a(i, b2);
        return b2;
    }

    public final int c(int i) {
        return argb.d(this.a.a[i]);
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
