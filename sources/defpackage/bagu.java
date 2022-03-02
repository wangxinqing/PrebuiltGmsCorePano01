package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bagu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bagu {
    static final bagu b = new bagu(Collections.emptySet());
    final Set a;

    public bagu(Set set) {
        this.a = anax.a((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && amqx.a(this.a, ((bagu) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, 0L, this.a});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("maxAttempts", 1);
        a2.a("hedgingDelayNanos", 0);
        a2.a("nonFatalStatusCodes", (Object) this.a);
        return a2.toString();
    }
}
