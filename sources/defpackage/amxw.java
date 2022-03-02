package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: amxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxw extends anfk implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public amxw(Comparator comparator) {
        amrl.a((Object) comparator);
        this.a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amxw) {
            return this.a.equals(((amxw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
