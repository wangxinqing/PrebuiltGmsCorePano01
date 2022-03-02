package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContentFilterChangedIntentOperation extends IntentOperation {
    private qjt a;

    static {
        new qfn("ContentFilterChangedIntentOperation");
    }

    public final void onCreate() {
        this.a = qfq.a(this).g;
    }

    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        if (intent != null && "com.google.android.finsky.action.CONTENT_FILTERS_CHANGED".equals(intent.getAction())) {
            this.a.a(avwm.ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE);
        }
    }
}
