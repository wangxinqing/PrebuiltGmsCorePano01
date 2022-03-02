package com.google.android.gms.gcm.nts;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PendingCallback implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new nxr();
    final IBinder a;

    public PendingCallback(IBinder iBinder) {
        this.a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }

    public PendingCallback(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }
}
