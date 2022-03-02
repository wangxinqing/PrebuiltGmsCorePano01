package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BirthdayData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mpt();
    public int a;
    public int b;

    public BirthdayData() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public BirthdayData(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
}
