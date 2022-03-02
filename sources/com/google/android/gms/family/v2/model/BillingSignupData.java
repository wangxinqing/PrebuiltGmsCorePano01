package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BillingSignupData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mps();
    public String a;
    public String b;

    public BillingSignupData(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public BillingSignupData(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
