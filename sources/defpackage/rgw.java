package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* renamed from: rgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        LocationRequestInternal locationRequestInternal = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) ivw.a(parcel, readInt, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinder = ivw.r(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) ivw.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = ivw.r(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = ivw.r(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new LocationRequestUpdateData(i, locationRequestInternal, iBinder, pendingIntent, iBinder2, iBinder3);
    }
}
