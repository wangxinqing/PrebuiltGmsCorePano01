package com.google.android.gms.drive.ui.select.path;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TopLevelView$MyDrivePathElement extends ViewPathElement implements DriveIdPathElement {
    public static final Parcelable.Creator CREATOR = new lqi();

    public TopLevelView$MyDrivePathElement() {
        super(R.string.drive_view_my_drive, R.drawable.quantum_ic_drive_grey600_24, lim.a(liu.d, (Object) DriveId.a("root")), lqu.a);
    }

    public final DriveId a() {
        return DriveId.a("root");
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
