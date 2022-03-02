package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: anep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class anep extends angj {
    public abstract Map a();

    public final void clear() {
        a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object a = anet.a(a(), key);
        if (amqx.a(a, entry.getValue())) {
            return a != null || a().containsKey(key);
        }
        return false;
    }

    public final boolean isEmpty() {
        return a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (contains(obj)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        try {
            amrl.a((Object) collection);
            return angm.a((Set) this, collection);
        } catch (UnsupportedOperationException e) {
            return angm.a((Set) this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            amrl.a((Object) collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet a = angm.a(collection.size());
            for (Object next : collection) {
                if (contains(next)) {
                    a.add(((Map.Entry) next).getKey());
                }
            }
            return a().keySet().retainAll(a);
        }
    }

    public final int size() {
        return a().size();
    }
}
