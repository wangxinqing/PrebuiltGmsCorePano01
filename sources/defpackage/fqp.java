package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: fqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fqp implements amrm {
    private final Credential a;

    public fqp(Credential credential) {
        this.a = credential;
    }

    public final boolean a(Object obj) {
        return ((Account) obj).name.equals(this.a.a);
    }
}
