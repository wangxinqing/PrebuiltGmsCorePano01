package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;

/* renamed from: uis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uis implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendPayloadParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        String[] strArr = null;
        ParcelablePayload parcelablePayload = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 2) {
                strArr = ivw.A(parcel, readInt);
            } else if (a == 3) {
                parcelablePayload = (ParcelablePayload) ivw.a(parcel, readInt, ParcelablePayload.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SendPayloadParams(iBinder, strArr, parcelablePayload, z);
    }
}
