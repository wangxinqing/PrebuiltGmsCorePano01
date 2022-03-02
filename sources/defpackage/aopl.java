package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: aopl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aopl extends aopa {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e2) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new aopk());
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }
        Class<aopn> cls = aopn.class;
        try {
            c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(aopm.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(aopm.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e4) {
            amtb.a(e4);
            throw new RuntimeException(e4);
        }
    }

    public final void a(aopm aopm, aopm aopm2) {
        a.putObject(aopm, f, aopm2);
    }

    public final void a(aopm aopm, Thread thread) {
        a.putObject(aopm, e, thread);
    }

    public final boolean a(aopn aopn, aope aope, aope aope2) {
        return a.compareAndSwapObject(aopn, b, aope, aope2);
    }

    public final boolean a(aopn aopn, aopm aopm, aopm aopm2) {
        return a.compareAndSwapObject(aopn, c, aopm, aopm2);
    }

    public final boolean a(aopn aopn, Object obj, Object obj2) {
        return a.compareAndSwapObject(aopn, d, obj, obj2);
    }
}
