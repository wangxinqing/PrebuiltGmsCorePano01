package com.google.android.gms.feedback;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FeedbackBoundService extends nio {
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new mvr(this, new nix(this, this.e, this.f), getServiceRequest.d));
    }

    public FeedbackBoundService() {
        super(29, "com.google.android.gms.feedback.internal.IFeedbackService", (Set) anfv.a, 2, 10);
    }
}
