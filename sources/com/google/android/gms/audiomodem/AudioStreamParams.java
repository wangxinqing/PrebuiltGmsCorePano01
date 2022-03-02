package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioStreamParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new edk();
    public final ParcelFileDescriptor a;
    public final float b;
    public final int c;
    public final int d;

    public AudioStreamParams(ParcelFileDescriptor parcelFileDescriptor, float f, int i, int i2) {
        this.a = parcelFileDescriptor;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
