package defpackage;

import android.accounts.Account;
import com.google.android.gms.mdh.LatestFootprintFilter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgm implements afea, aerg, aeux {
    private final Map a = new HashMap();
    private final pgk b;

    public pgm(pgk pgk) {
        this.b = pgk;
    }

    private static boolean a(aukh aukh) {
        if (aukh.a != 2) {
            return false;
        }
        auku a2 = auku.a(((aukv) aukh.b).d);
        if (a2 == null) {
            a2 = auku.UNKNOWN;
        }
        return a2 == auku.SYNC_LATEST_PER_SECONDARY_ID;
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
        pgj a2 = a(aukh, account);
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

    public final pgj a(aukh aukh, Account account) {
        aukv aukv;
        boolean z;
        pgj pgj;
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku a2 = auku.a(aukv.d);
        if (a2 == null) {
            a2 = auku.UNKNOWN;
        }
        if (a2 == auku.SYNC_LATEST_PER_SECONDARY_ID) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        aerd a3 = aerd.a(account, aukh);
        synchronized (this.a) {
            pgj = (pgj) this.a.get(a3);
            if (pgj == null) {
                pgk pgk = this.b;
                pia b2 = pdn.b();
                pgk.a(b2, 1);
                afeb afeb = (afeb) pgk.a.a();
                pgk.a(afeb, 2);
                aeva aeva = (aeva) pgk.b.a();
                pgk.a(aeva, 3);
                aepp aepp = (aepp) pgk.c.a();
                pgk.a(aepp, 4);
                awdn awdn = (awdn) pgk.d.a();
                pgk.a(awdn, 5);
                pgk.a(a3, 6);
                pgj pgj2 = new pgj(b2, afeb, aeva, aepp, awdn, a3);
                this.a.put(a3, pgj2);
                pgj = pgj2;
            }
        }
        return pgj;
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

    public final void a(aukh aukh, Account account, String str, LatestFootprintFilter latestFootprintFilter, sah sah) {
        pgj a2 = a(aukh, account);
        aeta a3 = pga.a(latestFootprintFilter);
        synchronized (a2.a) {
            pgh pgh = (pgh) a2.a.get(sah.asBinder());
            if (pgh == null) {
                a2.a.put(sah.asBinder(), new pgh(a2, str, a3, sah));
            } else {
                amrl.a(str.equals(pgh.a));
                if (!a3.equals(pgh.d)) {
                    pgh.d = a3;
                    pgh.a();
                }
            }
        }
        a2.a();
    }
}
