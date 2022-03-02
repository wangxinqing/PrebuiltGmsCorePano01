package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: bvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bvz implements idg {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ int b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ bzm d;
    final /* synthetic */ Set e;
    final /* synthetic */ bwc f;

    public bvz(bwc bwc, ArrayList arrayList, int i, CountDownLatch countDownLatch, bzm bzm, Set set) {
        this.f = bwc;
        this.a = arrayList;
        this.b = i;
        this.c = countDownLatch;
        this.d = bzm;
        this.e = set;
    }

    public final void a(Status status) {
    }

    public final void a(grs grs) {
        int i;
        if (!grs.aO().c() || grs.b().k == null) {
            ((anih) ((anih) bxk.a.b()).a("bvz", "a", 456, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Failed Fence-to-Snapshot %s with %s", this.b, (Object) grs.aO());
        } else {
            new Object[1][0] = grs.b().k;
            this.a.add(grs.b().k);
        }
        this.c.countDown();
        if (this.c.getCount() == 0) {
            if (!this.a.isEmpty()) {
                this.d.n = this.a;
            }
            new Object[1][0] = Integer.valueOf(this.a.size());
            if (this.a.size() < this.e.size()) {
                ((anih) ((anih) bxk.a.c()).a("bvz", "a", 471, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Received %s/%s snapshots. Won't notify fence %s.", (Object) Integer.valueOf(this.a.size()), (Object) Integer.valueOf(this.e.size()), (Object) this.d.a);
                bzm bzm = this.d;
                bzm.b(bzm.k);
                if (this.f.a.b == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (this.d.k == 2) {
                    buc F = cbi.F();
                    bzm bzm2 = this.d;
                    F.a(bzm2.f, bzm2.h, 0, 1, i);
                    return;
                }
                return;
            }
            cbi.k().a(new bvy(this), bvq.a("FenceListenerConsumer_notifyListener"));
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i;
        grs grs = (grs) obj;
        if (!grs.aO().c() || grs.b().k == null) {
            ((anih) ((anih) bxk.a.b()).a("bvz", "a", 456, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Failed Fence-to-Snapshot %s with %s", this.b, (Object) grs.aO());
        } else {
            new Object[1][0] = grs.b().k;
            this.a.add(grs.b().k);
        }
        this.c.countDown();
        if (this.c.getCount() == 0) {
            if (!this.a.isEmpty()) {
                this.d.n = this.a;
            }
            new Object[1][0] = Integer.valueOf(this.a.size());
            if (this.a.size() < this.e.size()) {
                ((anih) ((anih) bxk.a.c()).a("bvz", "a", 471, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceListenerConsumer] Received %s/%s snapshots. Won't notify fence %s.", (Object) Integer.valueOf(this.a.size()), (Object) Integer.valueOf(this.e.size()), (Object) this.d.a);
                bzm bzm = this.d;
                bzm.b(bzm.k);
                if (this.f.a.b == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (this.d.k == 2) {
                    buc F = cbi.F();
                    bzm bzm2 = this.d;
                    F.a(bzm2.f, bzm2.h, 0, 1, i);
                    return;
                }
                return;
            }
            cbi.k().a(new bvy(this), bvq.a("FenceListenerConsumer_notifyListener"));
        }
    }
}
