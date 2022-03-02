package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CustomSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new dzk();
    private final int[] a;

    public CustomSectionInfo(Parcel parcel) {
        super(parcel);
        this.a = parcel.createIntArray();
    }

    public final dyj a(dxx dxx, int i) {
        return new dyk(dxx, this.a, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeIntArray(this.a);
    }

    public CustomSectionInfo(int[] iArr) {
        this.a = iArr;
    }
}
