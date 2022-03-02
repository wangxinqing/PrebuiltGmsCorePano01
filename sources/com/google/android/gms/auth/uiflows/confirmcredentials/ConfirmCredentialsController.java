package com.google.android.gms.auth.uiflows.confirmcredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfirmCredentialsController implements Controller {
    public static final Parcelable.Creator CREATOR = new gnm();
    private static final iwd a = ehv.a("ConfirmCredentials", "ConfirmCredentialsController");
    private final Context b = ihs.b();
    private final fzo c;
    private final AccountAuthenticatorResponse d;
    private final Account e;
    private final boolean f;
    private final ijn g;

    public ConfirmCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, ijn ijn) {
        fzo fzo = new fzo(ihs.b());
        this.c = fzo;
        this.d = accountAuthenticatorResponse;
        this.e = account;
        this.f = z;
        this.g = ijn;
    }

    private final gnw a(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return gnw.b(0, putExtra);
    }

    public final String b() {
        return "ConfirmCredentialsController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        parcel.writeParcelable(this.g.a(), 0);
    }

    private final gnw a(boolean z) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", z);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        if (!z) {
            i = 0;
        } else {
            i = -1;
        }
        return gnw.b(i, new Intent().putExtras(bundle));
    }

    public final gnw a(gny gny) {
        if (gny != null) {
            a.b(String.format("Result with id=%d and resultCode=%d", new Object[]{Integer.valueOf(gny.a), Integer.valueOf(gny.b)}), new Object[0]);
            int i = gny.a;
            if (i == 10) {
                int i2 = gny.b;
                if (i2 == -1) {
                    return a(true);
                }
                if (i2 == 0) {
                    return a(false);
                }
                if (i2 == 2) {
                    return a(5, "something went wrong");
                }
            } else if (i != 1001) {
                throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", new Object[]{Integer.valueOf(i), Integer.valueOf(gny.b)}));
            }
            return a(3, "no network");
        } else if (this.c.a()) {
            Context context = this.b;
            Account account = this.e;
            return gnw.a(10, MinuteMaidChimeraActivity.a(context, account, this.f, this.g, glk.a(context, false, account.type, this.g, false)));
        } else {
            fzl fzl = new fzl();
            fzl.b(gmz.j, Boolean.valueOf(this.f));
            fzl.b(gmz.i, this.g.a());
            return gnw.a(1001, ErrorChimeraActivity.a(this.b, R.string.common_no_network, R.string.auth_error_no_network).putExtras(fzl.a));
        }
    }
}
