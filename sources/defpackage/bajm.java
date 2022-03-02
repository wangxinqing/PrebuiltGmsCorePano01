package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bajm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bajm {
    public final Map a;
    public final Map b;
    public final Object c;
    public final Map d;

    public bajm(Map map, Map map2, Object obj, Map map3) {
        this.a = Collections.unmodifiableMap(new HashMap(map));
        this.b = Collections.unmodifiableMap(new HashMap(map2));
        this.c = obj;
        this.d = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bajm bajm = (bajm) obj;
            return amqx.a(this.a, bajm.a) && amqx.a(this.b, bajm.b) && amqx.a((Object) null, (Object) null) && amqx.a(this.c, bajm.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("serviceMethodMap", (Object) this.a);
        a2.a("serviceMap", (Object) this.b);
        a2.a("retryThrottling", (Object) null);
        a2.a("loadBalancingConfig", this.c);
        return a2.toString();
    }
}
