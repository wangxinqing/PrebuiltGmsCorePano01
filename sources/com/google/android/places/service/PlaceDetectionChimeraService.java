package com.google.android.places.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceDetectionChimeraService extends nio {
    private final aoru a;

    public PlaceDetectionChimeraService() {
        super(67, "com.google.android.gms.location.places.PlaceDetectionApi", Collections.singleton("android.permission-group.LOCATION"), 3, 10);
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
        nit.a(new akvm(new akvn(2), new akuy(this, getServiceRequest.d), nix, new akhj(getApplicationContext(), new hol(getApplicationContext(), "LE", (String) null), 1, this.a)));
    }

    public final void onDestroy() {
        this.a.shutdown();
    }
}
