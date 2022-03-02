package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;

/* renamed from: pky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pky implements pjn {
    private final Account a;
    private final ifu b;
    private final afdw c;

    public pky(afeb afeb, String str, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter, ifu ifu) {
        int i3 = i;
        int i4 = i2;
        this.c = new afdw(pcy.a(syncPolicy), afeb, str, account, aeuz.a(i, i2, auku.SYNC_LATEST_PER_SECONDARY_ID), aeuz.a(pga.a(latestFootprintFilter)));
        this.b = ifu;
        this.a = account;
    }

    public final aukh a() {
        return this.c.a;
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final Account c() {
        return this.a;
    }

    public final boolean d() {
        return true;
    }

    public final void e() {
        try {
            this.c.a();
            this.b.a(Status.a);
        } catch (aepg e) {
            this.b.a(pku.a(getClass().getSimpleName(), e));
        }
    }

    public final void a(Status status) {
        this.b.a(status);
    }

    public pky(afeb afeb, String str, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, ifu ifu) {
        aesl a2 = pcy.a(syncPolicy);
        int i3 = i;
        int i4 = i2;
        aukh a3 = aeuz.a(i, i2, auku.SYNC_FULL_SNAPSHOT);
        aeti a4 = pga.a(timeSeriesFootprintsSubscriptionFilter);
        aucd o = aukf.c.o();
        aumy a5 = aeuz.a(a4);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukf aukf = (aukf) o.b;
        a5.getClass();
        aukf.b = a5;
        aukf.a = 2;
        this.c = new afdw(a2, afeb, str, account, a3, (aukf) o.i());
        this.b = ifu;
        this.a = account;
    }
}
