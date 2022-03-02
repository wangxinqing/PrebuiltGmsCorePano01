package com.google.android.gms.auth.uncertifieddevice;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UncertifiedDeviceServiceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gqs();
    final int a;
    public boolean b;
    public PendingIntent c;

    public UncertifiedDeviceServiceResponse() {
        this(1, true, (PendingIntent) null);
    }

    public UncertifiedDeviceServiceResponse(int i, boolean z, PendingIntent pendingIntent) {
        this.a = i;
        this.b = z;
        this.c = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
