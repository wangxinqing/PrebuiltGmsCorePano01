package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agfr implements agfv {
    public volatile agdl a;
    public final Queue b = new ConcurrentLinkedQueue();
    public final amri c;

    public agfr(aghs aghs) {
        new AtomicReference();
        new AtomicReference();
        this.c = aghs.g() ? amri.b(new ConcurrentHashMap()) : ampu.a;
    }

    private final void a(agfq agfq) {
        synchronized (this.b) {
            if (this.a == null) {
                this.b.add(agfq);
            } else {
                agfq.a(this.a);
            }
        }
    }

    public final void a(agie agie, barw barw, barb barb) {
    }

    public final void c() {
        this.b.clear();
    }

    public final void d() {
        a(agfm.a);
    }

    public final agif e() {
        return !this.c.a() ? agif.b : agif.a();
    }

    public final void f() {
        a(agfl.a);
    }

    public final void a(agdl agdl) {
        agfq agfq = (agfq) this.b.poll();
        while (agfq != null) {
            agfq.a(agdl);
            agfq = (agfq) this.b.poll();
        }
    }

    public final void a(agev agev) {
        a((agfq) new agfo(agev));
    }

    public final void a(agif agif, String str, boolean z) {
        if (agif != null && agif != agif.b) {
            agif.c();
            a((agfq) new agfk(agif, str, z));
        }
    }

    public final void a(agir agir, String str, long j, long j2, barb barb) {
        a((agfq) new agfp(agir, str, j, j2, barb));
    }

    public final void a(String str) {
        a((agfq) new agfn(str));
    }
}
