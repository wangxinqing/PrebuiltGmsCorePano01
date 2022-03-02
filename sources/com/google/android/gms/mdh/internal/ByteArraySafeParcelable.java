package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ByteArraySafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wkm(new ryv());
    public final byte[] a;

    public ByteArraySafeParcelable(byte[] bArr) {
        this.a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wkm.a(this, parcel, new ryu());
    }
}
