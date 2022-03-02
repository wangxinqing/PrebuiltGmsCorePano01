package defpackage;

import android.util.Log;

/* renamed from: ailz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ailz implements Runnable {
    private final aimd a;

    public ailz(aimd aimd) {
        this.a = aimd;
    }

    public final void run() {
        aimd aimd = this.a;
        if (!aimd.v.isEmpty()) {
            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                aikq.c("ChreGeofenceHardware", "Waiting for CHRE message timed out.");
            }
            aimd.j.d(154);
        }
    }
}
