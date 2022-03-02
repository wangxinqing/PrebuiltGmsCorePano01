package com.google.android.gms.contactinteractions.service.operations;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactInteractionsModuleInitIntentOperation extends hec {
    static String[] a = {"com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = 0;
        if ((i & 4) != 0) {
            for (String a2 : a) {
                jhg.a((Context) this, a2, true);
            }
        }
        if (awuj.b()) {
            jpm jpm = new jpm(this);
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentTimeMillis = System.currentTimeMillis();
            long j = jpm.a.getLong("clear_interactions_service_one_off_last_scheduled_timestamp", currentTimeMillis);
            jpm.a.edit().putLong("clear_interactions_service_one_off_last_scheduled_timestamp", currentTimeMillis).apply();
            if (currentTimeMillis - jpm.a(0) >= awuj.a.a().d()) {
                qxf qxf = new qxf();
                qxf.i = "com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService";
                qxf.k = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsOneOffTask";
                qxf.a(2);
                qxf.b(1);
                qxf.n = false;
                qxf.a(0, awuj.a.a().b());
                boolean c = awuj.c();
                if (axcc.b() || awuj.c()) {
                    i2 = 1;
                }
                qxf.a(c ? 1 : 0, i2);
                qxf.a(awuj.a.a().f());
                ContactInteractionsChimeraTaskService.a(this, qxf.b(), 4, currentTimeMillis, uptimeMillis, j);
            }
        }
        if (awuj.d()) {
            ContactInteractionsChimeraTaskService.a((Context) this);
        } else {
            ContactInteractionsChimeraTaskService.b(this);
        }
    }
}
