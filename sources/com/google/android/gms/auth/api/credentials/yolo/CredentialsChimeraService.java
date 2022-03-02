package com.google.android.gms.auth.api.credentials.yolo;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CredentialsChimeraService extends nio {
    public static final iwd a = ehv.b("CredentialsChimeraService");

    public CredentialsChimeraService() {
        super(68, "com.google.android.gms.auth.api.credentials.service.START", Collections.singleton("android.permission-group.PHONE"), 3, 9);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        esn esn;
        esn a2 = esn.a(getServiceRequest.g);
        String str = a2.b;
        if (amrk.a(str)) {
            str = getServiceRequest.d;
            esm esm = new esm(a2);
            esm.a = str;
            esn = esm.a();
        } else {
            esn = a2;
        }
        if (!str.equals(getServiceRequest.d)) {
            hya.a((Context) this).a(getServiceRequest.d);
        }
        amri a3 = hiq.a(this, str);
        if (!a3.a()) {
            nit.a(10, (Bundle) null);
            return;
        }
        nit.a(new fot(this, (String) a3.b(), esn, new nix(this, this.e, this.f), fgm.a()));
    }
}
