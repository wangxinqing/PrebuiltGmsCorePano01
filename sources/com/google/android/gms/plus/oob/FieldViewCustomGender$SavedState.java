package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldViewCustomGender$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new yxz();
    public String a;

    public FieldViewCustomGender$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public FieldViewCustomGender$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
