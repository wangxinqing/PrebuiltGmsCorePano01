package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: azzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azzk {
    public final List a;
    public final azxa b;
    public final Object c;

    public azzk(List list, azxa azxa, Object obj) {
        amrl.a((Object) list, (Object) "addresses");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        amrl.a((Object) azxa, (Object) "attributes");
        this.b = azxa;
        this.c = obj;
    }

    public static azzj a() {
        return new azzj();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azzk) {
            azzk azzk = (azzk) obj;
            if (!amqx.a(this.a, azzk.a) || !amqx.a(this.b, azzk.b) || !amqx.a(this.c, azzk.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("addresses", (Object) this.a);
        a2.a("attributes", (Object) this.b);
        a2.a("loadBalancingPolicyConfig", this.c);
        return a2.toString();
    }
}
