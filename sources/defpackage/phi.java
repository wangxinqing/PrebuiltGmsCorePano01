package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: phi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phi extends pgv {
    private static final int e = aulx.d.a();
    private final pgm f;
    private final ifu g;
    private final String h;
    private final sah i;
    private final LatestFootprintFilter j;

    public phi(pgm pgm, String str, Account account, int i2, sah sah, ifu ifu) {
        super(account, 553, e, auku.SYNC_LATEST_PER_SECONDARY_ID);
        this.h = str;
        this.f = pgm;
        this.g = ifu;
        byte[] bytes = String.valueOf(i2).getBytes(amqn.c);
        ryc a = LatestFootprintFilter.a();
        a.a(bytes, 1);
        this.j = a.a();
        this.i = sah;
    }

    public final void a(Status status) {
        this.g.a(status);
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final void e() {
        this.f.a(a(), this.a, this.h, this.j, this.i);
        this.g.a(Status.a);
    }
}
