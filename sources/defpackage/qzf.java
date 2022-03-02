package defpackage;

/* renamed from: qzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qzf implements amqy {
    private final qzs a;
    private final afyl b;
    private final Exception c;

    public qzf(qzs qzs, afyl afyl, Exception exc) {
        this.a = qzs;
        this.b = afyl;
        this.c = exc;
    }

    public final Object a(Object obj) {
        int i;
        qzs qzs = this.a;
        afyl afyl = this.b;
        Exception exc = this.c;
        Void voidR = (Void) obj;
        if (qzs.c == null) {
            return null;
        }
        afyp d = afyl.d();
        if (!(exc instanceof afuj)) {
            i = !(exc instanceof afug) ? 5 : 4;
        } else {
            i = 3;
        }
        qzs.c.a(d, i, rbl.a(exc));
        return null;
    }
}
