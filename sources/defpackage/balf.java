package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: balf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class balf {
    final azzp a;
    @Deprecated
    final Map b;
    final Object c;

    public balf(azzp azzp, Map map, Object obj) {
        amrl.a((Object) azzp, (Object) "provider");
        this.a = azzp;
        this.b = map;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            balf balf = (balf) obj;
            return amqx.a(this.a, balf.a) && amqx.a(this.b, balf.b) && amqx.a(this.c, balf.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("provider", (Object) this.a);
        a2.a("rawConfig", (Object) this.b);
        a2.a("config", this.c);
        return a2.toString();
    }
}
