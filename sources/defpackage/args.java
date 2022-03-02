package defpackage;

/* renamed from: args  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class args extends arhj {
    final /* synthetic */ argt a;
    private Object[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public args(argt argt, arhj arhj) {
        super(arhj);
        this.a = argt;
    }

    public final void a() {
        this.b = this.a.b;
        super.a();
    }

    public final void b() {
        this.b = null;
        super.b();
    }

    public final void a(int i) {
        this.a.b = new Object[i];
        super.a(i);
    }

    public final void b(int i) {
        this.a.b[i] = null;
    }

    public final void a(int i, int i2) {
        this.a.b[i2] = this.b[i];
        super.a(i, i2);
    }
}
