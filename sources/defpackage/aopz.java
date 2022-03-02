package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aopz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aopz extends aopj {
    private static final Logger a;
    public static final aopw b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        Throwable th;
        aopw aopw;
        Class<aopz> cls = aopz.class;
        a = Logger.getLogger(cls.getName());
        try {
            aopw = new aopx(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            th = null;
        } catch (Throwable th2) {
            aopw = new aopy();
            th = th2;
        }
        b = aopw;
        if (th != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public aopz(int i) {
        this.remaining = i;
    }

    public abstract void a(Set set);
}
