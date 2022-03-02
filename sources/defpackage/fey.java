package defpackage;

import android.app.Application;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: fey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fey extends bp {
    private final Application a;
    private final String b;
    private final String c;
    private final String d;
    private final oq e;
    private final SavePasswordRequest f;

    public fey(Application application, String str, String str2, String str3, oq oqVar, SavePasswordRequest savePasswordRequest) {
        this.a = application;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = oqVar;
        this.f = savePasswordRequest;
    }

    public final bl a(Class cls) {
        Application application = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        SavePasswordRequest savePasswordRequest = this.f;
        oq oqVar = this.e;
        new hol(application, "IDENTITY_GMSCORE", (String) null);
        return (bl) cls.cast(new fez(application, str, str2, str3, savePasswordRequest, oqVar));
    }
}
