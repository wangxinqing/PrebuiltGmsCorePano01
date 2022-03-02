package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: anes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class anes extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set a();

    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set a2 = a();
        this.a = a2;
        return a2;
    }

    public Set h() {
        return new aneq(this);
    }

    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set h = h();
        this.b = h;
        return h;
    }

    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        aner aner = new aner(this);
        this.c = aner;
        return aner;
    }
}
