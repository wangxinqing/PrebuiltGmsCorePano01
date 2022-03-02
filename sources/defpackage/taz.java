package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.CarrierInfo;
import com.google.android.gms.mobilesubscription.serviceconfig.OauthRedirect;

/* renamed from: taz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class taz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarrierInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Long l = null;
        String str = null;
        OauthRedirect oauthRedirect = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                l = ivw.j(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                oauthRedirect = (OauthRedirect) ivw.a(parcel, readInt, OauthRedirect.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new CarrierInfo(l, str, oauthRedirect);
    }
}
