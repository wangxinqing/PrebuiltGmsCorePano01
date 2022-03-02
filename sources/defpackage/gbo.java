package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: gbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConfirmCredentialsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        AccountCredentials accountCredentials = null;
        CaptchaSolution captchaSolution = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                accountCredentials = (AccountCredentials) ivw.a(parcel, readInt, AccountCredentials.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                captchaSolution = (CaptchaSolution) ivw.a(parcel, readInt, CaptchaSolution.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ConfirmCredentialsRequest(i, accountCredentials, captchaSolution);
    }
}
