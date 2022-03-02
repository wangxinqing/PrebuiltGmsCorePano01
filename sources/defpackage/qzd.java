package defpackage;

/* renamed from: qzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qzd implements amqy {
    private final qzs a;
    private final afyl b;
    private final Exception c;
    private final int d;

    public qzd(qzs qzs, afyl afyl, Exception exc, int i) {
        this.a = qzs;
        this.b = afyl;
        this.c = exc;
        this.d = i;
    }

    public final Object a(Object obj) {
        int i;
        qzs qzs = this.a;
        afyl afyl = this.b;
        Exception exc = this.c;
        int i2 = this.d;
        Void voidR = (Void) obj;
        if (qzs.c == null) {
            return null;
        }
        afyp d2 = afyl.d();
        if (!(exc instanceof afuj)) {
            i = !(exc instanceof afug) ? 5 : 4;
        } else {
            i = 3;
        }
        if (rbk.c()) {
            qzs.c.a(d2, i, i2, rbl.a(exc), false);
            return null;
        }
        qzs.c.a(d2, i, rbl.a(exc));
        return null;
    }
}
