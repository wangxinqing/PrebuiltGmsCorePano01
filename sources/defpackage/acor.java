package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import java.util.UUID;

/* renamed from: acor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acor implements ivb {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public acor(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        TokenResponse tokenResponse;
        Integer num = (Integer) obj;
        Context context = this.a;
        String str = this.b;
        String str2 = this.c;
        iva.a((Object) context);
        iva.a((Object) str);
        iva.c(str2);
        if (!acds.a(context, "com.google").contains(str)) {
            iva.a((Object) context);
            iva.a((Object) str);
            iva.c(str2);
            gck gck = new gck(context);
            Context applicationContext = context.getApplicationContext();
            String uuid = UUID.randomUUID().toString();
            AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
            AccountCredentials accountCredentials = new AccountCredentials("com.google");
            accountCredentials.c = str;
            accountCredentials.e = str2;
            accountSignInRequest.f = accountCredentials;
            accountSignInRequest.b = new AppDescription(applicationContext.getPackageName(), applicationContext.getApplicationInfo().uid, uuid, uuid);
            tokenResponse = gck.a(accountSignInRequest);
        } else {
            iva.a((Object) context);
            iva.a((Object) str);
            iva.c(str2);
            gck gck2 = new gck(context);
            UpdateCredentialsRequest updateCredentialsRequest = new UpdateCredentialsRequest();
            AccountCredentials accountCredentials2 = new AccountCredentials("com.google");
            accountCredentials2.c = str;
            accountCredentials2.e = str2;
            updateCredentialsRequest.b = accountCredentials2;
            tokenResponse = gck2.a(updateCredentialsRequest);
        }
        if (tokenResponse == null) {
            AccountChallengeWebView.a.e("TokenResponse was null", new Object[0]);
            return true;
        }
        gei b2 = tokenResponse.b();
        if (b2 == gei.SUCCESS) {
            AccountChallengeWebView.a.a("Successfully updated account", new Object[0]);
            return false;
        }
        AccountChallengeWebView.a.e("Failed adding account %s", b2.ac);
        if (gei.b(b2)) {
            return true;
        }
        AccountChallengeWebView.a.e("Unrecoverable error", new Object[0]);
        return false;
    }
}
