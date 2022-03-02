package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: ance  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ance {
    public static int a(Iterator it, int i) {
        boolean z;
        amrl.a((Object) it);
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int b(Iterator it, amrm amrm) {
        amrl.a((Object) amrm, (Object) "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (amrm.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Iterator c(Iterator it) {
        return new anbz(it);
    }

    public static Object d(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    static Object e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void f(Iterator it) {
        amrl.a((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Object g(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object b(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static void c(Iterator it, amrm amrm) {
        amrl.a((Object) amrm);
        while (it.hasNext()) {
            if (amrm.a(it.next())) {
                it.remove();
            }
        }
    }

    public static anhj a(Iterator it) {
        amrl.a((Object) it);
        if (it instanceof anhj) {
            return (anhj) it;
        }
        return new anbt(it);
    }

    public static anhj a(Iterator it, amrm amrm) {
        amrl.a((Object) it);
        amrl.a((Object) amrm);
        return new anbv(it, amrm);
    }

    public static Iterator a(Iterator it, amqy amqy) {
        amrl.a((Object) amqy);
        return new anbw(it, amqy);
    }

    public static Object b(Iterator it, Object obj) {
        return it.hasNext() ? d(it) : obj;
    }

    public static Iterator a(Iterator it, Iterator it2) {
        amrl.a((Object) it);
        amrl.a((Object) it2);
        return c(new anbu(new Iterator[]{it, it2}));
    }

    public static boolean a(Collection collection, Iterator it) {
        amrl.a((Object) collection);
        amrl.a((Object) it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static boolean a(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Iterator it, Collection collection) {
        amrl.a((Object) collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
