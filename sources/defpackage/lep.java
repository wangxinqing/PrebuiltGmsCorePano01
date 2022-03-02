package defpackage;

import com.android.volley.VolleyError;
import java.util.List;

/* renamed from: lep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lep implements Runnable {
    final /* synthetic */ kkz a;
    final /* synthetic */ long b;
    final /* synthetic */ lnk c;
    final /* synthetic */ leq d;

    public lep(leq leq, kkz kkz, long j, lnk lnk) {
        this.d = leq;
        this.a = kkz;
        this.b = j;
        this.c = lnk;
    }

    public final void run() {
        kkz kkz = this.a;
        leq leq = this.d;
        kkf kkf = leq.c;
        lsm lsm = leq.b;
        lel lel = lsm.z;
        lfr lfr = lsm.x;
        jiq jiq = lsm.F;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.b;
        lnk lnk = this.c;
        lrp.a.a("Refreshing old unsubscribed Entries For Account: %s", kkz);
        lfq c2 = lfr.c();
        c2.i();
        c2.c(1, 65);
        c2.a(kkz.a);
        List<kmp> a2 = kkf.a(kkz, currentTimeMillis - j, currentTimeMillis + j).a();
        for (kmp kmp : a2) {
            try {
                lel.a(khq.a(kkz), kmp.i(), lnk);
            } catch (VolleyError | eif e) {
            }
        }
        c2.b(a2.size(), j);
        c2.h();
        c2.a();
    }
}
