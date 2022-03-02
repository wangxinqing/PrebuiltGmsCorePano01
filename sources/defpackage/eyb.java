package defpackage;

import android.app.Application;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: eyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eyb extends bp {
    private final Application a;
    private final String b;
    private final BeginSignInRequest c;
    private final oq d;
    private final String e;

    public eyb(Application application, String str, oq oqVar, BeginSignInRequest beginSignInRequest, String str2) {
        this.a = application;
        this.b = str;
        this.d = oqVar;
        this.c = beginSignInRequest;
        this.e = str2;
    }

    public final bl a(Class cls) {
        Application application = this.a;
        return (bl) cls.cast(new eyf(application, this.b, this.d, this.c, this.e, new hol(application, "IDENTITY_GMSCORE", (String) null)));
    }
}
