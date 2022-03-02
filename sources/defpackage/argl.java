package defpackage;

/* renamed from: argl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class argl extends arhi {
    final /* synthetic */ argm a;
    private Object[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public argl(argm argm, arhj arhj) {
        super(arhj);
        this.a = argm;
    }

    public final void a() {
        this.b = this.a.b;
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
        return this.a.b[i].hashCode();
    }

    public final void a(int i) {
        this.a.b = new Object[i];
        super.a(i);
    }

    public final void b() {
        this.b = null;
        super.b();
    }
}
