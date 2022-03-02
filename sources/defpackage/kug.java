package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFileIntentSenderRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: kug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kug implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreateFileIntentSenderRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        MetadataBundle metadataBundle = null;
        String str = null;
        DriveId driveId = null;
        Integer num = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                metadataBundle = (MetadataBundle) ivw.a(parcel, readInt, MetadataBundle.CREATOR);
            } else if (a == 3) {
                i = ivw.g(parcel, readInt);
            } else if (a == 4) {
                str = ivw.q(parcel, readInt);
            } else if (a == 5) {
                driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                num = ivw.h(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new CreateFileIntentSenderRequest(metadataBundle, i, str, driveId, num);
    }
}
