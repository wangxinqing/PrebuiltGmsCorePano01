package com.google.android.gms.identity.accounts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AccountDataApiService extends nio {
    private static final pyk a = new pyj();
    private final pyk b;

    public AccountDataApiService() {
        this(a);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(this.b.a(this));
    }

    public AccountDataApiService(pyk pyk) {
        super(9, "com.google.android.gms.accounts.ACCOUNT_SERVICE", Collections.emptySet(), 1, 10);
        this.b = pyk;
    }
}
