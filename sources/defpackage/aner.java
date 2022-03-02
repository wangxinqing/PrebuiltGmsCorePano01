package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aner  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aner extends AbstractCollection {
    final Map a;

    public aner(Map map) {
        amrl.a((Object) map);
        this.a = map;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new anel(this.a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException e) {
            for (Map.Entry entry : this.a.entrySet()) {
                if (amqx.a(obj, entry.getValue())) {
                    this.a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        try {
            amrl.a((Object) collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet a2 = angm.a();
            for (Map.Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    a2.add(entry.getKey());
                }
            }
            return this.a.keySet().removeAll(a2);
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            amrl.a((Object) collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet a2 = angm.a();
            for (Map.Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    a2.add(entry.getKey());
                }
            }
            return this.a.keySet().retainAll(a2);
        }
    }

    public final int size() {
        return this.a.size();
    }
}
