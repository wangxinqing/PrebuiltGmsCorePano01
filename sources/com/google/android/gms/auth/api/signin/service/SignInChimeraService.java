package com.google.android.gms.auth.api.signin.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInChimeraService extends nio {
    public static final iwd a = new iwd("Auth.Api.SignIn", "Service", "SignInChimeraService");
    public static final anaf b;

    static {
        anab h = anaf.h();
        h.a(fxb.class, qbk.AUTH_API_SIGNIN_SILENT_SIGNIN);
        h.a(fwz.class, qbk.AUTH_API_SIGNIN_SIGN_OUT);
        h.a(fwy.class, qbk.AUTH_API_SIGNIN_REVOKE_ACCESS);
        b = h.a();
    }

    public SignInChimeraService() {
        super(91, "com.google.android.gms.auth.api.signin.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nix nix = new nix(this, this.e, this.f);
        fxe fxe = new fxe(this, getServiceRequest.d, getServiceRequest.f, abah.a(getServiceRequest.g).a(), nix, new hol(this, "IDENTITY_GMSCORE", (String) null));
        if (azgq.b()) {
            fxe.getClass();
            qbq.a(nix, (amry) new fxd(fxe));
        }
        nit.a(fxe);
    }
}
