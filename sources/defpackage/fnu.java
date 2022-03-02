package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: fnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fnu implements aoqb {
    private final fnv a;
    private final fde b;

    public fnu(fnv fnv, fde fde) {
        this.a = fnv;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fnv fnv = this.a;
        fde fde = this.b;
        Context context = fnv.a;
        String str = fnv.b;
        CredentialRequest credentialRequest = fnv.c;
        return new fmb(context, str, (amzy) obj, credentialRequest.b, credentialRequest.a()).a(fde);
    }
}
