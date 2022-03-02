package defpackage;

import android.accounts.Account;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import java.util.Collections;
import java.util.List;

/* renamed from: cbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbr implements Runnable {
    long a;
    final /* synthetic */ cbs b;
    private final cbv c;

    public cbr(cbs cbs, cbv cbv, long j) {
        this.b = cbs;
        this.c = cbv;
        this.a = j;
        int[] iArr = {3, 2};
        iva.b(true);
        List<attg> emptyList = Collections.emptyList();
        aucd o = atkz.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkz atkz = (atkz) o.b;
        atkz.b = 1;
        int i = atkz.a | 1;
        atkz.a = i;
        atkz.a = i | 2;
        atkz.c = 3000;
        if (!atkz.f.a()) {
            atkz.f = aucj.a(atkz.f);
        }
        for (attg attg : emptyList) {
            atkz.f.d(attg.d);
        }
        for (int i2 = 0; i2 < 2; i2++) {
            atte a2 = atte.a(iArr[i2]);
            a2 = a2 == null ? atte.UNKNOWN_STATE : a2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atkz atkz2 = (atkz) o.b;
            a2.getClass();
            if (!atkz2.d.a()) {
                atkz2.d = aucj.a(atkz2.d);
            }
            atkz2.d.d(a2.e);
        }
        jvp jvp = new jvp((atkz) o.i());
        iva.a((Object) jvp);
        atjq atjq = (atjq) atjt.z.o();
        atjs atjs = atjs.NETWORK_STATE_FENCE;
        if (atjq.c) {
            atjq.c();
            atjq.c = false;
        }
        atjt atjt = (atjt) atjq.b;
        atjt.b = atjs.z;
        int i3 = atjt.a | 1;
        atjt.a = i3;
        atkz atkz3 = jvp.a;
        atkz3.getClass();
        atjt.m = atkz3;
        atjt.a = i3 | 1024;
        ContextFenceStub contextFenceStub = new ContextFenceStub((atjt) atjq.i());
        grd grd = new grd();
        grd.a("ServerTaskRetryManagerFence", contextFenceStub, cbs);
        FenceUpdateRequestImpl a3 = grd.a();
        cbs.b = true;
        gra.a(cbi.f(), grb.b("ServerTaskRetryManager", (Account) null)).a(a3).a((acvp) new cbq(cbs, "[ServerTaskRetryManager] registerRetryFence", new Object[0]));
        long b2 = (j + 1) - cbi.i().b();
        new Object[1][0] = Long.valueOf(b2);
        cbi.k().a(this, b2, bvq.a("ServerTaskRetryManager_prune"));
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        if (j <= this.a) {
            this.b.c = true;
            this.c.run();
            this.b.c = false;
        } else {
            this.c.b();
        }
        cbi.k().a((Runnable) this);
    }

    public final void run() {
        cbs cbs = this.b;
        long b2 = cbi.i().b();
        while (!cbs.a.isEmpty()) {
            cbr cbr = (cbr) cbs.a.peek();
            if (cbr.a >= b2) {
                break;
            }
            cbs.a.poll();
            new Object[1][0] = Long.valueOf(cbr.a);
            cbr.a(b2);
        }
        if (cbs.b && cbs.a.isEmpty()) {
            cbs.a();
        }
    }
}
