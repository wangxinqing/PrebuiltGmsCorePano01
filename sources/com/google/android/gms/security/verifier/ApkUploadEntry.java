package com.google.android.gms.security.verifier;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ApkUploadEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aazh();
    public final long a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final byte[] e;
    public final long f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;

    public ApkUploadEntry(long j2, String str, int i2, byte[] bArr, byte[] bArr2, long j3, int i3, long j4, int i4, int i5) {
        this.a = j2;
        this.b = str;
        this.c = i2;
        this.d = bArr;
        if (bArr2 == null || bArr2.length != 256) {
            this.e = aazz.a();
        } else {
            this.e = bArr2;
        }
        this.f = j3;
        this.g = i3;
        this.h = j4;
        this.i = i4;
        this.j = i5;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("id: %d, package_name=%s, version_code=%d, state=%d", new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.g)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByteArray(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
    }

    public ApkUploadEntry(String str, int i2, byte[] bArr, byte[] bArr2, long j2, int i3) {
        this.a = -1;
        this.b = str;
        this.c = i2;
        this.d = bArr;
        if (bArr2 == null) {
            this.e = aazz.a();
        } else {
            this.e = bArr2;
        }
        this.f = j2;
        this.g = 0;
        this.h = -1;
        this.i = 0;
        if (azfv.u()) {
            this.j = i3;
        } else {
            this.j = 0;
        }
    }
}
