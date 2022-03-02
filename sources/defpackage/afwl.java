package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afwl implements aoqb {
    private final afwo a;
    private final afus b;

    public afwl(afwo afwo, afus afus) {
        this.a = afwo;
        this.b = afus;
    }

    public final aorr a(Object obj) {
        aqvr aqvr = (aqvr) obj;
        return aopr.a(this.a.a(this.b, aqvr), (amqy) new afwb(aqvr), (Executor) aoqm.a);
    }
}
