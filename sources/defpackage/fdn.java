package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: fdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdn extends ftd implements niz {
    public static final iwd a = ehv.b("CredentialSavingServiceImpl");
    private final Context b;
    private final nix c;
    private final String d;
    private final String e;
    private final fsc f;
    private final amri g;

    public fdn(Context context, nix nix, String str, String str2, fsc fsc, amri amri) {
        this.b = context;
        this.c = nix;
        this.d = str;
        this.e = str2;
        this.f = fsc;
        this.g = amri;
    }

    public final void a(ftv ftv, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        ((fhd) fhd.a.a()).b.put(new fhc(saveAccountLinkingTokenRequest.e, this.e), saveAccountLinkingTokenRequest);
        String d2 = awns.a.a().d();
        String str = this.e;
        fdb a2 = fdc.a(new fng(str, d2, new fdo(this.b, str, saveAccountLinkingTokenRequest.e, saveAccountLinkingTokenRequest)), 223, "SaveAccountLinkingToken", saveAccountLinkingTokenRequest.e);
        this.c.a(a2);
        aorl.a(a2.a, new fdl(ftv), aoqm.a);
    }

    public final void a(ftw ftw, SavePasswordRequest savePasswordRequest) {
        String c2 = awns.a.a().c();
        String str = (String) amrh.a(savePasswordRequest.b, this.f.a);
        fdq fdq = new fdq(this.b, savePasswordRequest, this.d, str, this.g);
        ftw.getClass();
        fdk fdk = new fdk(ftw);
        fdb a2 = fdc.a(new fng(this.e, c2, fdq), 223, "SavePassword", str);
        this.c.a(a2);
        aorl.a(a2.a, new fdm(fdk), aoqm.a);
    }
}
