package com.google.android.gms.analytics.internal;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraPlayLogReportingService extends TracingIntentService {
    public ChimeraPlayLogReportingService() {
        super("PlayLogReportingService");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        dpq.a(this).a();
    }
}
