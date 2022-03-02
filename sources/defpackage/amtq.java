package defpackage;

import java.util.Arrays;

/* renamed from: amtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amtq {
    private final long a = 0;
    private final long b = 0;
    private final long c = 0;
    private final long d = 0;
    private final long e = 0;
    private final long f = 0;

    public amtq() {
        amrl.a(true);
        amrl.a(true);
        amrl.a(true);
        amrl.a(true);
        amrl.a(true);
        amrl.a(true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amtq)) {
            return false;
        }
        amtq amtq = (amtq) obj;
        long j = amtq.a;
        long j2 = amtq.b;
        long j3 = amtq.c;
        long j4 = amtq.d;
        long j5 = amtq.e;
        long j6 = amtq.f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("hitCount", 0);
        a2.a("missCount", 0);
        a2.a("loadSuccessCount", 0);
        a2.a("loadExceptionCount", 0);
        a2.a("totalLoadTime", 0);
        a2.a("evictionCount", 0);
        return a2.toString();
    }
}
