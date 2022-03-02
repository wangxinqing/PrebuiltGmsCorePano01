package com.google.android.gms.fonts.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FontsModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        boolean z;
        boolean z2;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ngz.c("FontsModuleInitOp", "onInitRuntimeState(module update? %s container update? %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
        nhz nhz = nhz.a;
        Context applicationContext = getApplicationContext();
        nhz.a(applicationContext, new nhq());
        if (nhz.l) {
            nib.a(nhz, applicationContext);
        }
        jhg.a((Context) this, "com.google.android.gms.fonts.provider.FontsProvider", true);
        try {
            jhg.a((Context) this, "com.google.android.gms.fonts.update.UpdateSchedulerService", true);
        } catch (Exception e) {
            ngz.a("FontsModuleInitOp", (Throwable) e, "Unable to enable update scheduler", new Object[0]);
            nhz.a(applicationContext).a(9, 23505, "com.google.android.gms.fonts.service");
        }
    }
}
