package com.google.android.gms.auth.api.credentials.manager.gis;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IdentityGisInternalChimeraService extends nio {
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        fsh a = fsi.a();
        Bundle bundle = getServiceRequest.g;
        iva.a((Object) bundle);
        a.a = bundle.getString("session_id");
        nit.a(new fho(this, a.a()));
    }

    public IdentityGisInternalChimeraService() {
        super(213, "com.google.android.gms.auth.api.identity.service.gis_internal.START", (Set) anfv.a, 0, 9);
    }
}
