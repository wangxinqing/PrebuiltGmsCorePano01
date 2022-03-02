package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetAccountRemovalAllowedController implements Controller {
    public static final Parcelable.Creator CREATOR = new gqk();
    private static final iwd a = ehv.a("RemoveAccount", "GetAccountRemovalAllowedController");
    private final Context b = ihs.b();
    private final AccountAuthenticatorResponse c;
    private final Account d;
    private final boolean e;
    private final String f;

    public GetAccountRemovalAllowedController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, String str) {
        this.c = accountAuthenticatorResponse;
        this.d = account;
        this.e = z;
        this.f = str;
    }

    private final gnw a() {
        if (this.e) {
            return gnw.a(20, ConfirmAccountDeletionChimeraActivity.a(this.b, this.f));
        }
        return a(true);
    }

    public final String b() {
        return "GetAccountRemovalAllowedController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeByte(this.e ? (byte) 1 : 0);
        parcel.writeString(this.f);
    }

    private final gnw a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", z);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return gnw.b(-1, new Intent().putExtras(bundle));
    }

    public final gnw a(gny gny) {
        if (gny != null) {
            a.b(String.format("Result with id=%d and resultCode=%d", new Object[]{Integer.valueOf(gny.a), Integer.valueOf(gny.b)}), new Object[0]);
            int i = gny.a;
            if (i == 10) {
                int i2 = gny.b;
                if (i2 == -1) {
                    return a();
                }
                if (i2 == 0) {
                    return a(false);
                }
            } else if (i == 20) {
                int i3 = gny.b;
                if (i3 == -1) {
                    return a(true);
                }
                if (i3 == 0) {
                    return a(false);
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", new Object[]{Integer.valueOf(i), Integer.valueOf(gny.b)}));
        }
        Intent a2 = ijk.a(this.b, this.d);
        if (a2 != null) {
            return gnw.a(10, WrapperControlledChimeraActivity.a(this.b, false, (ijn) null, a2));
        }
        return a();
    }
}
