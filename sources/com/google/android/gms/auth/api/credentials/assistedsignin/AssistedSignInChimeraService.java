package com.google.android.gms.auth.api.credentials.assistedsignin;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AssistedSignInChimeraService extends nio {
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        amri a = hiq.a(this, getServiceRequest.d);
        if (!a.a()) {
            nit.a(10, (Bundle) null);
            return;
        }
        nix nix = new nix(this, this.e, this.f);
        hol hol = new hol(ihs.b(), "IDENTITY_GMSCORE", (String) null);
        String str = (String) a.b();
        String str2 = getServiceRequest.d;
        Bundle bundle = getServiceRequest.g;
        fst fst = new fst();
        String string = bundle.getString("session_id");
        if (string != null) {
            iva.c(string);
            fst.a = string;
        }
        nit.a(new evn(this, nix, hol, str2, new fsu(fst.a)));
    }

    public AssistedSignInChimeraService() {
        super(212, "com.google.android.gms.auth.api.identity.service.signin.START", (Set) anfv.a, 3, 9);
    }
}
