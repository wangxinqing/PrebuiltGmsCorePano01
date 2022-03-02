package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: fik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fik implements fcu {
    public final String a;
    public final fjw b;
    public final fcb c;
    private final Context d;

    public fik(Context context, String str, SavePasswordRequest savePasswordRequest) {
        this.d = context;
        this.a = str;
        this.b = fjw.a(context);
        this.c = new fcb(savePasswordRequest.a.a.toLowerCase(Locale.US), "");
    }

    public final aorr a(fde fde) {
        return aopr.a(new fmi(this.d, this.a).a(fde), (aoqb) new fic(this, fde), (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_MATCH_PASSWORD;
    }
}
