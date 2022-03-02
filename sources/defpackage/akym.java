package defpackage;

import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Arrays;

/* renamed from: akym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akym {
    public final int a;
    public final long b;
    public final ClientIdentity c;

    public akym(int i, long j, ClientIdentity clientIdentity) {
        this.a = i;
        this.b = j;
        this.c = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof akym)) {
            akym akym = (akym) obj;
            return this.a == akym.a && this.b == akym.b && this.c.equals(akym.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        return "priority=" + this.a + " updateIntervalMillis=" + this.b + " clientIdentity=" + this.c.toString();
    }
}
