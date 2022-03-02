package com.google.android.gms.icing.mdh.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MobileDataHubListenerChimeraService extends nio {
    public final pkn a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MobileDataHubListenerChimeraService() {
        /*
            r3 = this;
            pjc r0 = new pjc
            r0.<init>()
            pbx r1 = defpackage.pbx.a()
            defpackage.awdx.a(r1)
            r0.a = r1
            pkp r1 = r0.a
            java.lang.Class<pkp> r2 = defpackage.pkp.class
            defpackage.awdx.a((java.lang.Object) r1, (java.lang.Class) r2)
            pjg r1 = new pjg
            pkp r0 = r0.a
            r1.<init>(r0)
            r3.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.mdh.service.MobileDataHubListenerChimeraService.<init>():void");
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        if (pbq.a()) {
            nit.a(new pko(this, getServiceRequest.d, nix.a(this, this.e, this.f)));
        } else {
            nit.a(16, (Bundle) null);
        }
    }

    private MobileDataHubListenerChimeraService(pkn pkn) {
        super(164, "com.google.android.mdh.service.listener.START", Collections.emptySet(), 1, 9);
        this.a = pkn;
    }
}
