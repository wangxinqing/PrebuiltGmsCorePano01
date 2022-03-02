package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.concurrent.Executor;

/* renamed from: fdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdq implements fcu {
    public final SavePasswordRequest a;
    public final String b;
    private final Context c;
    private final String d;
    private final amri e;

    public fdq(Context context, SavePasswordRequest savePasswordRequest, String str, String str2, amri amri) {
        this.c = context;
        this.a = savePasswordRequest;
        this.d = str;
        this.b = str2;
        this.e = amri;
    }

    public final aorr a(fde fde) {
        if (awoh.a.a().a() ? ((fha) fha.a.a()).b(this.d) : !((Boolean) fdh.a.c()).booleanValue() || !jkr.e() || !this.e.a() || !((pzr) this.e.b()).a.hasEnabledAutofillServices()) {
            return aopr.a(new fmi(this.c, this.d).a(fde), (aoqb) new fdp(this), (Executor) aoqm.a);
        }
        return aorl.a((Throwable) qbf.a(28431));
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_SAVE_SIGNIN_PASSWORD;
    }
}
