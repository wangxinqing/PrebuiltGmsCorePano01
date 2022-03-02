package com.google.android.gms.auth.managed.services;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EmmChimeraService extends nio {
    private static final anax a = anax.a((Object) "android.permission-group.PHONE");

    public EmmChimeraService() {
        super(136, "com.google.android.gms.auth.managed.START_EMM_SERVICE", (Set) a, 0, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        if (!"com.google.android.gms".equals(getServiceRequest.d)) {
            nit.a(16, (Bundle) null);
        } else {
            nit.a(new ghx(this, nix.a()));
        }
    }
}
