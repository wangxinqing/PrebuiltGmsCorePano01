package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: fpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpa implements aoqb {
    private final fpl a;
    private final fde b;

    public fpa(fpl fpl, fde fde) {
        this.a = fpl;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fpl fpl = this.a;
        fde fde = this.b;
        amzy amzy = (amzy) obj;
        if (!amzy.isEmpty()) {
            Context context = fpl.a;
            String str = fpl.c;
            CredentialRequest credentialRequest = fpl.d;
            return new fmb(context, str, amzy, credentialRequest.b, credentialRequest.a()).a(fde);
        }
        throw qbf.a(28434);
    }
}
