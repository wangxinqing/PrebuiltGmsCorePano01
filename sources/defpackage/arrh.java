package defpackage;

/* renamed from: arrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arrh extends arhi {
    final /* synthetic */ arri a;
    private short[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arrh(arri arri, arhj arhj) {
        super(arhj);
        this.a = arri;
    }

    public final void a() {
        this.b = this.a.a;
        super.a();
    }

    public final int b(int i) {
        int a2 = this.a.a(this.b[i]);
        if (a2 < 0) {
            a2 ^= -1;
        }
        super.a(i, a2);
        return a2;
    }

    public final int c(int i) {
        return this.a.a[i];
    }

    public final void a(int i) {
        this.a.a = new short[i];
        super.a(i);
    }

    public final void b() {
        this.b = null;
        super.b();
    }
}
