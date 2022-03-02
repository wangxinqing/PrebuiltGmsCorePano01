package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountRemovalAllowedWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdi();
    public AccountAuthenticatorResponse a;
    public Account b;
    public boolean c;

    public AccountRemovalAllowedWorkflowRequest(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z) {
        iva.a((Object) account, (Object) "account cannot be null");
        this.b = account;
        iva.a((Object) accountAuthenticatorResponse, (Object) "amResponse cannot be null");
        this.a = accountAuthenticatorResponse;
        this.c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
