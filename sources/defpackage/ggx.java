package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: ggx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ggx extends AsyncTask {
    private static final String a;
    private final TokenRequest b;
    private final String c;
    private final String d;
    private final gck e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    static {
        String simpleName = ggx.class.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        a = sb.toString();
    }

    public ggx(Context context, TokenRequest tokenRequest, String str, String str2, boolean z, boolean z2, boolean z3) {
        iva.a((Object) tokenRequest, (Object) String.valueOf(a).concat(" <init> tokenRequest cannot be null"));
        this.b = tokenRequest;
        this.d = str;
        this.c = str2;
        this.e = new gck(context);
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static TokenResponse a(Intent intent) {
        return (TokenResponse) intent.getParcelableExtra("token_response");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle doInBackground(Object... objArr) {
        TokenResponse tokenResponse;
        iva.a((Object) this.b.j);
        Bundle bundle = new Bundle();
        if (this.c == null && this.d == null) {
            tokenResponse = null;
        } else {
            AccountCredentials accountCredentials = this.b.a() == null ? new AccountCredentials(this.b.n) : new AccountCredentials(this.b.a());
            accountCredentials.e = this.c;
            accountCredentials.b = this.g;
            accountCredentials.f = this.d;
            if (this.b.g) {
                AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
                TokenRequest tokenRequest = this.b;
                accountSignInRequest.b = tokenRequest.j;
                accountSignInRequest.f = accountCredentials;
                accountSignInRequest.e = tokenRequest.k;
                accountSignInRequest.d = this.f;
                tokenResponse = this.e.a(accountSignInRequest);
            } else if (this.h) {
                gck gck = this.e;
                ConfirmCredentialsRequest confirmCredentialsRequest = new ConfirmCredentialsRequest();
                confirmCredentialsRequest.b = accountCredentials;
                confirmCredentialsRequest.c = this.b.k;
                tokenResponse = gck.a(confirmCredentialsRequest);
            } else {
                gck gck2 = this.e;
                UpdateCredentialsRequest updateCredentialsRequest = new UpdateCredentialsRequest();
                updateCredentialsRequest.b = accountCredentials;
                updateCredentialsRequest.c = this.b.k;
                tokenResponse = gck2.a(updateCredentialsRequest);
            }
            this.b.k = null;
            if (tokenResponse.a() != null) {
                this.b.c = tokenResponse.a();
            }
        }
        if ((tokenResponse == null || fyo.a.c == tokenResponse.b()) && !this.h) {
            TokenRequest tokenRequest2 = this.b;
            if (tokenRequest2.b == null) {
                tokenRequest2.b = "ac2dm";
            }
            tokenResponse = this.e.a(tokenRequest2);
            this.b.k = null;
        }
        bundle.putParcelable("token_response", tokenResponse);
        return bundle;
    }
}
