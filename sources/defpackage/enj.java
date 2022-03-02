package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: enj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class enj {
    public static final iwd a = ehv.a("UpdateCredentialsOperation");
    public final Context b;
    public final AccountCredentials c;
    public final CaptchaSolution d;
    public final eny e;
    public final emv f;
    public final ekq g;

    public enj(Context context, AccountCredentials accountCredentials, CaptchaSolution captchaSolution) {
        ekq ekq = (ekq) ekq.b.b();
        eny eny = (eny) eny.a.b();
        emv emv = new emv(context);
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) eny);
        this.e = eny;
        iva.a((Object) accountCredentials);
        this.c = accountCredentials;
        iva.a((Object) ekq);
        this.g = ekq;
        iva.a((Object) emv);
        this.f = emv;
        this.d = captchaSolution;
    }
}
