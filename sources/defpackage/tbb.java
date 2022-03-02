package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.ServiceType;

/* renamed from: tbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckAuthStatusRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ServiceType serviceType = null;
        Long l = null;
        AuthType authType = null;
        String str2 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                serviceType = (ServiceType) ivw.a(parcel, readInt, ServiceType.CREATOR);
            } else if (a == 3) {
                l = ivw.j(parcel, readInt);
            } else if (a == 4) {
                authType = (AuthType) ivw.a(parcel, readInt, AuthType.CREATOR);
            } else if (a == 5) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 63) {
                ivw.b(parcel, readInt);
            } else {
                bundle = ivw.s(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new CheckAuthStatusRequest(str, serviceType, l, authType, str2, bundle);
    }
}
