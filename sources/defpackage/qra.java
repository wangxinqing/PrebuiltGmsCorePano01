package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: qra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qra {
    public static Set a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qrf qrf = (qrf) it.next();
            Long l = qrf.a;
            Long l2 = qrf.b;
            if (!hashMap.containsKey(l)) {
                hashMap.put(l, l2);
            } else if (l2.longValue() > ((Long) hashMap.get(l)).longValue()) {
                hashMap.put(l, l2);
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashSet.add(new qrf((Long) entry.getKey(), (Long) entry.getValue()));
        }
        return hashSet;
    }
}
