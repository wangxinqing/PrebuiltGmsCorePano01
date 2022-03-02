package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.common.api.Status;

/* renamed from: eqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqt extends nis {
    private final Account a;
    private final eqk b;
    private final eoz c;

    public eqt(eoz eoz, eqk eqk, Account account) {
        super(153, "GetGoogleAccountData");
        this.c = eoz;
        this.a = account;
        this.b = eqk;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        GoogleAccountData a2 = this.b.a(context).a(this.a);
        if (a2 != null) {
            this.c.a(Status.a, a2);
            return;
        }
        eqj eqj = new eqj(5);
        eqj.b = String.format("Account '%s' does not exist.", new Object[]{this.a});
        throw eqj.a();
    }

    public final void a(Status status) {
        this.c.a(status, (GoogleAccountData) null);
    }
}
