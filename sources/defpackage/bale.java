package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: bale  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bale {
    public final String a;
    public final Map b;

    public bale(String str, Map map) {
        amrl.a((Object) str, (Object) "policyName");
        this.a = str;
        amrl.a((Object) map, (Object) "rawConfigValue");
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bale) {
            bale bale = (bale) obj;
            return this.a.equals(bale.a) && this.b.equals(bale.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("policyName", (Object) this.a);
        a2.a("rawConfigValue", (Object) this.b);
        return a2.toString();
    }
}
