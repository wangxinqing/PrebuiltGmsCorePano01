package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemoveEventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxi();
    public final DriveId a;
    public final int b;
    public final TransferProgressOptions c;

    public RemoveEventListenerRequest(DriveId driveId, int i, TransferProgressOptions transferProgressOptions) {
        this.a = driveId;
        this.b = i;
        this.c = transferProgressOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
