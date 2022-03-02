package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.android.volley.AuthFailureError;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AndroidAuthenticator implements Authenticator {
    private final AccountManager a;
    private final Account b;
    private final String c;
    private final boolean d;

    public AndroidAuthenticator(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    public Account getAccount() {
        return this.b;
    }

    public String getAuthToken() {
        AccountManagerFuture<Bundle> authToken = this.a.getAuthToken(this.b, this.c, this.d, (AccountManagerCallback) null, (Handler) null);
        try {
            Bundle result = authToken.getResult();
            String str = null;
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (!result.containsKey("intent")) {
                    str = result.getString("authtoken");
                } else {
                    throw new AuthFailureError((Intent) result.getParcelable("intent"));
                }
            }
            if (str != null) {
                return str;
            }
            String valueOf = String.valueOf(this.c);
            throw new AuthFailureError(valueOf.length() == 0 ? new String("Got null auth token for type: ") : "Got null auth token for type: ".concat(valueOf));
        } catch (Exception e) {
            throw new AuthFailureError("Error while retrieving auth token", e);
        }
    }

    public String getAuthTokenType() {
        return this.c;
    }

    public void invalidateAuthToken(String str) {
        this.a.invalidateAuthToken(this.b.type, str);
    }

    public AndroidAuthenticator(Context context, Account account, String str, boolean z) {
        this.a = AccountManager.get(context);
        this.b = account;
        this.c = str;
        this.d = z;
    }
}
