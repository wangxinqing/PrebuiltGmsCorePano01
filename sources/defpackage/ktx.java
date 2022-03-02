package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.internal.AddPermissionRequest;

/* renamed from: ktx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ktx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddPermissionRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DriveId driveId = null;
        Permission permission = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
                    break;
                case 3:
                    permission = (Permission) ivw.a(parcel, readInt, Permission.CREATOR);
                    break;
                case 4:
                    z = ivw.c(parcel, readInt);
                    break;
                case 5:
                    str = ivw.q(parcel, readInt);
                    break;
                case 6:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AddPermissionRequest(driveId, permission, z, str, z2, str2);
    }
}
