package defpackage;

/* renamed from: cy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cy implements vo {
    private final int a;
    private final vo b;

    public cy(int i, vo voVar) {
        this.a = i;
        this.b = voVar;
    }

    public final void a(int i, int i2) {
        this.b.a(i + this.a, i2);
    }

    public final void b(int i, int i2) {
        this.b.b(i + this.a, i2);
    }

    public final void c(int i, int i2) {
        vo voVar = this.b;
        int i3 = this.a;
        voVar.c(i + i3, i2 + i3);
    }

    public final void a(int i, int i2, Object obj) {
        this.b.a(i + this.a, i2, obj);
    }
}
