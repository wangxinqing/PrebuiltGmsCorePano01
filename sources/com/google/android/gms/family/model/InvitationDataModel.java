package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InvitationDataModel implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mhl();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final int g;

    public InvitationDataModel(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        int a2 = apju.a(parcel.readInt());
        this.g = a2 == 0 ? 1 : a2;
        this.f = Long.valueOf(parcel.readLong());
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        return TextUtils.isEmpty(this.d) ? jlh.a(this.c) : this.d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.a);
        parcel.writeInt(this.g - 1);
        parcel.writeLong(this.f.longValue());
    }

    public InvitationDataModel(String str, String str2, String str3, String str4, String str5, int i, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = i;
        this.f = l;
    }
}
