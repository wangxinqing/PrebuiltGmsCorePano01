package com.google.android.gms.phenotype.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeChimeraService extends nio {
    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public PhenotypeChimeraService() {
        super(new int[]{51}, new String[]{"com.google.android.gms.phenotype.service.START"}, Collections.emptySet(), 3, jfb.a((int) ayxs.a.a().a(), 9), (Map) null);
        this.d = Collections.singletonList(ygt.a);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new ygs(new nix(this, this.e, this.f), getServiceRequest.d));
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }
}
