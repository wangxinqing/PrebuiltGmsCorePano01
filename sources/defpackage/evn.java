package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: evn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evn extends ftx implements niz {
    public static final iwd a = ehv.b("AssistedSignInServiceImpl");
    private final Context b;
    private final nix c;
    private final String d;
    private final hol e;
    private final fsu f;

    public evn(Context context, nix nix, hol hol, String str, fsu fsu) {
        this.b = context;
        this.c = nix;
        this.d = str;
        this.f = fsu;
        this.e = hol;
    }

    private final void a(String str, fcu fcu, String str2, evo evo, String str3) {
        fdb a2 = fdc.a(new fng(this.d, str, fcu), 212, str2, str3);
        this.c.a(a2);
        aorl.a(a2.a, new evm(evo), aoqm.a);
    }

    public final void a(fsz fsz, BeginSignInRequest beginSignInRequest) {
        String b2 = awns.b();
        String str = (String) amrh.a(beginSignInRequest.c, this.f.a);
        evq evq = new evq(this.b, this.d, str, beginSignInRequest, this.e);
        fsz.getClass();
        a(b2, evq, "BeginSignIn", new evj(fsz), str);
    }

    public final void a(ftl ftl, GetSignInIntentRequest getSignInIntentRequest) {
        String e2 = awns.a.a().e();
        evr evr = new evr(this.b, getSignInIntentRequest);
        ftl.getClass();
        a(e2, evr, "GetSignInIntent", new evl(ftl), getSignInIntentRequest.c);
    }

    public final void a(ifu ifu, String str) {
        String b2 = awns.b();
        String str2 = (String) amrh.a(str, this.f.a);
        a(b2, new evs(this.b, this.d, this.e, str2), "SignOut", new evk(ifu), str2);
    }
}
