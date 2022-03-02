package com.google.android.gms.auth.uiflows.updatecredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateCredentialsController implements Controller {
    public static final Parcelable.Creator CREATOR = new gqn();
    private static final iwd a = ehv.a("UpdateCredentials", "UpdateCredentialsController");
    private static final fzk b = fzk.a("token_handle");
    private final Context c;
    private final fzo d;
    private final qub e;
    private final AccountAuthenticatorResponse f;
    private final Account g;
    private String h;
    private String i;
    private final boolean j;
    private final ijn k;
    private final boolean l;
    private String m;

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, ijn ijn, boolean z) {
        this(accountAuthenticatorResponse, account, false, ijn, z, (String) null, (String) null, (String) null);
    }

    private final gnw a(int i2, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i2).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i2, str);
        }
        return gnw.b(0, putExtra);
    }

    public final String b() {
        return "UpdateCredentialsController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeByte(this.j ? (byte) 1 : 0);
        ijn ijn = this.k;
        parcel.writeParcelable(ijn != null ? ijn.a() : null, 0);
        parcel.writeByte(this.l ? (byte) 1 : 0);
        parcel.writeString(this.i);
        parcel.writeString(this.h);
        parcel.writeString(this.m);
    }

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, ijn ijn, boolean z2, String str, String str2, String str3) {
        fzo fzo = new fzo(ihs.b());
        qub a2 = qub.a((Context) ihs.b());
        this.c = ihs.b();
        this.d = fzo;
        this.e = a2;
        this.f = accountAuthenticatorResponse;
        this.g = account;
        this.j = z;
        this.k = ijn;
        this.l = z2;
        this.i = str;
        this.h = str2;
        this.m = str3;
    }

    public final gnw a(gny gny) {
        Bundle bundle;
        if (gny != null) {
            a.b(String.format("Result with id=%d and resultCode=%d", new Object[]{Integer.valueOf(gny.a), Integer.valueOf(gny.b)}), new Object[0]);
            int i2 = gny.a;
            if (i2 == 10) {
                int i3 = gny.b;
                if (i3 == -1) {
                    fzl fzl = new fzl(gny.c.getExtras());
                    this.i = (String) fzl.a(MinuteMaidChimeraActivity.b);
                    String str = (String) fzl.a(MinuteMaidChimeraActivity.d);
                    if (this.g != null && !TextUtils.isEmpty(str) && !this.g.name.equalsIgnoreCase(str)) {
                        new eri(this.c).a(7);
                    }
                    if (!this.l || !jkr.c()) {
                        return gnw.a(20, UpdateCredentialsChimeraActivity.a(this.c, this.g, this.i, false, this.k), 0, 0);
                    }
                    this.h = (String) fzl.a(MinuteMaidChimeraActivity.e);
                    Bundle a2 = FinishSessionChimeraActivity.a(this.j, this.k, this.i, this.g);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBundle("accountSessionBundle", a2);
                    bundle2.putString("password", this.h);
                    Intent putExtras = new Intent().putExtras(bundle2);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.f;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(bundle2);
                    }
                    return gnw.b(-1, putExtras);
                } else if (i3 == 0) {
                    return a(4, "user canceled");
                } else {
                    if (i3 == 2) {
                        return a(5, "something went wrong");
                    }
                }
            } else if (i2 == 20) {
                int i4 = gny.b;
                if (i4 == -1) {
                    Intent intent = gny.c;
                    if (intent != null) {
                        this.m = (String) new fzl(intent.getExtras()).a(b);
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("authAccount", this.g.name);
                    bundle3.putString("accountType", this.g.type);
                    String str2 = this.m;
                    if (str2 != null) {
                        bundle3.putString("accountStatusToken", str2);
                    }
                    AccountAuthenticatorResponse accountAuthenticatorResponse2 = this.f;
                    if (accountAuthenticatorResponse2 != null) {
                        accountAuthenticatorResponse2.onResult(bundle3);
                    }
                    return gnw.b(-1, new Intent().putExtras(bundle3));
                } else if (i4 == 0) {
                    return a(5, "something went wrong");
                }
            } else if (i2 == 1001) {
                return a(3, "no network");
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(gny.b)}));
        } else if (!this.d.a()) {
            fzl fzl2 = new fzl();
            fzl2.b(gmz.j, Boolean.valueOf(this.j));
            fzk fzk = gmz.i;
            ijn ijn = this.k;
            if (ijn != null) {
                bundle = ijn.a();
            } else {
                bundle = null;
            }
            fzl2.b(fzk, bundle);
            return gnw.a(1001, ErrorChimeraActivity.a(this.c, R.string.common_no_network, R.string.auth_error_no_network).putExtras(fzl2.a));
        } else if (TextUtils.isEmpty(this.e.a(this.g))) {
            Context context = this.c;
            Account account = this.g;
            return gnw.a(10, MinuteMaidChimeraActivity.b(context, account, this.j, this.k, glk.a(context, true, account.type, this.k, false)));
        } else {
            Context context2 = this.c;
            Account account2 = this.g;
            return gnw.a(10, MinuteMaidChimeraActivity.a(context2, account2, this.j, this.k, glk.a(context2, false, account2.type, this.k, false)));
        }
    }
}
