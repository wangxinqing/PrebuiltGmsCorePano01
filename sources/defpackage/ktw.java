package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;
import com.google.android.gms.drive.internal.AddEventListenerRequest;

/* renamed from: ktw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ktw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddEventListenerRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DriveId driveId = null;
        ChangesAvailableOptions changesAvailableOptions = null;
        TransferStateOptions transferStateOptions = null;
        TransferProgressOptions transferProgressOptions = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                driveId = (DriveId) ivw.a(parcel, readInt, DriveId.CREATOR);
            } else if (a == 3) {
                i = ivw.g(parcel, readInt);
            } else if (a == 4) {
                changesAvailableOptions = (ChangesAvailableOptions) ivw.a(parcel, readInt, ChangesAvailableOptions.CREATOR);
            } else if (a == 5) {
                transferStateOptions = (TransferStateOptions) ivw.a(parcel, readInt, TransferStateOptions.CREATOR);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                transferProgressOptions = (TransferProgressOptions) ivw.a(parcel, readInt, TransferProgressOptions.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new AddEventListenerRequest(driveId, i, changesAvailableOptions, transferStateOptions, transferProgressOptions);
    }
}
