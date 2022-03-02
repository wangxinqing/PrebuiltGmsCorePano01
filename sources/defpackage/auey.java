package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: auey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auey extends AbstractMap {
    public List a = Collections.emptyList();
    public Map b = Collections.emptyMap();
    public boolean c;
    public Map d = Collections.emptyMap();
    private final int e;
    private volatile auex f;

    public auey(int i) {
        this.e = i;
    }

    private final int a(Comparable comparable) {
        int size = this.a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((auev) this.a.get(size)).a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((auev) this.a.get(i2)).a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    private final SortedMap d() {
        c();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.d = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    public final Iterable b() {
        return !this.b.isEmpty() ? this.b.entrySet() : aueu.b;
    }

    public final Object c(int i) {
        c();
        Object obj = ((auev) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new auev(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final void clear() {
        c();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Set entrySet() {
        if (this.f == null) {
            this.f = new auex(this);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auey)) {
            return super.equals(obj);
        }
        auey auey = (auey) obj;
        int size = size();
        if (size != auey.size()) {
            return false;
        }
        int a2 = a();
        if (a2 != auey.a()) {
            return entrySet().equals(auey.entrySet());
        }
        for (int i = 0; i < a2; i++) {
            if (!b(i).equals(auey.b(i))) {
                return false;
            }
        }
        if (a2 != size) {
            return this.b.equals(auey.b);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((auev) this.a.get(a2)).b;
        }
        return this.b.get(comparable);
    }

    public final int hashCode() {
        int a2 = a();
        int i = 0;
        for (int i2 = 0; i2 < a2; i2++) {
            i += ((auev) this.a.get(i2)).hashCode();
        }
        return this.b.size() > 0 ? i + this.b.hashCode() : i;
    }

    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (!this.b.isEmpty()) {
            return this.b.remove(comparable);
        }
        return null;
    }

    public final int size() {
        return this.a.size() + this.b.size();
    }

    public final Map.Entry b(int i) {
        return (Map.Entry) this.a.get(i);
    }

    static auey a(int i) {
        return new auey(i);
    }

    public final void c() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        return this.a.size();
    }

    /* renamed from: a */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((auev) this.a.get(a2)).setValue(obj);
        }
        c();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.e);
        }
        int i = -(a2 + 1);
        if (i >= this.e) {
            return d().put(comparable, obj);
        }
        int size = this.a.size();
        int i2 = this.e;
        if (size == i2) {
            auev auev = (auev) this.a.remove(i2 - 1);
            d().put(auev.a, auev.b);
        }
        this.a.add(i, new auev(this, comparable, obj));
        return null;
    }
}
