package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: afaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afaj implements afai, aerj {
    private static final aukf b = aukf.c;
    private final Object c = new Object();
    private final awdn d;
    private final aeri e;
    private final affw f;
    private final afeb g;
    private final aump h;
    private final aoqd i = aoqd.a();

    public afaj(awdn awdn, aeri aeri, afeb afeb, affw affw) {
        this.d = awdn;
        this.e = aeri;
        this.f = affw;
        this.g = afeb;
        aesn c2 = aeso.c();
        c2.a(true);
        c2.a((int) TimeUnit.DAYS.toSeconds(1));
        aeso a = c2.a();
        aesn c3 = aeso.c();
        c3.a(true);
        c3.a(((Integer) ozz.D.c()).intValue());
        aeso a2 = c3.a();
        aesk i2 = aesl.i();
        i2.a(2);
        i2.a(a);
        i2.b(a);
        i2.c(a2);
        i2.d(a2);
        i2.a(false);
        i2.b(false);
        this.h = afgu.a(i2.a());
    }

    public final void a() {
    }

    public final void a(Account account, aukh aukh) {
    }

    public final void b(Account account) {
        e(account);
    }

    public final long c(Account account) {
        return this.i.a(account);
    }

    public final boolean d(Account account) {
        return !this.f.b(a, account);
    }

    /* access modifiers changed from: package-private */
    public final void e(Account account) {
        if (this.e.q()) {
            pia pia = (pia) this.d.a();
            new Object[1][0] = account;
            synchronized (this.c) {
                this.g.a("", account, a, this.h, b);
                this.i.c(account);
            }
            this.f.b("", a, account);
        }
    }

    public final void a(Account account) {
        e(account);
    }

    public final void a(Account account, long j) {
        aump d2;
        synchronized (this.c) {
            if (this.i.a(account) == j) {
                Iterator it = this.g.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        afdx afdx = (afdx) it.next();
                        if (account.equals(afdx.b()) && (d2 = afdx.d()) != null && afgu.a(d2)) {
                            break;
                        }
                    } else {
                        pia pia = (pia) this.d.a();
                        new Object[1][0] = account;
                        this.g.a("", account, a, afdz.REGISTRATION_CLEANUP);
                        break;
                    }
                }
            }
        }
    }
}
