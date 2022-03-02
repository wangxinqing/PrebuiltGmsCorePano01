package com.google.android.gms.scheduler;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SchedulerChimeraBoundService extends nio {
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new aabc(new nix(this, this.e, this.f)));
    }

    public SchedulerChimeraBoundService() {
        super(218, "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE", (Set) anfv.a, 0, 10);
    }
}
