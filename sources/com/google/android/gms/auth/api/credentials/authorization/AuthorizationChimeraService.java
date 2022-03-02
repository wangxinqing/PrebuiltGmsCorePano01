package com.google.android.gms.auth.api.credentials.authorization;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthorizationChimeraService extends nio {
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nix nix = new nix(this, this.e, this.f);
        new hol(ihs.b(), "IDENTITY_GMSCORE", (String) null);
        String str = getServiceRequest.d;
        Bundle bundle = getServiceRequest.g;
        fru fru = new fru();
        String string = bundle.getString("session_id");
        if (string != null) {
            iva.c(string);
            fru.a = string;
        }
        nit.a(new ezk(this, nix, str, new frv(fru.a)));
    }

    public AuthorizationChimeraService() {
        super(219, "com.google.android.gms.auth.api.identity.service.authorization.START", (Set) anfv.a, 3, 9);
    }
}
