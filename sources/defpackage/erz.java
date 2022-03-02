package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: erz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erz extends nis {
    private static final iwd a = ehv.a("RemoveWorkAccountAsyncOp");
    private final qub b;
    private final Account c;
    private final ejb d;

    public erz(qub qub, Account account, ejb ejb) {
        super(120, "RemoveWorkAccountAsyncOp");
        this.b = qub;
        this.c = account;
        this.d = ejb;
    }

    private final boolean a(Account account) {
        try {
            return ((Bundle) this.b.d(account).getResult(5, TimeUnit.SECONDS)).getBoolean("booleanResult");
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            a.d("Failed to remove %s account", e, account);
            return false;
        }
    }

    private final boolean b(Account account) {
        try {
            return ((Boolean) this.b.c(account).getResult(5, TimeUnit.SECONDS)).booleanValue();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            a.d("Failed to remove %s account", e, account);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = a(this.c);
        } else {
            z = b(this.c);
        }
        ejb ejb = this.d;
        Parcel aQ = ejb.aQ();
        bhx.a(aQ, z);
        ejb.c(2, aQ);
    }
}
