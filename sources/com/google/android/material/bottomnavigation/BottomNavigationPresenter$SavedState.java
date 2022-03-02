package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BottomNavigationPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ajtd();
    public int a;
    public ParcelableSparseArray b;

    public BottomNavigationPresenter$SavedState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public BottomNavigationPresenter$SavedState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
    }
}
