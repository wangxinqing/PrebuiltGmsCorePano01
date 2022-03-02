package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: aneq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class aneq extends angj {
    final Map d;

    public aneq(Map map) {
        amrl.a((Object) map);
        this.d = map;
    }

    public void clear() {
        this.d.clear();
    }

    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public Iterator iterator() {
        return new anek(this.d.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.d.remove(obj);
        return true;
    }

    public final int size() {
        return this.d.size();
    }
}
