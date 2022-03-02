package defpackage;

/* renamed from: dpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dpw {
    private final jiq a;
    private long b;

    public dpw(jiq jiq) {
        iva.a((Object) jiq);
        this.a = jiq;
    }

    public final void a() {
        this.b = this.a.b();
    }

    public final void b() {
        this.b = 0;
    }

    public dpw(jiq jiq, long j) {
        iva.a((Object) jiq);
        this.a = jiq;
        this.b = j;
    }

    public final boolean a(long j) {
        return this.b == 0 || this.a.b() - this.b > j;
    }
}
