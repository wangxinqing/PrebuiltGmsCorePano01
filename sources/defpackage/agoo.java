package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: agoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agoo {
    private final hol a;

    public agoo(Context context) {
        this.a = a(context, avrp.FPOP_CLIENT.name(), (String) null);
    }

    protected static final hol a(Context context, String str, String str2) {
        return new hol(context, str, str2);
    }

    public agoo(Context context, Account account) {
        this.a = a(context, avrp.FPOP_CLIENT.name(), account.name);
    }

    public final void a(int i, atwz atwz) {
        hoi a2 = this.a.a(atwz.k());
        a2.b(i - 1);
        a2.b();
    }
}
