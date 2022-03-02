package com.google.android.gms.dynamiclinks.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DynamicLinksApiChimeraService extends nio {
    public DynamicLinksApiChimeraService() {
        super(131, "com.google.firebase.dynamiclinks.service.START", (Set) new HashSet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new mci(this, nix.a(), getServiceRequest.d, getServiceRequest.c));
    }
}
