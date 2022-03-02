package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: amwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwa extends anes {
    final transient Map a;
    final /* synthetic */ amwq b;

    public amwa(amwq amwq, Map map) {
        this.b = amwq;
        this.a = map;
    }

    /* access modifiers changed from: package-private */
    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return anet.a(key, (Object) this.b.a(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        Map map = this.a;
        amwq amwq = this.b;
        if (map == amwq.a) {
            amwq.d();
        } else {
            ance.f(new amvz(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.a;
        amrl.a((Object) map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) anet.a(this.a, obj);
        if (collection != null) {
            return this.b.a(obj, collection);
        }
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public Set keySet() {
        return this.b.m();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a2 = this.b.a();
        a2.addAll(collection);
        amwq.b(this.b, collection.size());
        collection.clear();
        return a2;
    }

    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Set a() {
        return new amvy(this);
    }
}
