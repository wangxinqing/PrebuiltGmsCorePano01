package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MeasurementModuleInitIntentOperation extends hec {
    private static final String[] a = {"com.google.android.gms.measurement.PackageMeasurementTaskService", "com.google.android.gms.measurement.PackageMeasurementReceiver"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 8;
        int i3 = i & 2;
        if ((i & 4) != 0 || i2 != 0 || i3 != 0) {
            for (String a2 : a) {
                jhg.a((Context) this, a2, true);
            }
            sze a3 = sze.a((Context) this);
            a3.F().a((Runnable) new sum(a3));
        }
    }
}
