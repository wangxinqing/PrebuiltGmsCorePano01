package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* renamed from: ezk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezk extends fsx implements niz {
    public static final iwd a = ehv.b("AuthorizationServiceImpl");
    private final Context b;
    private final nix c;
    private final String d;
    private final frv e;

    public ezk(Context context, nix nix, String str, frv frv) {
        this.b = context;
        this.c = nix;
        this.d = str;
        this.e = frv;
    }

    public final void a(fsw fsw, AuthorizationRequest authorizationRequest) {
        String b2 = awns.a.a().b();
        String str = this.d;
        fdb a2 = fdc.a(new fng(str, b2, new ezo(this.b, str, authorizationRequest.g, authorizationRequest)), 219, "Authorize", this.e.a);
        this.c.a(a2);
        aorl.a(a2.a, new ezj(fsw), aoqm.a);
    }
}
