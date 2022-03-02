package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import java.util.UUID;

/* renamed from: gnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnk extends gni {
    private final Account a;
    private final String b;
    private final boolean c;
    private final gck d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gnk(Context context, Account account, String str, boolean z) {
        super(context);
        gck gck = new gck(context);
        iva.a((Object) account);
        this.a = account;
        iva.a((Object) str);
        this.b = str;
        this.c = z;
        iva.a((Object) gck);
        this.d = gck;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        TokenData tokenData;
        AccountCredentials accountCredentials = new AccountCredentials(this.a);
        accountCredentials.e = this.b;
        UpdateCredentialsRequest updateCredentialsRequest = new UpdateCredentialsRequest();
        updateCredentialsRequest.b = accountCredentials;
        TokenResponse a2 = this.d.a(updateCredentialsRequest);
        String str = null;
        if (this.c) {
            fyk fyk = new fyk(getContext());
            String uuid = UUID.randomUUID().toString();
            gck gck = this.d;
            TokenRequest tokenRequest = new TokenRequest(this.a, ent.ab());
            tokenRequest.j = new AppDescription(fyk.d, fyk.f, uuid, uuid);
            TokenResponse a3 = gck.a(tokenRequest);
            if (!(a3 == null || a3.b() != gei.SUCCESS || (tokenData = a3.w) == null)) {
                str = this.d.a(tokenData.b);
            }
        }
        Bundle bundle = new Bundle();
        String str2 = UpdateCredentialsChimeraActivity.b.a;
        boolean z = false;
        if (a2 != null && a2.b() == gei.SUCCESS) {
            z = true;
        }
        bundle.putBoolean(str2, z);
        bundle.putString(UpdateCredentialsChimeraActivity.a.a, str);
        return bundle;
    }
}
