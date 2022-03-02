package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChangeResourceParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kua();
    public final DriveId a;
    public final List b;
    public final List c;

    public ChangeResourceParentsRequest(DriveId driveId, List list, List list2) {
        this.a = driveId;
        this.b = list;
        this.c = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.c(parcel, 3, this.b, false);
        ivx.c(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
