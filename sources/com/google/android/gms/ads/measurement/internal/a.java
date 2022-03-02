package com.google.android.gms.ads.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a extends bhv implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
    }

    public final IBinder newGmpMeasurementReporter(mby mby) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        Parcel a = a(1, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
