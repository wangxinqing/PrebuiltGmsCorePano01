package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldViewCheck$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new yxx();
    public boolean a;

    public FieldViewCheck$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public FieldViewCheck$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
