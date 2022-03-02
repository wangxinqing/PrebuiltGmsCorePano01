package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeriodicTasksManager$GassModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        jhg.a((Context) this, "com.google.android.gms.gass.GassService", true);
        new Object[1][0] = intent.getAction();
        if (!nov.a || !nov.b || !nov.c) {
            if (!nov.a) {
                nov.a(getBaseContext());
                nov.a = true;
            }
            if (!nov.b) {
                nov.b(getBaseContext());
                nov.b = true;
            }
            if (!nov.c) {
                nov.c(getBaseContext());
                nov.c = true;
            }
        }
    }
}
