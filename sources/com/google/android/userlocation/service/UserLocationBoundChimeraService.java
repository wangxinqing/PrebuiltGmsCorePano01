package com.google.android.userlocation.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserLocationBoundChimeraService extends nio {
    private final aoru a;

    public UserLocationBoundChimeraService() {
        super(163, "com.google.android.gms.userlocation.service.START", Collections.singleton("android.permission-group.LOCATION"), 1, 10);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        aoru a2 = jfm.a(10);
        this.a = a2;
        if (a2 instanceof jfz) {
            ((jfz) a2).setRejectedExecutionHandler(discardPolicy);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nix nix = new nix(this, this.e, this.f);
        nit.a(new allk(new akvn(2), new akuy(this, getServiceRequest.d), nix, new akhj(getApplicationContext(), new hol(getApplicationContext(), "LE", (String) null), 1, this.a)));
    }
}
