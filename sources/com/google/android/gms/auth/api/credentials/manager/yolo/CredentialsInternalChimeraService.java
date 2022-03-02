package com.google.android.gms.auth.api.credentials.manager.yolo;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CredentialsInternalChimeraService extends nio {
    public static final iwd a = ehv.b("CredentialsInternalChimeraService");

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        Bundle bundle = getServiceRequest.g;
        nit.a(new fnh(this, bundle != null ? bundle.getString("log_session_id") : null));
    }

    public CredentialsInternalChimeraService() {
        super(179, "com.google.android.gms.auth.api.credentials.internal_service.START", (Set) anfv.a, 0, 9);
    }
}
