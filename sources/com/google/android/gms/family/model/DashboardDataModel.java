package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DashboardDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mhj();
    public final PageDataMap a;
    public final boolean b;
    public final apix c;
    public final ViewerDataModel d;
    public final PageData e;
    public final boolean f;

    public DashboardDataModel(Parcel parcel) {
        boolean z;
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        apix a2 = apix.a(parcel.readInt());
        this.c = a2 == null ? apix.UNKNOWN_FAMILY_ROLE : a2;
        this.a = (PageDataMap) parcel.readParcelable(PageDataMap.class.getClassLoader());
        this.d = (ViewerDataModel) parcel.readParcelable(ViewerDataModel.class.getClassLoader());
        if (parcel.readInt() == 1) {
            this.e = (PageData) parcel.readParcelable(PageData.class.getClassLoader());
        } else {
            this.e = null;
        }
        this.f = parcel.readInt() == 1 ? true : z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c.g);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.d, i);
        if (this.e != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        PageData pageData = this.e;
        if (pageData != null) {
            parcel.writeParcelable(pageData, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
    }

    public DashboardDataModel(boolean z, PageDataMap pageDataMap, ViewerDataModel viewerDataModel, apix apix, PageData pageData) {
        this.a = pageDataMap;
        this.b = z;
        this.c = apix;
        this.d = viewerDataModel;
        this.e = pageData;
        this.f = false;
    }
}
