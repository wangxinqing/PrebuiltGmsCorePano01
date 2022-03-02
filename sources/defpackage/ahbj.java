package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* renamed from: ahbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbj {
    private final ConcurrentMap a;

    @Deprecated
    public ahbj() {
        this(new ConcurrentHashMap());
    }

    public final Semaphore a(String str) {
        Semaphore semaphore = (Semaphore) this.a.get(str);
        if (semaphore != null) {
            return semaphore;
        }
        this.a.putIfAbsent(str, new Semaphore(1));
        return (Semaphore) this.a.get(str);
    }

    public final boolean a() {
        return this.a != null;
    }

    public ahbj(ConcurrentMap concurrentMap) {
        this.a = concurrentMap;
    }
}
