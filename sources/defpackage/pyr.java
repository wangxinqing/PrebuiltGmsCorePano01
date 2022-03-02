package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyr {
    private final Context a;
    private final AccountManager b;

    public pyr(Context context) {
        iva.a((Object) context);
        this.a = context;
        this.b = AccountManager.get(context);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList(r2);
        for (Account a2 : this.b.getAccountsByType("com.google")) {
            arrayList.add(pyv.a(this.a, a2));
        }
        return arrayList;
    }
}
