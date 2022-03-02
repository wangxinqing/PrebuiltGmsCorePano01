package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: eqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqx extends nis {
    private final Account a;
    private final eom b;

    public eqx(eom eom, Account account) {
        super(224, "removeAccountGoogleAuthOperation");
        this.b = eom;
        this.a = account;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        qub a2 = qub.a(context);
        iwd a3 = ehv.a("RemoveAccountOperation");
        try {
            this.b.a(Status.a, (Bundle) a2.d(this.a).getResult(5, TimeUnit.SECONDS));
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            a3.d("Failed to remove %s account", e, this.a);
            eqj eqj = new eqj(10);
            eqj.a = e;
            throw eqj.a();
        }
    }

    public final void a(Status status) {
        this.b.a(status, (Bundle) null);
    }
}
