package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChimeraPackageMeasurementReceiver extends WakefulBroadcastReceiver implements svl {
    private svm b;

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.b == null) {
            this.b = new svm(this);
        }
        this.b.a(context, intent);
    }

    public final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }
}
