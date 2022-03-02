package com.google.android.gms.fonts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FontsChimeraService extends nio {
    public FontsChimeraService() {
        super(132, "com.google.android.gms.fonts.service.START", Collections.emptySet(), 3, 10);
        ngz.c("FontsChimeraService", "ctor", new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        ngz.c("FontsChimeraService", "onGetService (from %s)", str);
        nit.a(new nhr(this, nix.a(), str));
    }

    public final void onCreate() {
        ngz.c("FontsChimeraService", "onCreate::begin", new Object[0]);
        nhz.a.a(getApplicationContext(), new nhq());
        ngz.b("FontsChimeraService", "onCreate::success", new Object[0]);
    }
}
