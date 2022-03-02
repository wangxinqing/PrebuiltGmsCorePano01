package defpackage;

import android.accounts.Account;
import com.google.android.gms.awareness.fence.FenceState;
import java.util.PriorityQueue;

/* renamed from: cbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbs implements grc {
    public final PriorityQueue a = new PriorityQueue(1, new cbo());
    public boolean b = false;
    public boolean c = false;

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = false;
        grd grd = new grd();
        grd.a((grc) this);
        gra.a(cbi.f(), grb.b("ServerTaskRetryManager", (Account) null)).a(grd.a()).a((acvp) new bva("[ServerTaskRetryManager] unregister fence", new Object[0]));
    }

    public final void a(FenceState fenceState) {
        if (fenceState.a() == 2 && !this.a.isEmpty()) {
            new Object[1][0] = fenceState.b();
            cbi.k().a(new cbp(this, cbi.i().b()), bvq.a("ServerTaskRetryManager_retry"));
        }
    }
}
