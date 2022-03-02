package defpackage;

/* renamed from: aoph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoph extends aopa {
    public final void a(aopm aopm, aopm aopm2) {
        aopm.next = aopm2;
    }

    public final void a(aopm aopm, Thread thread) {
        aopm.thread = thread;
    }

    public final boolean a(aopn aopn, aope aope, aope aope2) {
        synchronized (aopn) {
            if (aopn.listeners != aope) {
                return false;
            }
            aopn.listeners = aope2;
            return true;
        }
    }

    public final boolean a(aopn aopn, aopm aopm, aopm aopm2) {
        synchronized (aopn) {
            if (aopn.waiters != aopm) {
                return false;
            }
            aopn.waiters = aopm2;
            return true;
        }
    }

    public final boolean a(aopn aopn, Object obj, Object obj2) {
        synchronized (aopn) {
            boolean z = aopn.j;
            if (aopn.value != obj) {
                return false;
            }
            aopn.value = obj2;
            return true;
        }
    }
}
