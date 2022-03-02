package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFileRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: kuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kuh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreateFileRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Integer num = null;
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        Contents contents = null;
        String str = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
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
                    num = ivw.h(parcel, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel, readInt);
                    break;
                case 7:
                    str = ivw.q(parcel, readInt);
                    break;
                case 8:
                    i = ivw.g(parcel, readInt);
                    break;
                case 9:
                    i2 = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new CreateFileRequest(driveId, metadataBundle, contents, num.intValue(), z, str, i, i2);
    }
}
