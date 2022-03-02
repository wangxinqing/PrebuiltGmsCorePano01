package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;

/* renamed from: aajn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aajn extends aajy implements jbh {
    private final osf a;
    private final ozc b;

    public aajn(osf osf, ozc ozc) {
        iva.a((Object) osf);
        this.a = osf;
        this.b = ozc;
    }

    public final void a(aajw aajw) {
        GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response = new GetCurrentExperimentIdsCall$Response();
        getCurrentExperimentIdsCall$Response.b = new int[0];
        getCurrentExperimentIdsCall$Response.a = new Status(8, "API Disabled");
        aajw.a(getCurrentExperimentIdsCall$Response);
    }

    public final void b(aajw aajw) {
        GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response = new GetPendingExperimentIdsCall$Response();
        getPendingExperimentIdsCall$Response.b = new int[0];
        getPendingExperimentIdsCall$Response.a = new Status(8, "API Disabled");
        aajw.a(getPendingExperimentIdsCall$Response);
    }

    public final void c(aajw aajw) {
        SetExperimentIdsCall$Response setExperimentIdsCall$Response = new SetExperimentIdsCall$Response();
        setExperimentIdsCall$Response.a = new Status(8, "API Disabled");
        aajw.a(setExperimentIdsCall$Response);
    }

    public final void a(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, aajw aajw) {
        osf osf = this.a;
        osf.c.d(new aajl(osf, getGlobalSearchSourcesCall$Request, this.b, aajw));
    }

    public final void a(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, aajw aajw) {
        osf osf = this.a;
        osf.c.d(new aajm(osf, setIncludeInGlobalSearchCall$Request, this.b, aajw));
    }
}
