package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: iko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iko {
    public static Set a(Set set, Set set2) {
        iva.a((Object) set);
        iva.a((Object) set2);
        HashSet hashSet = new HashSet(set);
        hashSet.addAll(set2);
        return hashSet;
    }

    public static Set b(Set set, Set set2) {
        iva.a((Object) set);
        iva.a((Object) set2);
        HashSet hashSet = new HashSet();
        for (Object next : set) {
            if (!set2.contains(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }
}
