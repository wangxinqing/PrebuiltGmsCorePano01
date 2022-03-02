package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: gdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConfirmCredentialsWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        AppDescription appDescription = null;
        Account account = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
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
                    appDescription = (AppDescription) ivw.a(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 4:
                    bundle = ivw.s(parcel, readInt);
                    break;
                case 5:
                    account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                case 6:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) ivw.a(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ConfirmCredentialsWorkflowRequest(i, str, appDescription, bundle, account, accountAuthenticatorResponse);
    }
}
