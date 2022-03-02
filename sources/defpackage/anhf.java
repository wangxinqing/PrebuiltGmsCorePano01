package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: anhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anhf {
    public static Collection a(Collection collection, Object obj) {
        return new angw(collection, obj);
    }

    public static Collection b(Collection collection, Object obj) {
        if (collection instanceof SortedSet) {
            return a((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return a((Set) collection, obj);
        }
        if (collection instanceof List) {
            return a((List) collection, obj);
        }
        return a(collection, obj);
    }

    public static List a(List list, Object obj) {
        return list instanceof RandomAccess ? new anhc(list, obj) : new angx(list, obj);
    }

    static Set a(Set set, Object obj) {
        return new anhd(set, obj);
    }

    public static SortedSet a(SortedSet sortedSet, Object obj) {
        return new anhe(sortedSet, obj);
    }
}
