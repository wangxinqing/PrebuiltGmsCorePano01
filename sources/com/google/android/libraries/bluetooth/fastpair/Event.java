package com.google.android.libraries.bluetooth.fastpair;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Event implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aegj();

    public static aegk f() {
        return new aegk();
    }

    public abstract aspb a();

    public abstract long b();

    public abstract Short c();

    public abstract BluetoothDevice d();

    public final int describeContents() {
        return 0;
    }

    public abstract Exception e();

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a().L);
        parcel.writeLong(b());
        parcel.writeValue(c());
        parcel.writeParcelable(d(), 0);
        parcel.writeSerializable(e());
    }
}
