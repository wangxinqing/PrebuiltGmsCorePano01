package defpackage;

import java.util.Map;

/* renamed from: alqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqp {
    public final Map a;
    public final int b;

    public alqp(int i, Map map) {
        this.b = i;
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof alqp)) {
            alqp alqp = (alqp) obj;
            Map map = this.a;
            if (map != null) {
                if (!map.equals(alqp.a)) {
                    return false;
                }
            } else if (alqp.a != null) {
                return false;
            }
            if (this.b == alqp.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Map map = this.a;
        return (((map != null ? map.hashCode() : 0) + 31) * 31) + this.b;
    }
}
