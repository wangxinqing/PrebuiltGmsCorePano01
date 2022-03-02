package defpackage;

import android.accounts.Account;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: achg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class achg implements acvf {
    private final Account a;

    public achg(Account account) {
        this.a = account;
    }

    public final Object a(acwa acwa) {
        Account account = this.a;
        iwd iwd = achr.a;
        return new UserBootstrapInfo(account.name, (byte[]) acwa.d());
    }
}
