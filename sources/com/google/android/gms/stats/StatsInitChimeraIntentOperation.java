package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.stats.eastworld.EastworldAlarmOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StatsInitChimeraIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 4;
        int i3 = i & 8;
        int i4 = i & 2;
        if (!(i2 == 0 && i3 == 0)) {
            PlatformStatsCollectorChimeraService.a((Context) this);
        }
        if (i2 != 0 || i3 != 0 || i4 != 0) {
            Intent startIntent = IntentOperation.getStartIntent((Context) this, EastworldAlarmOperation.class, "com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM");
            startIntent.putExtra("extra_for_init_intent", true);
            startService(startIntent);
            if (azmv.b()) {
                acsi.a();
            }
        }
    }
}
