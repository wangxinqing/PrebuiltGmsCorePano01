package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class SectionInfo implements ReflectedParcelable {
    public boolean p;

    public SectionInfo() {
    }

    public abstract dyj a(dxx dxx, int i);

    public dyj b(dxx dxx, int i) {
        return a(dxx, i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p ? 1 : 0);
    }

    public SectionInfo(Parcel parcel) {
        this.p = parcel.readInt() != 0;
    }
}
