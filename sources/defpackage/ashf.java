package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;

/* renamed from: ashf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ashf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OperationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        IBinder iBinder = null;
        WorkSource workSource = null;
        BleFilter[] bleFilterArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 2) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 3) {
                workSource = (WorkSource) ivw.a(parcel, readInt, WorkSource.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                bleFilterArr = (BleFilter[]) ivw.b(parcel, readInt, BleFilter.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new OperationRequest(bArr, iBinder, workSource, bleFilterArr);
    }
}
