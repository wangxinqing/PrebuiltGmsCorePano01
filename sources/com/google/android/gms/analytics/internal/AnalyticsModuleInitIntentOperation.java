package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.service.ChimeraPlayLogMonitorIntervalService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AnalyticsModuleInitIntentOperation extends hec {
    public static final String[] a = {"com.google.android.gms.analytics.AnalyticsTaskService", "com.google.android.gms.analytics.service.AnalyticsService"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 8;
        int i3 = i & 2;
        if ((i & 4) != 0 || i2 != 0 || i3 != 0) {
            for (String a2 : a) {
                jhg.a((Context) this, a2, true);
            }
            ChimeraPlayLogMonitorIntervalService.a(this);
        }
    }
}
