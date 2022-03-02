package com.google.android.gms.gass;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeriodicTasksManager$GassFlagsUpdateIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            if (!nov.d.equals(Long.valueOf(axja.c())) || nov.e != axja.d() || !nov.f.equals(Long.valueOf(axja.b()))) {
                nov.a(getBaseContext());
            }
            if (!nov.g.equals(Long.valueOf(axjg.d())) || nov.h != axjg.f() || !nov.i.equals(Long.valueOf(axjg.b()))) {
                nov.b(getBaseContext());
            }
            if (!nov.j.equals(Long.valueOf(axjj.d())) || nov.k != axjj.e() || !nov.m.equals(Long.valueOf(axjj.c())) || nov.l != axjj.f()) {
                nov.c(getBaseContext());
            }
        }
    }
}
