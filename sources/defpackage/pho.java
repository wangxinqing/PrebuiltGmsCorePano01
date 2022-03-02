package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: pho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pho extends pgv {
    private final pgm e;
    private final ifu f;
    private final sah g;

    public pho(pgm pgm, Account account, int i, int i2, sah sah, ifu ifu) {
        super(account, i, i2, auku.SYNC_LATEST_PER_SECONDARY_ID);
        this.e = pgm;
        this.g = sah;
        this.f = ifu;
    }

    public final void a(Status status) {
        this.f.a(status);
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final void e() {
        pgm pgm = this.e;
        aukh a = a();
        Account account = this.a;
        sah sah = this.g;
        pgj a2 = pgm.a(a, account);
        synchronized (a2.a) {
            pgh pgh = (pgh) a2.a.remove(sah.asBinder());
            if (pgh != null) {
                pgh.a();
            }
        }
        this.f.a(Status.a);
    }
}
