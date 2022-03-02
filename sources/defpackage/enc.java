package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: enc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class enc {
    public final Context a;
    public final emj b;
    public final AppDescription c;
    public final AccountCredentials d;
    public final GoogleAccountSetupRequest e;
    public final CaptchaSolution f;

    public enc(Context context, AppDescription appDescription, AccountCredentials accountCredentials, GoogleAccountSetupRequest googleAccountSetupRequest, CaptchaSolution captchaSolution) {
        emj emj = new emj(context);
        new elr(context);
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) emj);
        this.b = emj;
        iva.a((Object) appDescription);
        this.c = appDescription;
        iva.a((Object) accountCredentials);
        this.d = accountCredentials;
        iva.a((Object) googleAccountSetupRequest);
        this.e = googleAccountSetupRequest;
        this.f = captchaSolution;
    }
}
