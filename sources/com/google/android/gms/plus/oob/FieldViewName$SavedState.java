package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldViewName$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new yyk();
    public boolean a;
    public boolean b;
    public int c;
    public String d;
    public String e;

    public FieldViewName$SavedState(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.a = parcel.readInt() != 0;
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.b = parcel.readInt() == 0 ? false : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public FieldViewName$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
