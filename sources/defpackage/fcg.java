package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: fcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fcg {
    public static amzy a() {
        amzt j = amzy.j();
        for (Account a : qub.a((Context) ihs.b()).a("com.google")) {
            j.c(a(a));
        }
        return j.a();
    }

    public static pyv a(Account account) {
        try {
            return pyv.a(ihs.b(), account);
        } catch (eif e) {
            throw qbf.a(e);
        }
    }
}
