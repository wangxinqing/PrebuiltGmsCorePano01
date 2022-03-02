package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: angm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class angm {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static angk b(Set set, Set set2) {
        amrl.a((Object) set, (Object) "set1");
        amrl.a((Object) set2, (Object) "set2");
        return new ange(set, set2);
    }

    public static angk c(Set set, Set set2) {
        amrl.a((Object) set, (Object) "set1");
        amrl.a((Object) set2, (Object) "set2");
        return new angg(set, set2);
    }

    public static angk d(Set set, Set set2) {
        amrl.a((Object) set, (Object) "set1");
        amrl.a((Object) set2, (Object) "set2");
        return new angi(set, set2);
    }

    public static CopyOnWriteArraySet e() {
        return new CopyOnWriteArraySet();
    }

    public static angk a(Set set, Set set2) {
        amrl.a((Object) set, (Object) "set1");
        amrl.a((Object) set2, (Object) "set2");
        return new angc(set, set2);
    }

    public static Set b() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static LinkedHashSet c() {
        return new LinkedHashSet();
    }

    public static Set d() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static HashSet a() {
        return new HashSet();
    }

    public static HashSet a(int i) {
        return new HashSet(anet.b(i));
    }

    public static HashSet a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet a = a();
        ance.a((Collection) a, it);
        return a;
    }

    public static HashSet a(Object... objArr) {
        HashSet a = a(objArr.length);
        Collections.addAll(a, objArr);
        return a;
    }

    public static NavigableSet a(NavigableSet navigableSet) {
        return ((navigableSet instanceof amzn) || (navigableSet instanceof angl)) ? navigableSet : new angl(navigableSet);
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException e) {
            }
        }
        return false;
    }

    static boolean a(Set set, Collection collection) {
        amrl.a((Object) collection);
        if (collection instanceof anfc) {
            collection = ((anfc) collection).d();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return a(set, collection.iterator());
        }
        return ance.a(set.iterator(), collection);
    }

    static boolean a(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
