package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: angz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class angz extends anhb implements Map {
    private static final long serialVersionUID = 0;
    transient Set c;
    transient Collection d;
    transient Set e;

    public angz(Map map, Object obj) {
        super(map, obj);
    }

    /* access modifiers changed from: package-private */
    public final Map a() {
        return (Map) this.f;
    }

    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.g) {
            containsKey = a().containsKey(obj);
        }
        return containsKey;
    }

    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.g) {
            containsValue = a().containsValue(obj);
        }
        return containsValue;
    }

    public Set entrySet() {
        Set set;
        synchronized (this.g) {
            if (this.e == null) {
                this.e = anhf.a(a().entrySet(), this.g);
            }
            set = this.e;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    public Object get(Object obj) {
        Object obj2;
        synchronized (this.g) {
            obj2 = a().get(obj);
        }
        return obj2;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.g) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    public final Set keySet() {
        Set set;
        synchronized (this.g) {
            if (this.c == null) {
                this.c = anhf.a(a().keySet(), this.g);
            }
            set = this.c;
        }
        return set;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.g) {
            put = a().put(obj, obj2);
        }
        return put;
    }

    public final void putAll(Map map) {
        synchronized (this.g) {
            a().putAll(map);
        }
    }

    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.g) {
            remove = a().remove(obj);
        }
        return remove;
    }

    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    public Collection values() {
        Collection collection;
        synchronized (this.g) {
            if (this.d == null) {
                this.d = anhf.a(a().values(), this.g);
            }
            collection = this.d;
        }
        return collection;
    }
}
