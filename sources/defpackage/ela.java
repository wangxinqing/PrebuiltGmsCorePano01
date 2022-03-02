package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ela  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ela {
    public static final iwd a = ehv.a("AccountStateSyncher");
    public final Context b;
    private final ekz c;
    private final eny d = ((eny) eny.a.b());

    public ela(Context context) {
        new ild(context);
        ekz ekz = new ekz(context);
        this.b = context;
        this.c = ekz;
    }

    public final void a(Account account) {
        try {
            avpn a2 = this.c.a(account, ent.aE());
            HashSet hashSet = new HashSet(a2.b);
            if (hashSet.isEmpty()) {
                a.e("Something bad went wrong. Don't unset all the services in this case.", new Object[0]);
            } else if (!hashSet.equals((Set) this.d.a(account, eqb.f))) {
                this.d.b(account, eqb.f, hashSet);
            }
            if (TextUtils.equals(account.name, a2.a)) {
                a.c("Skipping rename because the lookup contains the same email.", new Object[0]);
                return;
            }
            a.c("Renaming account as primary email different from existing account", new Object[0]);
            this.c.b(account, a2.a);
        } catch (IOException e) {
            a.d("Unable to look up account state from server.", e, new Object[0]);
        }
    }
}
