package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* renamed from: gdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        Account account = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) ivw.a(parcel2, readInt, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) ivw.a(parcel2, readInt, PACLConfig.CREATOR);
                    break;
                case 7:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    appDescription = (AppDescription) ivw.a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 9:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) ivw.a(parcel2, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new TokenWorkflowRequest(i, str, str2, bundle, fACLConfig, pACLConfig, z, appDescription, account, accountAuthenticatorResponse);
    }
}
