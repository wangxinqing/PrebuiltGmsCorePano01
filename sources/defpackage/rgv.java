package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: rgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        ArrayList arrayList = LocationRequestInternal.a;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1) {
                switch (a) {
                    case 5:
                        arrayList = ivw.c(parcel2, readInt, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = ivw.q(parcel2, readInt);
                        break;
                    case 7:
                        z = ivw.c(parcel2, readInt);
                        break;
                    case 8:
                        z2 = ivw.c(parcel2, readInt);
                        break;
                    case 9:
                        z3 = ivw.c(parcel2, readInt);
                        break;
                    case 10:
                        str2 = ivw.q(parcel2, readInt);
                        break;
                    case 11:
                        z4 = ivw.c(parcel2, readInt);
                        break;
                    case 12:
                        z5 = ivw.c(parcel2, readInt);
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                        str3 = ivw.q(parcel2, readInt);
                        break;
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                        j = ivw.i(parcel2, readInt);
                        break;
                    default:
                        ivw.b(parcel2, readInt);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) ivw.a(parcel2, readInt, LocationRequest.CREATOR);
            }
        }
        ivw.E(parcel2, b);
        return new LocationRequestInternal(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }
}
