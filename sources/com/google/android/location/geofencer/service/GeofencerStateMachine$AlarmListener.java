package com.google.android.location.geofencer.service;

import android.os.Handler;
import android.os.SystemClock;
import android.os.WorkSource;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GeofencerStateMachine$AlarmListener extends jgw {
    final /* synthetic */ aing b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeofencerStateMachine$AlarmListener(aing aing) {
        super("location");
        this.b = aing;
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ainc ainc = (ainc) this.b.r.pollFirst();
        if (ainc != null) {
            aing aing = this.b;
            aing.p = elapsedRealtime;
            aing.a(ainc.b, ainc.a);
        }
        if (!this.b.r.isEmpty()) {
            long j = this.b.p;
            long b2 = aycd.b();
            aing aing2 = this.b;
            aing2.o.a("GeofencerStateMachine", 2, j + b2, (jgw) this, (Handler) aing2.K, (WorkSource) null);
        }
    }
}
