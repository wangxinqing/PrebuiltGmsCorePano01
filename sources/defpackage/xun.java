package defpackage;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xun {
    public final Map a = new HashMap();
    private final iby b;

    public xun(iby iby) {
        this.b = iby;
    }

    public final as a(Account account) {
        aw awVar = (aw) this.a.get(account);
        if (awVar != null) {
            return awVar;
        }
        aw awVar2 = new aw();
        this.a.put(account, awVar2);
        if (!ayqr.a.a().l()) {
            awVar2.b(xus.b(account.name));
        } else {
            this.b.a((wkz) null).a((icm) new xum(this, awVar2, account));
        }
        return awVar2;
    }
}
