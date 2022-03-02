package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationHistorianDataRetriever$LogDataReceiver extends nla {
    public ajhc a;
    public aoru b = new jfz(1, 10);

    public LocationHistorianDataRetriever$LogDataReceiver() {
        super("location");
    }

    public final void a(Context context, Intent intent) {
        if (this.b != null) {
            this.b.execute(new ajhd(this, context, intent));
            return;
        }
        ajix.c("GCoreUlr", "LogReceiptExecutor is null");
    }
}
