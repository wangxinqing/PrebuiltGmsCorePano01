package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: q  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class q {
    final Map a = new HashMap();
    final Map b;

    public q(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            ac acVar = (ac) entry.getValue();
            List list = (List) this.a.get(acVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(acVar, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void a(List list, aj ajVar, ac acVar, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                r rVar = (r) list.get(size);
                try {
                    int i = rVar.a;
                    if (i == 0) {
                        rVar.b.invoke(obj, new Object[0]);
                    } else if (i != 1) {
                        rVar.b.invoke(obj, new Object[]{ajVar, acVar});
                    } else {
                        rVar.b.invoke(obj, new Object[]{ajVar});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
