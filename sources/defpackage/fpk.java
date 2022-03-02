package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.concurrent.Executor;

/* renamed from: fpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpk implements aoqb {
    private final fpl a;
    private final Boolean b;
    private final amzy c;

    public fpk(fpl fpl, Boolean bool, amzy amzy) {
        this.a = fpl;
        this.b = bool;
        this.c = amzy;
    }

    public final aorr a(Object obj) {
        fpl fpl = this.a;
        Boolean bool = this.b;
        amzy amzy = this.c;
        if (!((Boolean) obj).booleanValue()) {
            return fpl.a(bool.booleanValue());
        }
        InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) anbs.b(amzy);
        boolean booleanValue = bool.booleanValue();
        Account account = internalCredentialWrapper.b;
        iva.a((Object) account);
        fis fis = fpl.b;
        pyv a2 = fcg.a(account);
        String str = fpl.c;
        Credential credential = internalCredentialWrapper.a;
        CredentialRequest credentialRequest = fpl.d;
        return aopr.a(fis.a(a2, str, credential, credentialRequest.f, (String) amrh.a(credentialRequest.g, str), fpl.d.h), (amqy) new fpg(fpl, booleanValue, internalCredentialWrapper), (Executor) aoqm.a);
    }
}
