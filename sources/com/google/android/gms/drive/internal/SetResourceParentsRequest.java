package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetResourceParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxm();
    public final DriveId a;
    public final List b;

    public SetResourceParentsRequest(DriveId driveId, List list) {
        this.a = driveId;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.c(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
