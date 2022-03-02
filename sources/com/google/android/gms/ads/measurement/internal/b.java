package com.google.android.gms.ads.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class b extends bhw implements c {
    public b() {
        super("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new a(iBinder);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        mby mby;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby = null;
        }
        IBinder newGmpMeasurementReporter = newGmpMeasurementReporter(mby);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newGmpMeasurementReporter);
        return true;
    }
}
