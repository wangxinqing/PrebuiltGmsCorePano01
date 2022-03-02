package com.google.android.gms.googlehelp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeFlagChangeListener extends IntentOperation {
    static final String a = jkq.a("com.google.android.gms.googlehelp");

    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) {
                if (intent.getExtras() != null) {
                    str = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && TextUtils.equals("com.google.android.gms.googlehelp", str)) {
                    if (axnl.b()) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("prefetch_offline_content_retries_left_key", (int) axmj.u());
                        ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, bundle, 3);
                        return;
                    }
                    qwq.a((Context) this).a("action_prefetch_offline_help_content", "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService");
                }
            }
        }
    }
}
