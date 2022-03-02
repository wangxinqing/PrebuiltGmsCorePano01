package defpackage;

/* renamed from: lqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqq {
    public final lqp a;
    public final jzr b;

    public lqq(lqp lqp, jzr jzr) {
        iva.b((lqp == null) != (jzr == null), "Exactly one of groupHeader and metadata must be null");
        this.a = lqp;
        this.b = jzr;
    }

    public final boolean a() {
        return this.a != null;
    }
}
