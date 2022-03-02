package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.ChangeResourceParentsRequest;
import java.util.ArrayList;

/* renamed from: kua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kua implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChangeResourceParentsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DriveId driveId = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
            } else if (a == 3) {
                arrayList = ivw.c(parcel, readInt, DriveId.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                arrayList2 = ivw.c(parcel, readInt, DriveId.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ChangeResourceParentsRequest(driveId, arrayList, arrayList2);
    }
}
