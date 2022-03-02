package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: fne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fne implements amqy {
    static final amqy a = new fne();

    private fne() {
    }

    public final Object a(Object obj) {
        InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) obj;
        Credential credential = internalCredentialWrapper.a;
        Account account = internalCredentialWrapper.b;
        iva.a((Object) account);
        return new InternalSignInCredentialWrapper(account, new SignInCredential(credential.a, credential.b, credential.g, credential.h, credential.c, credential.e, (String) null), amzy.h(), false);
    }
}
