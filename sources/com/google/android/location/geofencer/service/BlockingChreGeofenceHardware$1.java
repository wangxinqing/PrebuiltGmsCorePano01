package com.google.android.location.geofencer.service;

import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BlockingChreGeofenceHardware$1 extends jgw {
    final /* synthetic */ aimd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockingChreGeofenceHardware$1(aimd aimd, String str) {
        super(str);
        this.b = aimd;
    }

    public final void a() {
        if (!this.b.v.isEmpty()) {
            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                aikq.c("ChreGeofenceHardware", "Waiting for CHRE message timed out.");
            }
            this.b.j.d(154);
        }
    }
}
