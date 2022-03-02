package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import java.io.IOException;

/* renamed from: pel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pel implements pjl {
    private final ifu a;
    private final Account b;
    private final int c;
    private final int d;
    private final TimeSeriesFootprintsSubscriptionFilter e;
    private final SyncStatus f;
    private final afgs g;
    private final aevl h;

    public pel(ifu ifu, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, afgs afgs, SyncStatus syncStatus, aevl aevl) {
        this.a = ifu;
        this.b = account;
        this.c = i;
        this.d = i2;
        this.e = timeSeriesFootprintsSubscriptionFilter;
        this.f = syncStatus;
        this.g = afgs;
        this.h = aevl;
    }

    public final void a() {
        Throwable th;
        afdp b2;
        Throwable th2;
        try {
            aevm a2 = this.h.a(this.b, this.c, this.d);
            try {
                b2 = a2.c().b();
                int intValue = ((Integer) this.g.a()).intValue();
                SyncStatus syncStatus = this.f;
                a2.a(b2, pga.a(this.e), this.f.b * 1000, intValue, syncStatus.a * 1000, syncStatus.c * 1000);
                aucd o = aumr.c.o();
                aucd o2 = aulc.c.o();
                long j = this.f.c * 1000;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aulc aulc = (aulc) o2.b;
                aulc.a |= 1;
                aulc.b = j;
                aulc aulc2 = (aulc) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aumr aumr = (aumr) o.b;
                aulc2.getClass();
                aumr.b = aulc2;
                aumr.a = 2;
                a2.a(b2, (aumr) o.i());
                b2.b();
                b2.close();
                if (a2 != null) {
                    a2.close();
                }
                this.a.a(Status.a);
                return;
            } catch (Throwable th3) {
                th = th3;
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
            throw th2;
        } catch (IOException e2) {
            this.a.a(new Status(8, e2.getMessage()));
        } catch (Throwable th4) {
            apev.a(th, th4);
        }
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
