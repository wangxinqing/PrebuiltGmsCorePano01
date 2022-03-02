package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: bajl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bajl {
    final Long a;
    final Boolean b;
    final Integer c;
    final Integer d;
    final bakx e;
    final bagu f;

    public bajl(Map map) {
        boolean z;
        this.a = bahx.h(map, "timeout");
        this.b = bahx.i(map, "waitForReady");
        Integer f2 = bahx.f(map, "maxResponseMessageBytes");
        this.c = f2;
        boolean z2 = true;
        if (f2 != null) {
            if (f2.intValue() >= 0) {
                z = true;
            } else {
                z = false;
            }
            amrl.a(z, "maxInboundMessageSize %s exceeds bounds", (Object) this.c);
        }
        Integer f3 = bahx.f(map, "maxRequestMessageBytes");
        this.d = f3;
        if (f3 != null) {
            amrl.a(f3.intValue() < 0 ? false : z2, "maxOutboundMessageSize %s exceeds bounds", (Object) this.d);
        }
        this.e = bakx.f;
        this.f = bagu.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bajl) {
            bajl bajl = (bajl) obj;
            if (!amqx.a(this.a, bajl.a) || !amqx.a(this.b, bajl.b) || !amqx.a(this.c, bajl.c) || !amqx.a(this.d, bajl.d) || !amqx.a(this.e, bajl.e) || !amqx.a(this.f, bajl.f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("timeoutNanos", (Object) this.a);
        a2.a("waitForReady", (Object) this.b);
        a2.a("maxInboundMessageSize", (Object) this.c);
        a2.a("maxOutboundMessageSize", (Object) this.d);
        a2.a("retryPolicy", (Object) this.e);
        a2.a("hedgingPolicy", (Object) this.f);
        return a2.toString();
    }
}
