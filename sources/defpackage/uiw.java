package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;

/* renamed from: uiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uiw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartDiscoveryParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        DiscoveryOptions discoveryOptions = null;
        IBinder iBinder3 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    iBinder = ivw.r(parcel, readInt);
                    break;
                case 2:
                    iBinder2 = ivw.r(parcel, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    j = ivw.i(parcel, readInt);
                    break;
                case 5:
                    discoveryOptions = (DiscoveryOptions) ivw.a(parcel, readInt, DiscoveryOptions.CREATOR);
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
        return new StartDiscoveryParams(iBinder, iBinder2, str, j, discoveryOptions, iBinder3);
    }
}
