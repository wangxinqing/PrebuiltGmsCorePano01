package com.google.android.gms.accountsettings.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ButtonConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new diu();
    public final String a;
    public final int b;
    private final Bundle c;

    public ButtonConfig(String str, int i) {
        this(str, i, (Bundle) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
    }

    public ButtonConfig(String str, int i, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = bundle;
    }
}
