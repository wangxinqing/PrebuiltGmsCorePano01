package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import java.util.concurrent.Executor;

/* renamed from: fnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fnv implements fcu {
    public final Context a;
    public final String b;
    public final CredentialRequest c;

    public fnv(Context context, String str, CredentialRequest credentialRequest) {
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) str);
        this.b = str;
        iva.a((Object) credentialRequest);
        this.c = credentialRequest;
    }

    public final aorr a(fde fde) {
        return aopr.a(new fmo(this.a).a(fde), (aoqb) new fnu(this, fde), (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_LIST_CREDENTIALS_FOR_ENABLED_ACCOUNTS;
    }
}
