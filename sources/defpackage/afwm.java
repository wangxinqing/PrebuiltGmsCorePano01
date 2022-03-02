package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwm implements aoqb {
    private final afwo a;
    private final afus b;

    public afwm(afwo afwo, afus afus) {
        this.a = afwo;
        this.b = afus;
    }

    public final aorr a(Object obj) {
        afwo afwo = this.a;
        afus afus = this.b;
        aqxl aqxl = (aqxl) obj;
        aqvq aqvq = (aqvq) aqvr.b.o();
        aqwr aqwr = aqxl.a;
        if (aqwr == null) {
            aqwr = aqwr.c;
        }
        aqvq.a(aqwr);
        aqvr aqvr = (aqvr) aqvq.i();
        return aopr.a(afwo.a(afus, aqvr), (amqy) new afwa(aqxl, aqvr), (Executor) aoqm.a);
    }
}
