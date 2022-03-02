package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class c extends bhw implements d {
    public c() {
        super("com.google.android.gms.ads.measurement.service.IGmpConversionTrackingService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Bundle) bhx.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
