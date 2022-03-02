package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxi implements aoqb {
    private final afxl a;
    private final afus b;

    public afxi(afxl afxl, afus afus) {
        this.a = afxl;
        this.b = afus;
    }

    public final aorr a(Object obj) {
        aqvr aqvr = (aqvr) obj;
        return aopr.a(this.a.a(this.b, aqvr), (amqy) new afwy(aqvr), (Executor) aoqm.a);
    }
}
