package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: anaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class anaq {
    public final Map a = amxr.a();

    public static final Collection c() {
        return new ArrayList();
    }

    public final anau b() {
        Set<Map.Entry> entrySet = this.a.entrySet();
        if (entrySet.isEmpty()) {
            return amyg.a;
        }
        anab anab = new anab(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            amzy a2 = amzy.a((Collection) entry.getValue());
            if (!a2.isEmpty()) {
                anab.a(key, a2);
                i += a2.size();
            }
        }
        return new anaa(anab.a(), i);
    }

    public final void b(Object obj, Object obj2) {
        amxg.a(obj, obj2);
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Map map = this.a;
            Collection c = c();
            map.put(obj, c);
            collection = c;
        }
        collection.add(obj2);
    }
}
