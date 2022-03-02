package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.LoadRealtimeRequest;

/* renamed from: kwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoadRealtimeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DriveId driveId = null;
        DataHolder dataHolder = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
            } else if (a == 3) {
                z = ivw.c(parcel, readInt);
            } else if (a == 5) {
                z2 = ivw.c(parcel, readInt);
            } else if (a == 6) {
                dataHolder = (DataHolder) ivw.a(parcel, readInt, DataHolder.CREATOR);
            } else if (a != 7) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new LoadRealtimeRequest(driveId, z, z2, dataHolder, str);
    }
}
