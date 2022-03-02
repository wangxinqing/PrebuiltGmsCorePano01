package com.google.android.gms.ads.jams;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.util.client.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SystemEventIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class OnBootIntentOperation extends hec {
        /* access modifiers changed from: protected */
        public final void a(Intent intent, int i) {
            c.a("[JAMS] Boot completed");
            if (new d(ihs.b()).c()) {
                a.c();
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        d dVar = new d(ihs.b());
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            c.a("[JAMS] Accounts changed");
            if (dVar.c()) {
                a.c();
            }
        } else if ("com.google.android.checkin.CHECKIN_COMPLETE".equals(intent.getAction())) {
            c.a("[JAMS] Gservices updated");
            boolean c = dVar.c();
            boolean f = awhl.a.a().f();
            boolean j = awhl.a.a().j();
            dVar.a.edit().putBoolean("negotiation_enabled", f).apply();
            dVar.a.edit().putBoolean("non_default_account_enabled", j).apply();
            if (c && !f) {
                c.a("[JAMS] Negotiation disabled");
                qwq.a((Context) ihs.b()).a("jams-negotiation-task", "com.google.android.gms.ads.jams.NegotiationService");
            } else if (!c && f) {
                c.a("[JAMS] Negotiation enabled");
                a.c();
            }
        }
    }
}
