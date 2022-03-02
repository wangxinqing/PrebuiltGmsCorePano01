package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ahq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahq {
    public final ou a = new ou();
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final or d = new or(10);

    public final void a(Object obj) {
        if (!this.a.containsKey(obj)) {
            this.a.put(obj, (Object) null);
        }
    }

    public final List b(Object obj) {
        return (List) this.a.get(obj);
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.a.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
