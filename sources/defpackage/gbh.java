package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: gbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountSignInRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        AccountCredentials accountCredentials = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    appDescription = (AppDescription) ivw.a(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 3:
                    z = ivw.c(parcel, readInt);
                    break;
                case 4:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 5:
                    captchaSolution = (CaptchaSolution) ivw.a(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 6:
                    accountCredentials = (AccountCredentials) ivw.a(parcel, readInt, AccountCredentials.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AccountSignInRequest(i, appDescription, z, z2, captchaSolution, accountCredentials);
    }
}
