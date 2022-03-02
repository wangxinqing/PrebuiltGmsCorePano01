package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: baaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baaq {
    public final List a;
    public final azxa b;
    public final baam c;

    public baaq(List list, azxa azxa, baam baam) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        amrl.a((Object) azxa, (Object) "attributes");
        this.b = azxa;
        this.c = baam;
    }

    public static baap a() {
        return new baap();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof baaq) {
            baaq baaq = (baaq) obj;
            if (!amqx.a(this.a, baaq.a) || !amqx.a(this.b, baaq.b) || !amqx.a(this.c, baaq.c)) {
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
        a2.a("serviceConfig", (Object) this.c);
        return a2.toString();
    }
}
