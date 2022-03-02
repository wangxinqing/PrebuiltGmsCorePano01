package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: phm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phm extends pgv {
    private final pgs e;
    private final ifu f;
    private final String g;
    private final saw h;

    public phm(pgs pgs, String str, Account account, int i, int i2, saw saw, ifu ifu) {
        super(account, i, i2, auku.SYNC_FULL_SNAPSHOT);
        this.g = str;
        this.e = pgs;
        this.h = saw;
        this.f = ifu;
    }

    public final void a(Status status) {
        this.f.a(status);
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final void e() {
        pgs pgs = this.e;
        aukh a = a();
        Account account = this.a;
        String str = this.g;
        saw saw = this.h;
        pgr a2 = pgs.a(a, account);
        synchronized (a2.a) {
            pgp pgp = (pgp) a2.a.get(saw.a);
            if (pgp == null) {
                a2.a.put(saw.a, new pgp(a2, str, saw));
            } else {
                amrl.a(str.equals(pgp.a));
            }
        }
        a2.a();
        this.f.a(Status.a);
    }
}
