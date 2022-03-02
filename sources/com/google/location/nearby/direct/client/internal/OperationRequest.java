package com.google.location.nearby.direct.client.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ashf();
    final byte[] a;
    public final asha b;
    public final asgw c;
    public final WorkSource d;
    public final BleFilter[] e;

    public OperationRequest(asha asha, asgw asgw) {
        this(asha, asgw, (WorkSource) null, (BleFilter[]) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        asgw asgw = this.c;
        if (asgw != null) {
            iBinder = asgw.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 2, iBinder);
        ivx.a(parcel, 3, this.d, i, false);
        ivx.a(parcel, 4, (Parcelable[]) this.e, i);
        ivx.b(parcel, a2);
    }

    public OperationRequest(asha asha, asgw asgw, WorkSource workSource, BleFilter[] bleFilterArr) {
        this.b = asha;
        this.a = asha.k();
        this.c = asgw;
        this.d = workSource;
        this.e = bleFilterArr;
    }

    public OperationRequest(byte[] bArr, IBinder iBinder, WorkSource workSource, BleFilter[] bleFilterArr) {
        asgw asgw;
        this.a = bArr;
        try {
            this.b = (asha) aucj.a((aucj) asha.j, bArr);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.direct.client.internal.INearbyDirectCallback");
                if (queryLocalInterface instanceof asgw) {
                    asgw = (asgw) queryLocalInterface;
                } else {
                    asgw = new asgu(iBinder);
                }
            } else {
                asgw = null;
            }
            this.c = asgw;
            this.d = workSource;
            this.e = bleFilterArr;
        } catch (auda e2) {
            throw new IllegalArgumentException("Invalid proto bytes", e2);
        }
    }
}
