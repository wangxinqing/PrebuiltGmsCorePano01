package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afvt implements aoqb {
    private final afwo a;
    private final afus b;

    public afvt(afwo afwo, afus afus) {
        this.a = afwo;
        this.b = afus;
    }

    public final aorr a(Object obj) {
        afwo afwo = this.a;
        afus afus = this.b;
        aqxj aqxj = (aqxj) obj;
        aqvq aqvq = (aqvq) aqvr.b.o();
        aqwr aqwr = aqxj.c;
        if (aqwr == null) {
            aqwr = aqwr.c;
        }
        aqvq.a(aqwr);
        aqvr aqvr = (aqvr) aqvq.i();
        return aopr.a(afwo.a(afus, aqvr), (amqy) new afvz(aqxj, aqvr), (Executor) aoqm.a);
    }
}
