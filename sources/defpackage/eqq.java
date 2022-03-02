package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: eqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqq extends nis {
    private final Account a;
    private final eqk b;
    private final eos c;

    public eqq(eos eos, eqk eqk, Account account) {
        super(153, "GetAccountId");
        this.c = eos;
        this.a = account;
        this.b = eqk;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        String b2 = this.b.a(context).b(this.a);
        if (!b2.isEmpty()) {
            this.c.a(Status.a, b2);
            return;
        }
        eqj eqj = new eqj(5);
        eqj.b = "Account id is empty.";
        throw eqj.a();
    }

    public final void a(Status status) {
        this.c.a(status, "");
    }
}
