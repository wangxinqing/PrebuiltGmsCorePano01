package defpackage;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgs implements afea, aerg, aeux {
    private final Map a = new HashMap();
    private final pgt b;

    public pgs(pgt pgt) {
        this.b = pgt;
    }

    private static boolean a(aukh aukh) {
        if (aukh.a != 2) {
            return false;
        }
        auku a2 = auku.a(((aukv) aukh.b).d);
        if (a2 == null) {
            a2 = auku.UNKNOWN;
        }
        return a2 == auku.SYNC_FULL_SNAPSHOT;
    }

    public final void a(String str, aukh aukh, Account account) {
    }

    public final void b(aukh aukh, Account account) {
        if (a(aukh)) {
            a(aukh, account).a();
        }
    }

    public final boolean c(aukh aukh, Account account) {
        boolean z;
        pgr a2 = a(aukh, account);
        synchronized (a2.a) {
            z = !a2.a.isEmpty();
        }
        return z;
    }

    public final void b(String str, aukh aukh, Account account) {
        if (a(aukh)) {
            a(aukh, account).a();
        }
    }

    public final pgr a(aukh aukh, Account account) {
        aukv aukv;
        boolean z;
        pgr pgr;
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku a2 = auku.a(aukv.d);
        if (a2 == null) {
            a2 = auku.UNKNOWN;
        }
        if (a2 == auku.SYNC_FULL_SNAPSHOT) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        aerd a3 = aerd.a(account, aukh);
        synchronized (this.a) {
            pgr = (pgr) this.a.get(a3);
            if (pgr == null) {
                pgt pgt = this.b;
                pia b2 = pdn.b();
                pgt.a(b2, 1);
                afeb afeb = (afeb) pgt.a.a();
                pgt.a(afeb, 2);
                aevl aevl = (aevl) pgt.b.a();
                pgt.a(aevl, 3);
                aepp aepp = (aepp) pgt.c.a();
                pgt.a(aepp, 4);
                awdn awdn = (awdn) pgt.d.a();
                pgt.a(awdn, 5);
                pgt.a(a3, 6);
                pgr pgr2 = new pgr(b2, afeb, aevl, aepp, awdn, a3);
                this.a.put(a3, pgr2);
                pgr = pgr2;
            }
        }
        return pgr;
    }

    public final void a(afdx afdx) {
        afdx.a();
        Account b2 = afdx.b();
        aukh c = afdx.c();
        if (a(c)) {
            a(c, b2).a();
        }
    }

    public final void a(afdx afdx, afdx afdx2) {
        if ((afdx == null || !afdx.e().equals(afdx2.e()) || !afdx.d().equals(afdx2.d())) && a(afdx2.c())) {
            a(afdx2.c(), afdx2.b()).a();
        }
    }
}
