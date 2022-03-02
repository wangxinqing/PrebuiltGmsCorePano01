package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: kuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kuc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        Contents contents = null;
        String str = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = true;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) ivw.a(parcel, readInt, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) ivw.a(parcel, readInt, Contents.CREATOR);
                    break;
                case 5:
                    z = ivw.c(parcel, readInt);
                    break;
                case 6:
                    str = ivw.q(parcel, readInt);
                    break;
                case 7:
                    i = ivw.g(parcel, readInt);
                    break;
                case 8:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 9:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 10:
                    z3 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new CloseContentsAndUpdateMetadataRequest(driveId, metadataBundle, contents, z, str, i, i2, z2, z3);
    }
}
