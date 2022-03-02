package com.google.android.gms.deviceconnection.service;

import android.content.Context;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DeviceConnectionApiService extends nio {
    private jyl a;

    public DeviceConnectionApiService() {
        super(20, "com.google.android.gms.deviceconnection.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new jyu(this, nix.a(), this.a));
    }

    public final void onCreate() {
        this.a = jyl.a((Context) this);
    }
}
