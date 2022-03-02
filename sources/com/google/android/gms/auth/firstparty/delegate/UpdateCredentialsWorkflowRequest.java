package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateCredentialsWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdr();
    final int a;
    @Deprecated
    String b;
    public AppDescription c;
    Bundle d;
    public Account e;
    public AccountAuthenticatorResponse f;

    public UpdateCredentialsWorkflowRequest() {
        this.a = 3;
        this.d = new Bundle();
    }

    public final Bundle a() {
        return new Bundle(this.d);
    }

    public final void a(Account account) {
        this.b = account != null ? account.name : null;
        this.e = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.b(parcel, a2);
    }

    public UpdateCredentialsWorkflowRequest(int i, String str, AppDescription appDescription, Bundle bundle, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        this.b = str;
        this.c = appDescription;
        this.d = bundle;
        if (account != null || TextUtils.isEmpty(str)) {
            this.e = account;
        } else {
            this.e = new Account(str, "com.google");
        }
        this.f = accountAuthenticatorResponse;
    }

    public final void a(Bundle bundle) {
        this.d.clear();
        if (bundle != null) {
            this.d.putAll(bundle);
        }
    }
}
