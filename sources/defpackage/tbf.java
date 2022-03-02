package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;

/* renamed from: tbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetEsimConfigResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        String str3 = null;
        String str4 = null;
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
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 3:
                        l = ivw.j(parcel, readInt);
                        break;
                    case 4:
                        l2 = ivw.j(parcel, readInt);
                        break;
                    case 5:
                        str3 = ivw.q(parcel, readInt);
                        break;
                    case 6:
                        str4 = ivw.q(parcel, readInt);
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
        return new GetEsimConfigResponse(str, str2, l, l2, str3, str4, bundle);
    }
}
