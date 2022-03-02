package defpackage;

/* renamed from: afse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afse implements aoqb {
    private final afsg a;
    private final afkr b;
    private final aflf c;
    private final aojg d;
    private final int e;

    public afse(afsg afsg, afkr afkr, aflf aflf, aojg aojg, int i) {
        this.a = afsg;
        this.b = afkr;
        this.c = aflf;
        this.d = aojg;
        this.e = i;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        afsg afsg = this.a;
        afkr afkr = this.b;
        aflf aflf = this.c;
        aojg aojg = this.d;
        int i = this.e;
        Void voidR = (Void) obj;
        aucd o = aojx.e.o();
        afko afko = afkr.b;
        if (afko == null) {
            afko = afko.g;
        }
        if ((afko.a & 2) != 0) {
            afko afko2 = afkr.b;
            if (afko2 == null) {
                afko2 = afko.g;
            }
            long j = afko2.c / 1000;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojx aojx = (aojx) o.b;
            aojx.a |= 2;
            aojx.c = j;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojx aojx2 = (aojx) o.b;
            aojx2.a |= 2;
            aojx2.c = -1;
        }
        if (!aflf.e) {
            aojx aojx3 = (aojx) o.b;
            aojx3.a |= 4;
            aojx3.d = -1;
            aorr = aopr.a(afsg.a.a(afkr), (amqy) new afsd(o), afsg.d);
        } else {
            aojx aojx4 = (aojx) o.b;
            aojx4.b = aomm.a(3);
            aojx4.a |= 1;
            afko afko3 = afkr.b;
            if (afko3 == null) {
                afko3 = afko.g;
            }
            if ((afko3.a & 4) != 0) {
                afko afko4 = afkr.b;
                if (afko4 == null) {
                    afko4 = afko.g;
                }
                long j2 = afko4.d / 1000;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojx aojx5 = (aojx) o.b;
                aojx5.a |= 4;
                aojx5.d = j2;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojx aojx6 = (aojx) o.b;
                aojx6.a |= 4;
                aojx6.d = -1;
            }
            aorr = aorl.a((Object) (aojx) o.i());
        }
        return aopr.a(aorr, (amqy) new afsf(afsg, aojg, i), afsg.d);
    }
}
