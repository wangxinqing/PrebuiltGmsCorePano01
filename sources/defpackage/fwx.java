package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: fwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class fwx extends nis {
    protected static final iwd a = new iwd("Auth.Api.SignIn", "BaseGoogleSignInOperation");
    protected final String b;
    protected final GoogleSignInOptions c;
    protected final fwq d;

    public fwx(fwq fwq, GoogleSignInOptions googleSignInOptions, String str, String str2) {
        super(91, str2);
        iva.a((Object) fwq);
        this.d = fwq;
        this.c = googleSignInOptions;
        iva.c(str);
        this.b = str;
    }
}
