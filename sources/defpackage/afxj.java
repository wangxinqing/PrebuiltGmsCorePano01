package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxj implements aoqb {
    private final afxl a;
    private final afus b;

    public afxj(afxl afxl, afus afus) {
        this.a = afxl;
        this.b = afus;
    }

    public final aorr a(Object obj) {
        afxl afxl = this.a;
        afus afus = this.b;
        aqxl aqxl = (aqxl) obj;
        aqvq aqvq = (aqvq) aqvr.b.o();
        aqwr aqwr = aqxl.a;
        if (aqwr == null) {
            aqwr = aqwr.c;
        }
        aqvq.a(aqwr);
        aqvr aqvr = (aqvr) aqvq.i();
        return aopr.a(afxl.a(afus, aqvr), (amqy) new afwx(aqxl, aqvr), (Executor) aoqm.a);
    }
}
