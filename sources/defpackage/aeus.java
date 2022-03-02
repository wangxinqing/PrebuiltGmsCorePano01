package defpackage;

import android.accounts.Account;
import java.util.Map;

/* renamed from: aeus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeus implements aerf {
    final Map a;

    public aeus(Map map) {
        this.a = map;
    }

    public final boolean a(aukh aukh, Account account) {
        aukv aukv;
        Map map = this.a;
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku a2 = auku.a(aukv.d);
        if (a2 == null) {
            a2 = auku.UNKNOWN;
        }
        aeux aeux = (aeux) map.get(a2);
        if (aeux != null) {
            return aeux.c(aukh, account);
        }
        return false;
    }
}
