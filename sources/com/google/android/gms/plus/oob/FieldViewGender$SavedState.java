package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldViewGender$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new yyc();
    public boolean a;
    public boolean b;
    public int c;

    public FieldViewGender$SavedState(Parcel parcel) {
        super(parcel);
        this.c = parcel.readInt();
        boolean z = true;
        this.b = parcel.readInt() != 0;
        this.a = parcel.readInt() == 0 ? false : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public FieldViewGender$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
