package defpackage;

/* renamed from: argh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class argh extends arhj {
    final /* synthetic */ argi a;
    private Object[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public argh(argi argi) {
        super((arhj) null);
        this.a = argi;
    }

    public final void a() {
        this.b = this.a.a;
        super.a();
    }

    public final void b() {
        this.b = null;
        super.b();
    }

    public final void a(int i) {
        this.a.a = new Object[i];
        super.a(i);
    }

    public final void b(int i) {
        this.a.a[i] = null;
    }

    public final void a(int i, int i2) {
        this.a.a[i2] = this.b[i];
        super.a(i, i2);
    }
}
