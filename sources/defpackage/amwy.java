package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: amwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amwy implements aneu {
    private transient Collection a;
    private transient Set b;
    private transient Collection c;
    private transient Map d;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r2, java.lang.Iterable r3) {
        /*
            r1 = this;
            defpackage.amrl.a((java.lang.Object) r3)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0017
            java.util.Collection r2 = r1.c(r2)
            boolean r2 = r2.addAll(r3)
            if (r2 == 0) goto L_0x0017
        L_0x0017:
            return
        L_0x0018:
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002c
            java.util.Collection r2 = r1.c(r2)
            boolean r2 = defpackage.ance.a((java.util.Collection) r2, (java.util.Iterator) r3)
            if (r2 == 0) goto L_0x002c
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amwy.a(java.lang.Object, java.lang.Iterable):void");
    }

    public boolean a(Object obj, Object obj2) {
        throw null;
    }

    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) o().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) o().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aneu)) {
            return false;
        }
        return o().equals(((aneu) obj).o());
    }

    public abstract Collection f();

    public boolean f(Object obj) {
        for (Collection contains : o().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Iterator g() {
        throw null;
    }

    public abstract Collection h();

    public final int hashCode() {
        return o().hashCode();
    }

    public abstract Iterator i();

    public abstract Map j();

    public boolean k() {
        return c() == 0;
    }

    public Collection l() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection h = h();
        this.a = h;
        return h;
    }

    public Set m() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set e = e();
        this.b = e;
        return e;
    }

    public Collection n() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection f = f();
        this.c = f;
        return f;
    }

    public Map o() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map j = j();
        this.d = j;
        return j;
    }

    public final String toString() {
        return o().toString();
    }
}
