package defpackage;

import android.util.Log;

/* renamed from: ltv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ltv implements Runnable {
    private final lty a;

    public ltv(lty lty) {
        this.a = lty;
    }

    public final void run() {
        lty lty = this.a;
        Log.i("CAR.DRIVINGMODE", "Pocket detection timeout. Stopping...");
        lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_POCKET_TIMEOUT);
        lty.a();
    }
}
