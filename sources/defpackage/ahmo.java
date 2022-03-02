package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: ahmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmo {
    public final ahmn a;
    public final int b;

    public ahmo(ahmn ahmn, int i) {
        this.a = ahmn;
        this.b = i;
    }

    public static int a(List list, ahmn ahmn) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ahmo ahmo = (ahmo) it.next();
            if (ahmo.a == ahmn) {
                return ahmo.b;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ahmo)) {
            ahmo ahmo = (ahmo) obj;
            return this.a == ahmo.a && this.b == ahmo.b;
        }
    }

    public final int hashCode() {
        ahmn ahmn = this.a;
        return (((ahmn != null ? ahmn.hashCode() : 0) + 31) * 31) + this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("ActivityResult [activity=");
        sb.append(valueOf);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
