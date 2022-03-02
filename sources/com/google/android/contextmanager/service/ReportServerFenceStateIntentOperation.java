package com.google.android.contextmanager.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReportServerFenceStateIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() == 0) {
            new String("Action: ");
        } else {
            "Action: ".concat(valueOf);
        }
        if ("com.google.android.contextmanager.REPORT_SERVER_FENCE_STATE".equals(action)) {
            byd E = cbi.E();
            if (!intent.hasExtra("client_info_package_name") || !intent.hasExtra("client_info_account_name") || !intent.hasExtra("client_info_module_id") || !intent.hasExtra("context_fence_key")) {
                ((anih) ((anih) bxk.a.b()).a("byd", "a", 617, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceManager] Server fence state reporting intent is not valid.");
                return;
            }
            String a = bzm.a(intent.getStringExtra("client_info_package_name"), intent.getStringExtra("client_info_account_name"), intent.getStringExtra("client_info_module_id"), intent.getStringExtra("context_fence_key"));
            bwc a2 = E.b.a(a);
            if (a2 != null) {
                bsz g = a2.g();
                if (g != null) {
                    bzm b = E.b.b(a);
                    if (b != null) {
                        new ckk(g, b).a();
                    } else {
                        new Object[1][0] = a;
                    }
                } else {
                    new Object[1][0] = a;
                }
            } else {
                new Object[1][0] = a;
            }
        } else {
            new Object[1][0] = action;
        }
    }
}
