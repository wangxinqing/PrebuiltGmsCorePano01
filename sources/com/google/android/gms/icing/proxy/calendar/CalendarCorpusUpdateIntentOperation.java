package com.google.android.gms.icing.proxy.calendar;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CalendarCorpusUpdateIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Uri data;
        pnz.d("Received intent: %s", intent);
        if (axsd.c() && intent != null) {
            if ("android.intent.action.PROVIDER_CHANGED".equals(intent.getAction()) && (data = intent.getData()) != null && "content".equalsIgnoreCase(data.getScheme()) && "com.android.calendar".equalsIgnoreCase(data.getAuthority())) {
                pnz.c("Received calendar change notification.");
                if (!((Boolean) ozx.aV.c()).booleanValue()) {
                    return;
                }
                if (!jkr.c() || !((Boolean) ozx.aU.c()).booleanValue()) {
                    ppk.a.a(getApplicationContext(), 1, 1);
                }
            } else if ("com.google.firebase.appindexing.UPDATE_INDEX".equals(intent.getAction())) {
                pnz.c("Received calendar update index notification.");
                if (!((Boolean) ozx.aW.c()).booleanValue()) {
                    pnz.a("CalendarUpdateIndexOperation: skipping because handler is disabled.");
                } else {
                    ppk.a.a(getApplicationContext(), 2, 1);
                }
            } else {
                pnz.e("Unexpected Intent ignored: %s.", intent);
            }
        }
    }
}
