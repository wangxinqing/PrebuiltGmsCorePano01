package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldViewString$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new yyo();
    public String a;

    public FieldViewString$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public FieldViewString$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
