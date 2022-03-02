package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: amsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsw implements Serializable, amsv {
    private static final long serialVersionUID = 0;
    final amsv a;
    final long b;
    volatile transient Object c;
    volatile transient long d;

    public amsw(amsv amsv, long j, TimeUnit timeUnit) {
        amrl.a((Object) amsv);
        this.a = amsv;
        this.b = timeUnit.toNanos(j);
        amrl.a(j > 0, "duration (%s %s) must be > 0", j, (Object) timeUnit);
    }

    public final Object a() {
        long j = this.d;
        long a2 = amrk.a();
        if (j == 0 || a2 - j >= 0) {
            synchronized (this) {
                if (j == this.d) {
                    Object a3 = this.a.a();
                    this.c = a3;
                    long j2 = a2 + this.b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.d = j2;
                    return a3;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("Suppliers.memoizeWithExpiration(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", NANOS)");
        return sb.toString();
    }
}
