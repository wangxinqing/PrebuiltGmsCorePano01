package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OpenContentsRequest;

/* renamed from: kxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kxe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OpenContentsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
            } else if (a == 3) {
                i = ivw.g(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                i2 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new OpenContentsRequest(driveId, i, i2);
    }
}
