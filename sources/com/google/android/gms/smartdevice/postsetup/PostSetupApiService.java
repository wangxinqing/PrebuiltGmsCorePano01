package com.google.android.gms.smartdevice.postsetup;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PostSetupApiService extends nio {
    private acgo a;

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        acpo acpo = new acpo(this);
        if (this.a == null) {
            this.a = new acgo(this.e, this, str, acpo.b(str));
        }
        nit.a(this.a);
    }

    public PostSetupApiService() {
        super(190, "com.google.android.gms.smartdevice.postsetup.PostSetupService.START", (Set) anfv.a, 3, 10);
    }
}
