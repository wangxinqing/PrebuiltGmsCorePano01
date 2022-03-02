package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppMeasurementReceiver extends ks implements svl {
    private svm a;

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new svm(this);
        }
        this.a.a(context, intent);
    }

    public final void a(Context context, Intent intent) {
        ks.k(context, intent);
    }
}
