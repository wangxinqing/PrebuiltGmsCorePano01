package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SetupParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mqd();
    public BillingSignupData a;
    public String b;

    public SetupParams(Parcel parcel) {
        this.a = (BillingSignupData) parcel.readParcelable(BillingSignupData.class.getClassLoader());
        this.b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }

    public SetupParams(apjp apjp) {
        this.a = new BillingSignupData(apjp.b, apjp.c);
        this.b = apjp.d;
    }
}
