package com.google.android.location.fused;

import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FusedLocationServiceHelper$AlarmListener extends jgw {
    final /* synthetic */ aiei b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FusedLocationServiceHelper$AlarmListener(aiei aiei) {
        super("location");
        this.b = aiei;
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (aidd aidd : this.b.j.c()) {
            if (500 + elapsedRealtime >= aidd.c.b.e) {
                aidd.c();
            }
        }
    }
}
