package defpackage;

import java.util.Arrays;
import java.util.Set;

/* renamed from: lcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcl {
    public final lck a;
    public final Set b;
    public final String c;

    public lcl(lck lck, Set set, String str) {
        iva.a((Object) lck);
        this.a = lck;
        iva.a((Object) set, (Object) "Query can't have null spaces (have you validated them?)");
        this.b = set;
        iva.b(!set.isEmpty(), "Query can't have empty spaces (have you validated them?)");
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lcl lcl = (lcl) obj;
            return ius.a(this.a, lcl.a) && ius.a(this.b, lcl.b) && ius.a(this.c, lcl.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.format("ApiaryFeedParameters[filter=%s, spaces=%s, orderBy=%s]", new Object[]{this.a.b, this.b.toString(), this.c});
    }
}
