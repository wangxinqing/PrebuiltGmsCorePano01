package com.google.android.gms.gcm.gmsproc;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsAutoStarter extends IntentOperation {
    public static void a(Context context, Intent intent) {
        nqw.a(context);
        String action = intent.getAction();
        if ("com.google.android.checkin.CHECKIN_COMPLETE".equals(action) && !intent.getBooleanExtra("success", true)) {
            return;
        }
        if ("com.google.android.gms.gcm.REGISTERED".equals(action)) {
            nvv a = nvv.a(context);
            nvv.a(nsm.b(a.a));
            a.a();
            return;
        }
        nvu.a(context, qwq.a(context));
        nvv.a(context).a();
    }

    public final void onHandleIntent(Intent intent) {
        a(this, intent);
    }
}
