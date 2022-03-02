package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthStatus;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CarrierInfo;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: tbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckAuthStatusResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        CarrierInfo carrierInfo = null;
        AuthType authType = null;
        AuthStatus authStatus = null;
        UserKey userKey = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                carrierInfo = (CarrierInfo) ivw.a(parcel, readInt, CarrierInfo.CREATOR);
            } else if (a == 3) {
                authType = (AuthType) ivw.a(parcel, readInt, AuthType.CREATOR);
            } else if (a == 4) {
                authStatus = (AuthStatus) ivw.a(parcel, readInt, AuthStatus.CREATOR);
            } else if (a == 5) {
                userKey = (UserKey) ivw.a(parcel, readInt, UserKey.CREATOR);
            } else if (a != 63) {
                ivw.b(parcel, readInt);
            } else {
                bundle = ivw.s(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new CheckAuthStatusResponse(str, carrierInfo, authType, authStatus, userKey, bundle);
    }
}
