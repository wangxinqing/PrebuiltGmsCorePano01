package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfn();
    public int a;
    public DeviceOrientationRequestInternal b;
    public rdz c;
    public rge d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        rdz rdz;
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        rge rge = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            rdz = queryLocalInterface instanceof rdz ? (rdz) queryLocalInterface : new rdx(iBinder);
        } else {
            rdz = null;
        }
        this.c = rdz;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof rge) {
                rge = (rge) queryLocalInterface2;
            } else {
                rge = new rgc(iBinder2);
            }
        }
        this.d = rge;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        rdz rdz = this.c;
        IBinder iBinder2 = null;
        if (rdz != null) {
            iBinder = rdz.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 3, iBinder);
        rge rge = this.d;
        if (rge != null) {
            iBinder2 = rge.asBinder();
        }
        ivx.a(parcel, 4, iBinder2);
        ivx.b(parcel, a2);
    }
}
