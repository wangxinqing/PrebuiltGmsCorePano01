package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UpgradeParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mqe();
    public BillingSignupData a;

    public UpgradeParams(Parcel parcel) {
        this.a = (BillingSignupData) parcel.readParcelable(BillingSignupData.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public UpgradeParams(apjr apjr) {
        this.a = new BillingSignupData(apjr.b, apjr.c);
    }
}
