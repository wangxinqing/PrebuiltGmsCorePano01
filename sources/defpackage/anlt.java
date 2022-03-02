package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: anlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum anlt implements anlr {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;
    
    private static final Unsafe c = null;
    private static final int d = 0;

    static {
        Class<byte[]> cls;
        Unsafe a = a();
        c = a;
        d = a.arrayBaseOffset(cls);
        if (c.arrayIndexScale(cls) != 1) {
            throw new AssertionError();
        }
    }

    private static Unsafe a() {
        try {
            return Unsafe.getUnsafe();
        } catch (SecurityException e2) {
            try {
                return (Unsafe) AccessController.doPrivileged(new anls());
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }
    }

    public static final long b(byte[] bArr, int i) {
        return c.getLong(bArr, ((long) i) + ((long) d));
    }

    public static final long c(byte[] bArr, int i) {
        return Long.reverseBytes(c.getLong(bArr, ((long) i) + ((long) d)));
    }
}
