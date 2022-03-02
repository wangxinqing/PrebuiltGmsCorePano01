package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class HeadsetPiece implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aeho();

    public static aehp f() {
        return new aehp();
    }

    public abstract int a();

    public abstract int b();

    public abstract String c();

    public abstract boolean d();

    public final int describeContents() {
        return 0;
    }

    public abstract Uri e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeadsetPiece) {
            HeadsetPiece headsetPiece = (HeadsetPiece) obj;
            return a() == headsetPiece.a() && b() == headsetPiece.b() && Objects.equals(c(), headsetPiece.c()) && d() == headsetPiece.d() && Objects.equals(e(), headsetPiece.e());
        }
    }

    public final boolean g() {
        return b() <= a() && b() >= 0 && !d();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Integer.valueOf(b()), c(), Boolean.valueOf(d()), e()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeInt(a());
        parcel.writeInt(b());
        parcel.writeByte(d() ? (byte) 1 : 0);
        parcel.writeParcelable(e(), i);
    }
}
