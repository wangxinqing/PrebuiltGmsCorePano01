package com.google.android.location.collectionlib.utils;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableSensorScannerConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ahwj();
    public final ahuu a;

    public ParcelableSensorScannerConfig(ahuu ahuu) {
        this.a = ahuu;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a);
        parcel.writeLong(this.a.b);
        parcel.writeLong(this.a.c);
        parcel.writeLong(this.a.e);
    }

    public ParcelableSensorScannerConfig(Parcel parcel) {
        this.a = new ahuu(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong());
    }
}
