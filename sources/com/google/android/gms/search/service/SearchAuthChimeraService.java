package com.google.android.gms.search.service;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchAuthChimeraService extends nio {
    public SearchAuthChimeraService() {
        super(73, "com.google.android.gms.search.service.SEARCH_AUTH_START", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nix.a();
        Binder.getCallingUid();
        nit.a(new aamo());
    }
}
