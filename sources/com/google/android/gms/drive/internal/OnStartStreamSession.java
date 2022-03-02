package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnStartStreamSession extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxc();
    final ParcelFileDescriptor a;
    final IBinder b;
    final String c;

    public OnStartStreamSession(ParcelFileDescriptor parcelFileDescriptor, IBinder iBinder, String str) {
        this.a = parcelFileDescriptor;
        this.b = iBinder;
        this.c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i | 1, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
