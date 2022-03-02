package defpackage;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: aoqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoqd implements Serializable {
    private final ConcurrentHashMap a;

    private aoqd(ConcurrentHashMap concurrentHashMap) {
        amrl.a((Object) concurrentHashMap);
        this.a = concurrentHashMap;
    }

    public static aoqd a() {
        return new aoqd(new ConcurrentHashMap());
    }

    public final long b(Object obj) {
        return a(obj, -1);
    }

    public final void c(Object obj) {
        a(obj, 1);
    }

    public final void d(Object obj) {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.a.get(obj);
        if (atomicLong != null) {
            do {
                j = atomicLong.get();
                if (j == 0 || atomicLong.compareAndSet(j, 0)) {
                    this.a.remove(obj, atomicLong);
                }
                j = atomicLong.get();
                break;
            } while (atomicLong.compareAndSet(j, 0));
            this.a.remove(obj, atomicLong);
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    public final long a(Object obj) {
        AtomicLong atomicLong = (AtomicLong) this.a.get(obj);
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0;
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final long a(Object obj, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.a.get(obj);
            if (atomicLong == null && (atomicLong = (AtomicLong) this.a.putIfAbsent(obj, new AtomicLong(j))) == null) {
                return j;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    long j3 = j2 + j;
                    if (atomicLong.compareAndSet(j2, j3)) {
                        return j3;
                    }
                }
            }
        } while (!this.a.replace(obj, atomicLong, new AtomicLong(j)));
        return j;
    }
}
