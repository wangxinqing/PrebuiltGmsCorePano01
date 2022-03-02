package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* renamed from: kxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kxf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OpenFileIntentSenderRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String[] strArr = null;
        DriveId driveId = null;
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                strArr = ivw.A(parcel, readInt);
            } else if (a == 4) {
                driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                filterHolder = (FilterHolder) ivw.a(parcel, readInt, FilterHolder.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new OpenFileIntentSenderRequest(str, strArr, driveId, filterHolder);
    }
}
