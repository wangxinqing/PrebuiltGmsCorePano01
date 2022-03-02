package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;

/* renamed from: gbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConsentResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        FACLConfig fACLConfig = null;
        String str2 = null;
        String str3 = null;
        String str4 = "com.google.android.gms.auth.firstparty.shared.Status.UNKNOWN.toString()";
        String str5 = "com.google.android.gms.auth.firstparty.shared.Consent.UNKNOWN.toString()";
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    fACLConfig = (FACLConfig) ivw.a(parcel, readInt, FACLConfig.CREATOR);
                    break;
                case 5:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str3 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ConsentResult(i, str4, str, fACLConfig, str5, str2, str3);
    }
}
