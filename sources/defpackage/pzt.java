package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.UUID;

/* renamed from: pzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzt {
    public static Intent a(Context context, TokenRequest tokenRequest) {
        Bundle b = tokenRequest.b();
        Intent data = new Intent().setClassName(context, "com.google.android.gms.signin.activity.ConsentActivity").setPackage("com.google.android.gms").putExtra("suppress_loading_ui", b.getBoolean("suppressProgressScreen", false)).setData(Uri.parse(String.format("intent://%s/%s", new Object[]{"com.google.android.gms.signin.activity.ConsentActivity", UUID.randomUUID()})));
        if (b.containsKey("accountManagerResponse")) {
            data.putExtra("account_authenticator_response", (AccountAuthenticatorResponse) b.getParcelable("accountManagerResponse"));
            b.remove("accountManagerResponse");
        }
        tokenRequest.a(b);
        ivy.a((SafeParcelable) tokenRequest, data, "token_request");
        return data;
    }
}
