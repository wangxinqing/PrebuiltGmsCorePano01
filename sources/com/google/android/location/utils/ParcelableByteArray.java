package com.google.android.location.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ParcelableByteArray implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ajqv();
    public final byte a;
    public final byte b;
    public final byte[] c;

    public ParcelableByteArray(Parcel parcel) {
        this.a = parcel.readByte();
        this.b = parcel.readByte();
        byte[] bArr = new byte[parcel.readInt()];
        this.c = bArr;
        parcel.readByteArray(bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParcelableByteArray) {
            ParcelableByteArray parcelableByteArray = (ParcelableByteArray) obj;
            return parcelableByteArray.a == this.a && parcelableByteArray.b == this.b && Arrays.equals(parcelableByteArray.c, this.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeByte(this.b);
        byte[] bArr = this.c;
        parcel.writeInt(bArr != null ? bArr.length : 0);
        parcel.writeByteArray(this.c);
    }

    public ParcelableByteArray(byte[] bArr) {
        this.a = 0;
        this.b = 0;
        this.c = bArr;
    }
}
