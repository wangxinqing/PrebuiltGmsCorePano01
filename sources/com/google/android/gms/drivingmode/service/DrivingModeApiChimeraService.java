package com.google.android.gms.drivingmode.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeApiChimeraService extends nio {
    private nix a;

    public DrivingModeApiChimeraService() {
        super(184, "com.google.android.gms.drivingmode.START_DRIVING_MODE_SERVICE", Collections.emptySet(), 3, 10);
    }

    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        if (this.a == null) {
            this.a = nix.a(this, this.e, this.f);
        }
        if (awqd.d() && awqd.a.a().e()) {
            amrl.a((Object) this.a);
            nit.a(new lxn(this, this.a));
            new lts(this).a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_CLIENT_API_SERVICE_START);
        }
    }
}
