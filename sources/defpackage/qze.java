package defpackage;

/* renamed from: qze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qze implements amqy {
    private final qzs a;
    private final afup b;
    private final afyl c;
    private final int d;

    public qze(qzs qzs, afup afup, afyl afyl, int i) {
        this.a = qzs;
        this.b = afup;
        this.c = afyl;
        this.d = i;
    }

    public final Object a(Object obj) {
        int i;
        qzs qzs = this.a;
        afup afup = this.b;
        afyl afyl = this.c;
        int i2 = this.d;
        Void voidR = (Void) obj;
        if (qzs.c == null) {
            return null;
        }
        if (!afup.b) {
            i = 2;
        } else {
            i = 6;
        }
        if (rbk.c()) {
            qzs.c.a(afyl.d(), i, i2, aftx.a(auoj.SUCCESS), afup.c);
            return null;
        }
        qzs.c.a(afyl.d(), i, aftx.a(auoj.SUCCESS));
        return null;
    }
}
