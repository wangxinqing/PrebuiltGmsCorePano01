package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bakx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakx {
    static final bakx f = new bakx(Collections.emptySet());
    final int a = 1;
    final long b = 0;
    final long c = 0;
    final double d = 1.0d;
    final Set e;

    public bakx(Set set) {
        this.e = anax.a((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bakx) {
            bakx bakx = (bakx) obj;
            int i = bakx.a;
            long j = bakx.b;
            long j2 = bakx.c;
            double d2 = bakx.d;
            if (Double.compare(1.0d, 1.0d) != 0 || !amqx.a(this.e, bakx.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, 0L, 0L, Double.valueOf(1.0d), this.e});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("maxAttempts", 1);
        a2.a("initialBackoffNanos", 0);
        a2.a("maxBackoffNanos", 0);
        a2.a("backoffMultiplier", 1.0d);
        a2.a("retryableStatusCodes", (Object) this.e);
        return a2.toString();
    }
}
