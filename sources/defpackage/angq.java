package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: angq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angq extends angz {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;

    public angq(Map map, Object obj) {
        super(map, obj);
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final Set entrySet() {
        Set set;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new angt(a().entrySet(), this.g);
            }
            set = this.a;
        }
        return set;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection;
        synchronized (this.g) {
            Collection collection2 = (Collection) super.get(obj);
            if (collection2 != null) {
                collection = anhf.b(collection2, this.g);
            } else {
                collection = null;
            }
        }
        return collection;
    }

    public final Collection values() {
        Collection collection;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = new angv(a().values(), this.g);
            }
            collection = this.b;
        }
        return collection;
    }
}
