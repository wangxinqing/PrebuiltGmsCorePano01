package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: amwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amwq extends amwy implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected amwq(Map map) {
        amrl.a(map.isEmpty());
        this.a = map;
    }

    static /* synthetic */ void a(amwq amwq) {
        amwq.b++;
    }

    static /* synthetic */ void b(amwq amwq) {
        amwq.b--;
    }

    public abstract Collection a();

    public Collection a(Object obj, Collection collection) {
        throw null;
    }

    public Collection a(Collection collection) {
        throw null;
    }

    public Collection b() {
        throw null;
    }

    public final int c() {
        return this.b;
    }

    public final void d() {
        for (Collection clear : this.a.values()) {
            clear.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    public Collection e(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return b();
        }
        Collection a2 = a();
        a2.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return a(a2);
    }

    public final Collection f() {
        return new amwx(this);
    }

    public final Iterator g() {
        return new amvw(this);
    }

    public final Collection h() {
        if (this instanceof amxb) {
            return new amww(this);
        }
        return new anfa(this);
    }

    public final Iterator i() {
        return new amvx(this);
    }

    public Map j() {
        return new amwa(this, this.a);
    }

    static /* synthetic */ void a(amwq amwq, int i) {
        amwq.b += i;
    }

    static /* synthetic */ void b(amwq amwq, int i) {
        amwq.b -= i;
    }

    public Collection c(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return a(obj, collection);
    }

    public final boolean d(Object obj) {
        return this.a.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    public final List a(Object obj, List list, amwk amwk) {
        return list instanceof RandomAccess ? new amwg(this, obj, list, amwk) : new amwm(this, obj, list, amwk);
    }

    public Set e() {
        return new amwd(this, this.a);
    }

    /* access modifiers changed from: package-private */
    public final void a(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            amrl.a(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Collection a2 = a();
            if (a2.add(obj2)) {
                this.b++;
                this.a.put(obj, a2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.b++;
            return true;
        }
    }
}
