package defpackage;

/* renamed from: agw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agw extends agp {
    public final void a(agx agx, agx agx2) {
        agx.next = agx2;
    }

    public final void a(agx agx, Thread thread) {
        agx.thread = thread;
    }

    public final boolean a(agy agy, agt agt, agt agt2) {
        synchronized (agy) {
            if (agy.listeners != agt) {
                return false;
            }
            agy.listeners = agt2;
            return true;
        }
    }

    public final boolean a(agy agy, agx agx, agx agx2) {
        synchronized (agy) {
            if (agy.waiters != agx) {
                return false;
            }
            agy.waiters = agx2;
            return true;
        }
    }

    public final boolean a(agy agy, Object obj, Object obj2) {
        synchronized (agy) {
            if (agy.value != obj) {
                return false;
            }
            agy.value = obj2;
            return true;
        }
    }
}
