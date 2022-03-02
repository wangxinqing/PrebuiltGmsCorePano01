package defpackage;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: clg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clg extends SparseArray implements Iterable {
    public final int a(int i, Object obj) {
        if (obj != null) {
            Set set = (Set) get(i);
            if (set == null) {
                HashSet hashSet = new HashSet();
                append(i, hashSet);
                hashSet.add(obj);
                return 2;
            } else if (set.add(obj)) {
                return 1;
            }
        }
        return 0;
    }

    public final int b(int i, Object obj) {
        Set set = (Set) get(i);
        if (set == null || !set.remove(obj)) {
            return 0;
        }
        if (!set.isEmpty()) {
            return 3;
        }
        remove(i);
        return 4;
    }

    public final Iterator iterator() {
        return new clf(this);
    }

    public final boolean a() {
        return size() == 0;
    }
}
