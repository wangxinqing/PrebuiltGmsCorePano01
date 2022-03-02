package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.service.SignInChimeraService;
import com.google.android.gms.common.api.Scope;

/* renamed from: fxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxe extends fws implements niz {
    public final String a;
    public final hol b;
    private final Context c;
    private final String d;
    private final nix e;

    public fxe(Context context, String str, Scope[] scopeArr, abai abai, nix nix, hol hol) {
        this.c = context;
        iva.c(str);
        this.d = str;
        iva.a((Object) nix);
        this.e = nix;
        String str2 = abai.g;
        if (str2 == null) {
            this.a = qbw.a();
        } else {
            this.a = str2;
        }
        this.b = hol;
        if (azgq.b()) {
            this.b.a((audx) qcy.a(str, scopeArr, abai)).b();
        }
        iwd iwd = SignInChimeraService.a;
        String valueOf = String.valueOf(this.a);
        iwd.b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
    }

    public final void a(fwq fwq, GoogleSignInOptions googleSignInOptions) {
        Context context = this.c;
        fvt fvt = new fvt(googleSignInOptions);
        fvt.b = this.a;
        this.e.a(new fxb(fwq, context, fvt.a(), this.d));
    }

    public final void b(fwq fwq, GoogleSignInOptions googleSignInOptions) {
        this.e.a(new fwz(fwq, this.d));
    }

    public final void c(fwq fwq, GoogleSignInOptions googleSignInOptions) {
        fvt fvt = new fvt(googleSignInOptions);
        fvt.b = this.a;
        GoogleSignInOptions a2 = fvt.a();
        String str = this.d;
        izb izb = new izb(ihs.b(), (String) fvx.a.c(), (String) fvx.b.c(), false, true, (String) null, (String) null);
        izb.g = 4101;
        this.e.a(new fwy(fwq, a2, str, izb));
    }
}
