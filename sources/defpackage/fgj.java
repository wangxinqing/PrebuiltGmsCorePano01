package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: fgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgj {
    public Account a;
    private final Credential b;

    public fgj(Credential credential) {
        this.b = credential;
    }

    public final InternalCredentialWrapper a() {
        return new InternalCredentialWrapper(this.b, this.a);
    }
}
