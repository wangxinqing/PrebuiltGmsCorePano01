package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TokenWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gdq();
    final int a;
    public String b;
    @Deprecated
    public String c;
    Bundle d;
    public FACLConfig e;
    public PACLConfig f;
    public boolean g;
    public AppDescription h;
    public Account i;
    public AccountAuthenticatorResponse j;

    public TokenWorkflowRequest() {
        this.a = 2;
        this.d = new Bundle();
    }

    public final Bundle a() {
        return new Bundle(this.d);
    }

    public final void b() {
        this.e = null;
    }

    public final void a(Account account) {
        this.c = account != null ? account.name : null;
        this.i = account;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i2, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, i2, false);
        ivx.a(parcel, 9, this.i, i2, false);
        ivx.a(parcel, 10, this.j, i2, false);
        ivx.b(parcel, a2);
    }

    public TokenWorkflowRequest(int i2, String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, AppDescription appDescription, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = bundle;
        this.e = fACLConfig;
        this.f = pACLConfig;
        this.g = z;
        this.h = appDescription;
        if (account != null || TextUtils.isEmpty(str2)) {
            this.i = account;
        } else {
            this.i = new Account(str2, "com.google");
        }
        this.j = accountAuthenticatorResponse;
    }

    public final void a(Bundle bundle) {
        this.d.clear();
        if (bundle != null) {
            this.d.putAll(bundle);
        }
    }
}
