package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.measurement.internal.b;
import com.google.android.gms.ads.measurement.internal.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GmpMeasurementReporterCreatorImpl extends b {
    public IBinder newGmpMeasurementReporter(mby mby) {
        c asInterface = b.asInterface((IBinder) dkb.a((Context) mbz.a(mby)).a("com.google.android.gms.ads.measurement.ChimeraGmpMeasurementReporterCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newGmpMeasurementReporter(mby);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.c.a("Failed to create using dynamite package", e);
            }
        }
        com.google.android.gms.ads.internal.util.client.c.a("Chimera is not available.");
        return null;
    }
}
