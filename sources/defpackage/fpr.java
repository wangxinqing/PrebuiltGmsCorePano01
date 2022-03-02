package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: fpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpr implements amqy {
    static final amqy a = new fpr();

    private fpr() {
    }

    public final Object a(Object obj) {
        int i = fqe.h;
        Account account = ((InternalCredentialWrapper) obj).b;
        amrl.a((Object) account);
        return account;
    }
}
