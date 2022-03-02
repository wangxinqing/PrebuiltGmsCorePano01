package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: edz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edz {
    public final Map a = new HashMap();

    public final edy a(Object obj, Set set) {
        edy edy = new edy();
        if (!this.a.containsKey(obj)) {
            if (set.isEmpty()) {
                return edy;
            }
            this.a.put(obj, new HashSet());
        }
        Set set2 = (Set) this.a.get(obj);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!set.contains(next)) {
                it.remove();
                edy.b.add(next);
            }
        }
        for (Object next2 : set) {
            if (!set2.contains(next2)) {
                ((Set) this.a.get(obj)).add(next2);
                edy.a.add(next2);
            }
        }
        if (((Set) this.a.get(obj)).isEmpty()) {
            this.a.remove(obj);
        }
        return edy;
    }
}
