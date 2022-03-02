package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Command implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR = new dmw();
    public String a;
    public String b;
    private String c;

    @Deprecated
    public Command() {
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
    }

    @Deprecated
    public Command(Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
    }
}
