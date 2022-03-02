package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoadRealtimeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kwm();
    public final DriveId a;
    public final boolean b;
    public final boolean c;
    public final DataHolder d;
    public final String e;

    public LoadRealtimeRequest(DriveId driveId, boolean z, boolean z2, DataHolder dataHolder, String str) {
        this.a = driveId;
        this.b = z;
        this.c = z2;
        this.d = dataHolder;
        this.e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 5, this.c);
        ivx.a(parcel, 6, this.d, i, false);
        ivx.a(parcel, 7, this.e, false);
        ivx.b(parcel, a2);
    }
}
