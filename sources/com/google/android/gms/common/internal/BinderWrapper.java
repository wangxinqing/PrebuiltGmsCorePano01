package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new iry();
    public IBinder a;

    public BinderWrapper() {
        this.a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }

    public BinderWrapper(IBinder iBinder) {
        this.a = iBinder;
    }

    public BinderWrapper(Parcel parcel) {
        this.a = null;
        this.a = parcel.readStrongBinder();
    }
}
