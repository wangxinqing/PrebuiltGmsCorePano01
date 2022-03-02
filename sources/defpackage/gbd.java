package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: gbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountNameCheckRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    appDescription = (AppDescription) ivw.a(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 6:
                    captchaSolution = (CaptchaSolution) ivw.a(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 7:
                    account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AccountNameCheckRequest(i, str, str2, str3, appDescription, captchaSolution, account);
    }
}
