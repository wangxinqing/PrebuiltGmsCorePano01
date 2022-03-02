package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: xsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsi implements Callable {
    private final xsj a;

    public xsi(xsj xsj) {
        this.a = xsj;
    }

    public final Object call() {
        xsj xsj = this.a;
        xsk xsk = xsj.i;
        List d = jgu.d(xsk.a, xsk.b);
        if (d.isEmpty()) {
            return null;
        }
        if (!jlh.d(xsj.h)) {
            Account account = new Account(xsj.h, "com.google");
            if (d.contains(account)) {
                xsj.h = null;
                return account;
            }
        }
        String a2 = xsj.a.a();
        if (TextUtils.isEmpty(a2)) {
            return (Account) d.get(0);
        }
        Account account2 = new Account(a2, "com.google");
        if (d.contains(account2)) {
            return account2;
        }
        return (Account) d.get(0);
    }
}
