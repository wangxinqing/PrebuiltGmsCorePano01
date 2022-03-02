package com.google.location.nearby.common.fastpair;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DiscoveryListItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new arxf();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final float g;
    public final String h;
    public final Intent i;
    public final Bitmap j;
    public final boolean k;
    public final avbx l;
    public final boolean m;
    public final double n;
    public final String o;

    public DiscoveryListItem(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.i = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.j = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean z = true;
        this.k = parcel.readByte() != 0;
        this.l = avbx.a(parcel.readInt());
        this.m = parcel.readByte() == 0 ? false : z;
        this.g = parcel.readFloat();
        this.h = parcel.readString();
        this.f = parcel.readString();
        this.n = parcel.readDouble();
        this.o = parcel.readString();
    }

    public final boolean a() {
        return this.n >= 0.0d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.i, i2);
        parcel.writeParcelable(this.j, i2);
        parcel.writeByte(this.k ? (byte) 1 : 0);
        parcel.writeInt(this.l.h);
        parcel.writeByte(this.m ? (byte) 1 : 0);
        parcel.writeFloat(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.f);
        parcel.writeDouble(this.n);
        parcel.writeString(this.o);
    }

    public DiscoveryListItem(String str, String str2, String str3, String str4, String str5, float f2, String str6, String str7, boolean z, avbx avbx, Intent intent, Bitmap bitmap, boolean z2, Double d2, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.f = str5;
        this.g = f2;
        this.h = str6;
        this.d = str7;
        this.i = intent;
        this.j = bitmap;
        this.k = z;
        this.l = avbx;
        this.m = z2;
        this.n = d2 != null ? d2.doubleValue() : -1.0d;
        this.o = str8;
    }

    public DiscoveryListItem(String str, String str2, String str3, String str4, String str5, float f2, boolean z, avbx avbx, Intent intent, Bitmap bitmap, boolean z2) {
        this(str, str2, str3, str4, str5, f2, (String) null, (String) null, z, avbx, intent, bitmap, z2, (Double) null, (String) null);
    }
}
