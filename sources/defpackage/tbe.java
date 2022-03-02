package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: tbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetEsimConfigRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        UserKey userKey = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String[] strArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 63) {
                switch (a) {
                    case 1:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 2:
                        userKey = (UserKey) ivw.a(parcel, readInt, UserKey.CREATOR);
                        break;
                    case 3:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 4:
                        str3 = ivw.q(parcel, readInt);
                        break;
                    case 5:
                        str4 = ivw.q(parcel, readInt);
                        break;
                    case 6:
                        str5 = ivw.q(parcel, readInt);
                        break;
                    case 7:
                        strArr = ivw.A(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                bundle = ivw.s(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetEsimConfigRequest(str, userKey, str2, str3, str4, str5, strArr, bundle);
    }
}
