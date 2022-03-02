package com.google.android.gms.auth.uiflows.updatecredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FinishUpdateCredentialsSessionController implements Controller {
    public static final Parcelable.Creator CREATOR = new gqm();
    private static final fzk a = fzk.a("token_handle");
    private final Context b = ihs.b();
    private final fzo c;
    private final AccountAuthenticatorResponse d;
    private final Account e;
    private String f;
    private final boolean g;
    private final ijn h;
    private String i;

    public FinishUpdateCredentialsSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, ijn ijn, String str, String str2) {
        fzo fzo = new fzo(ihs.b());
        this.c = fzo;
        this.d = accountAuthenticatorResponse;
        this.e = account;
        this.g = z;
        this.h = ijn;
        this.f = str;
        this.i = str2;
    }

    private final gnw a(int i2, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i2).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i2, str);
        }
        return gnw.b(0, putExtra);
    }

    public final String b() {
        return "FinishUpdateCredentialsSessionController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeByte(this.g ? (byte) 1 : 0);
        parcel.writeParcelable(this.h.a(), 0);
        parcel.writeString(this.f);
        parcel.writeString(this.i);
    }

    public final gnw a(gny gny) {
        if (gny != null) {
            int i2 = gny.a;
            if (i2 == 10) {
                int i3 = gny.b;
                if (i3 == -1) {
                    Intent intent = gny.c;
                    if (intent != null) {
                        this.i = (String) new fzl(intent.getExtras()).a(a);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("authAccount", this.e.name);
                    bundle.putString("accountType", this.e.type);
                    bundle.putString("accountStatusToken", this.i);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(bundle);
                    }
                    return gnw.b(-1, new Intent().putExtras(bundle));
                } else if (i3 == 0) {
                    return a(5, "something went wrong");
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(gny.b)}));
        } else if (!this.c.a()) {
            return a(3, "no network");
        } else {
            return gnw.a(10, UpdateCredentialsChimeraActivity.a(this.b, this.e, this.f, false, this.h), 0, 0);
        }
    }
}
