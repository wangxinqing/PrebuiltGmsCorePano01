package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: phq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phq extends pgv {
    private final pgs e;
    private final ifu f;
    private final saw g;

    public phq(pgs pgs, Account account, int i, int i2, saw saw, ifu ifu) {
        super(account, i, i2, auku.SYNC_FULL_SNAPSHOT);
        this.e = pgs;
        this.g = saw;
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
        saw saw = this.g;
        pgr a2 = pgs.a(a, account);
        synchronized (a2.a) {
            pgp pgp = (pgp) a2.a.remove(saw.a);
            if (pgp != null) {
                pgp.a();
            }
        }
        this.f.a(Status.a);
    }
}
