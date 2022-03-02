package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReplaySignal implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rit();
    private final Class a;
    private final Parcelable b;
    private final long c;

    public ReplaySignal(Parcelable parcelable, long j, Class cls) {
        this.b = parcelable;
        this.c = j;
        this.a = cls;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeLong(this.c);
    }
}
