package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.internal.TransferProgressData;

/* renamed from: kto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kto implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransferProgressEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        TransferProgressData transferProgressData = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                transferProgressData = (TransferProgressData) ivw.a(parcel, readInt, TransferProgressData.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new TransferProgressEvent(transferProgressData);
    }
}
