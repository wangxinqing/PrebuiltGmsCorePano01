package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnChangesResponse;
import java.util.ArrayList;

/* renamed from: kwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnChangesResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DataHolder dataHolder = null;
        ArrayList arrayList = null;
        ChangeSequenceNumber changeSequenceNumber = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                dataHolder = (DataHolder) ivw.a(parcel, readInt, DataHolder.CREATOR);
            } else if (a == 3) {
                arrayList = ivw.c(parcel, readInt, DriveId.CREATOR);
            } else if (a == 4) {
                changeSequenceNumber = (ChangeSequenceNumber) ivw.a(parcel, readInt, ChangeSequenceNumber.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new OnChangesResponse(dataHolder, arrayList, changeSequenceNumber, z);
    }
}
