package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsageReportingIntentChimeraService extends TracingIntentService {
    public UsageReportingIntentChimeraService() {
        super("UsageReportingIntentService");
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        try {
            acws.a(adrz.b(this).a(new UsageReportingOptInOptions(i)), aztq.a.a().a(), TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.usagereporting.OPTIN_UR".equals(action)) {
            a(1);
        } else if ("com.google.android.gms.usagereporting.OPTOUT_UR".equals(action)) {
            a(2);
        }
    }
}
