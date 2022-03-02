package com.google.android.gms.auth.account.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WorkAccountApiService extends nio {
    private static final iwd a = ehv.a("WorkAccountApiService");
    private esc b;
    private fys k;

    public WorkAccountApiService() {
        super(120, "com.google.android.gms.auth.account.workaccount.START", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        a.b("getting api service", new Object[0]);
        String str = getServiceRequest.d;
        if (jhg.b()) {
            nit.a(this.b);
        } else if (str != null && this.k.a(str)) {
            nit.a(this.b);
        } else {
            a.e("Caller can't manage work accounts %s", str);
            nit.a(13, Bundle.EMPTY);
        }
    }

    public final void onCreate() {
        this.b = new esc(this, this.e);
        this.k = (fys) fys.d.b();
    }
}
