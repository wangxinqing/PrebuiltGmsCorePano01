package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class HelpData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mpz();
    public String a;
    public String b;

    public HelpData(Parcel parcel) {
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

    public HelpData(apkm apkm) {
        this.a = apkm.c;
        this.b = apkm.b;
    }
}
