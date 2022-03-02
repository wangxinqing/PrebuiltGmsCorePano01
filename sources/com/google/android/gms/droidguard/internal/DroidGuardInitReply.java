package com.google.android.gms.droidguard.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DroidGuardInitReply implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lzp();
    public final ParcelFileDescriptor a;
    public final Parcelable b;

    public DroidGuardInitReply(ParcelFileDescriptor parcelFileDescriptor, Parcelable parcelable) {
        this.a = parcelFileDescriptor;
        this.b = parcelable;
    }

    public final int describeContents() {
        int i = 0;
        int i2 = this.a != null ? 1 : 0;
        Parcelable parcelable = this.b;
        if (parcelable != null) {
            i = parcelable.describeContents();
        }
        return i2 | i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
