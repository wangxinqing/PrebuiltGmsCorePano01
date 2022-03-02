package com.google.android.places.ui.placepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfirmView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new aldf();
    public boolean a;

    public ConfirmView$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public ConfirmView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
