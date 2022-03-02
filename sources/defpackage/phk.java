package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: phk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phk extends pgv {
    private final pgm e;
    private final ifu f;
    private final String g;
    private final LatestFootprintFilter h;
    private final sah i;

    public phk(pgm pgm, String str, Account account, int i2, int i3, LatestFootprintFilter latestFootprintFilter, sah sah, ifu ifu) {
        super(account, i2, i3, auku.SYNC_LATEST_PER_SECONDARY_ID);
        this.g = str;
        this.e = pgm;
        this.h = latestFootprintFilter;
        this.i = sah;
        this.f = ifu;
    }

    public final void a(Status status) {
        this.f.a(status);
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final void e() {
        this.e.a(a(), this.a, this.g, this.h, this.i);
        this.f.a(Status.a);
    }
}
