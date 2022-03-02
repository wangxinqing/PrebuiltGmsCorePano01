package com.google.android.gms.clearcut.bootcount;

import android.content.Intent;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BootCountChimeraService extends nio {
    public BootCountChimeraService() {
        super(124, "com.google.android.gms.clearcut.bootcount.service.START", Collections.emptySet(), 2, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new hpl(this));
    }

    public final boolean onUnbind(Intent intent) {
        return true;
    }
}
