package defpackage;

import android.accounts.Account;
import com.google.android.gms.location.reporting.OptInRequest;

/* renamed from: rlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlx {
    public final Account a;
    public String b;
    public String c;

    public rlx(Account account) {
        iva.a((Object) account, (Object) "account");
        this.a = account;
    }

    public final OptInRequest a() {
        return new OptInRequest(this);
    }
}
