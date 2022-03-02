package defpackage;

/* renamed from: oxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxc {
    public final String a;
    public final aolv b;
    final aonk c;
    final anax d;
    private final int e;
    private final int f;

    public oxc(String str, int i, aonk aonk, aolv aolv, int i2, anax anax) {
        this.a = str;
        this.e = i;
        this.c = aonk;
        this.b = aolv;
        this.f = i2;
        this.d = anax;
    }

    public final String a() {
        return this.c.name();
    }

    public final void a(oyq oyq, aolx aolx) {
        oyq.a(this.a, this.e, this.b, aolx, this.f, this.d);
    }
}
