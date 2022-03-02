package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactPickerOptionsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mpy();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public int j;
    public int[] k;

    public ContactPickerOptionsData(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        this.k = parcel.createIntArray();
    }

    public final void a(int[] iArr) {
        this.k = Arrays.copyOf(iArr, iArr.length);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        parcel.writeIntArray(this.k);
    }

    public ContactPickerOptionsData(aphs aphs) {
        this.a = aphs.a;
        this.b = aphs.b;
        this.c = aphs.c;
        this.d = aphs.d;
        this.e = aphs.e;
        this.f = aphs.f;
        this.g = aphs.g;
        this.h = aphs.h;
        this.i = aphs.i;
    }
}
