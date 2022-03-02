package com.google.android.gms.drive.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CallingAppInfo implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new khr();
    public final String a;
    public final String b;
    public final int c;

    public CallingAppInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    public CallingAppInfo(khq khq, int i) {
        this(khq.b, khq.c.b, i);
    }
}
