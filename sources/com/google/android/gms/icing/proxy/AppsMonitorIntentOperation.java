package com.google.android.gms.icing.proxy;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppsMonitorIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        try {
            plt a = plt.a((Context) this);
            if (a != null) {
                if (!(intent == null || intent.getAction() == null)) {
                    poi.a().a(poi.a("AppsCorpusProcessChangeRunnable", new plr(a, intent)));
                }
            }
        } catch (Exception e) {
            pnz.a((Throwable) e, "Failed to handle package changes", new Object[0]);
        }
        startService(UpdateIcingCorporaIntentOperation.b(this));
    }
}
